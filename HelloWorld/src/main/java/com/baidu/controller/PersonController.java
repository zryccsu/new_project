package com.baidu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.baidu.bean.Person;
import com.baidu.service.PersonService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class PersonController {
	@Autowired
	private PersonService personService;
	@RequestMapping("/getAllPerson")
	public String getAllPerson(Model model,@RequestParam(defaultValue = "1",value = "pageNum") Integer pageNum) {
		PageHelper.startPage(pageNum,5);
		List<Person> list = personService.getAllPerson();
		PageInfo<Person> pageInfo = new PageInfo<Person>(list);
		model.addAttribute("pageInfo",pageInfo);
		return "list";
	}
}
