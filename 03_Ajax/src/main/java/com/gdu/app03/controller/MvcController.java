package com.gdu.app03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MvcController {
	@RequestMapping("/")
	public String welcome() {
		return "index";
	}
	@RequestMapping("/first.do")
	public String first() {
		return "first";
	}
	@RequestMapping("/second.do")
	public String second() {
		return "second";
	}
	@RequestMapping("/third.do")
	public String third() {
		return "third";
	}
	@RequestMapping("/fourth.do")
	public String fourth() {
		return "fourth";
	}
	@RequestMapping("/fifth.do")
	public String fifth() {
		return "fifth";
	}
}
