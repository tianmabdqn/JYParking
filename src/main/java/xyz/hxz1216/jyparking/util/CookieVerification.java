package xyz.hxz1216.jyparking.util;

import xyz.hxz1216.jyparking.model.User;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

public class CookieVerification {



	/**
	 * 校验cookie对象是否存在登录名和密码
	 * @param user
	 * @return
	 */
	public List verification(User user,HttpServletRequest request) {
		List list = new ArrayList();
		Cookie[] cooki = request.getCookies();
		//Cookie检验
		if (cooki != null) {
			for (Cookie cookie : cooki) {
				if (cookie.getName() == "loginName") {
					if (cookie.getValue().equals(user.getLoginName())) {
						list.add(0, cookie.getValue());
					}
				}
				if (cookie.getName() == "loginPassword") {
					if (cookie.getValue().equals(user.getLoginPassword())) {
						list.add(1, cookie.getValue());
						return list;
					}
				}
			}
		}
		return list;
	}

	/**
	 * 添加登录名和密码到cookie对象
	 * @param loginName
	 * @param loginPassword
	 */
	public void addCoookieUser(HttpServletResponse response,String loginName,String loginPassword){
		//添加登录名到cookie对象
		Cookie loginNameCookie = new Cookie("loginName",loginName.trim());
		//设置保存时间为一天
		loginNameCookie.setMaxAge(24*60*60);
		//设置路径
		loginNameCookie.setPath("/");
		//输出到客户端
		response.addCookie(loginNameCookie);
		//添加用户密码到cookie对象
		Cookie loginPasswordCookie = new Cookie("loginPassword",loginPassword.trim());
		//设置保存时间为一天
		loginPasswordCookie.setMaxAge(24*60*60);
		//设置路径
		loginPasswordCookie.setPath("/");
		//输出到客户端
		response.addCookie(loginPasswordCookie);
	}

	/**
	 * 删除用户名密码cookie记录
	 */
	public void delCookieUser(HttpServletResponse response,HttpServletRequest request){
		//获取cookies数组
		Cookie [] cookies = request.getCookies();
		//循环查找cookis数组里的值
		for (Cookie cookie:cookies) {
			//比对cookies数组里的键
			if(cookie.getName().equals("loginName")){
				//设置登录值为null
				cookie.setValue(null);
				//立即销毁
				cookie.setMaxAge(0);
				//设置路径
				cookie.setPath("/");
				//输出到客户端
				response.addCookie(cookie);
			}
			//比对cookies数组里的键
			if(cookie.getName().equals("loginPassword")){
				//设置登录密码值为null
				cookie.setValue(null);
				//立即销毁
				cookie.setMaxAge(0);
				//设置路径
				cookie.setPath("/");
				//输出到客户端
				response.addCookie(cookie);
			}
		}


	}


}
