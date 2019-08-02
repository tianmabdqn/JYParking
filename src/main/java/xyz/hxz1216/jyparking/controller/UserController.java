package xyz.hxz1216.jyparking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import xyz.hxz1216.jyparking.mapper.UserMapper;
import xyz.hxz1216.jyparking.model.User;
import xyz.hxz1216.jyparking.util.CookieVerification;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class UserController {
	@Resource
	UserMapper userMapper;

	CookieVerification cookieVerification = new CookieVerification();

	@RequestMapping("/toIndex.html")
	public String LoginVerification(){
		return "reception/index";
	}

	/**
	 * 登录验证，并验证是否保存账号密码
	 * @param userName
	 * @param password
	 * @param request
	 * @param response
	 * @param isUseCookies
	 * @return
	 */
	@RequestMapping("/login")
	public String toLogin(String userName, String password, HttpServletRequest  request, HttpServletResponse response,String isUseCookies){
		//校验登录账号和密码
		User user = userMapper.loginVerificationByPwdAndLoginName(userName,password);

		if(user!=null){
			if(null != isUseCookies && isUseCookies.length()>0){
				//当用户点击记住我时把密码和账号保存cookie里
				cookieVerification.addCoookieUser(response,user.getLoginName(),user.getLoginPassword());
			}
			//校验成功返回主页面
			return "reception/index";
		}else{
			//如果登录校验失败返回登录页面+
			return "reception/login";
		}
	}



}
