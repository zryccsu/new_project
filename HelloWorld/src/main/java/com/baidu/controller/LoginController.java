package com.baidu.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.baidu.bean.Order;
import com.baidu.dao.OrderDao;

@Controller
public class LoginController {
	@RequestMapping({"/","/login"})
	public String login() {
		return "login";
	}
	
	@Autowired
	private OrderDao od;
	
	@PostMapping("/postJson")
	public @ResponseBody void postJson(@RequestBody Order order) {
		order.setDate(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		System.out.println(order.getId());
		System.out.println(order.getName());
		System.out.println(order.getDate());
		od.save(order);
	}
}
