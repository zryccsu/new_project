package com.baidu.service.servicelmpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baidu.bean.Person;
import com.baidu.dao.PersonMapper;
import com.baidu.service.PersonService;

@Service
public class PersonServicelmpl implements PersonService{
	@Autowired
	private PersonMapper personMapper;

	@Override
	public List<Person> getAllPerson() {
		return personMapper.selectByExample(null);
	}
}
