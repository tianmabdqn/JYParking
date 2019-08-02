package xyz.hxz1216.jyparking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * 默认欢迎页面
 */
@Controller
public class WelcomeController {
	/**
	 * 默认跳转登陆页面，并验证是否存在用户登陆账号和用户登录密码
	 * @param request
	 * @param session
	 * @return
	 */
	@RequestMapping({"/","index.html","/welcome.html"})
	public String toWelcome(HttpServletRequest request, HttpSession session){
		//获取cookie数组
		Cookie [] cookies = request.getCookies();
		//如果cookies数组为空直接返回到登录页面
		if(cookies ==null){
			return "login";
		}
		//如果不为空循环遍历验证
		for (Cookie cookie :cookies) {
			//验证登录名是否存在如果存在保存在session域
			if("loginName".equals(cookie.getName())){
				session.setAttribute("loginName",cookie.getValue());
			}
			//验证登陆密码是否存在，如果存在保存在session域
			if("loginPassword".equals(cookie.getName())){
				session.setAttribute("loginPassword",cookie.getValue());
			}
		}
		//返回登录页面
		return "reception/login";
	}

}
