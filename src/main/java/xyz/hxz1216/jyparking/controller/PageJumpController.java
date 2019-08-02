package xyz.hxz1216.jyparking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageJumpController {
	@RequestMapping("/toRegdit")
	public String regdit(){
		return "reception/regdit";
	}
}
