package com.baidu.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baidu.bean.Order;

public interface OrderDao extends JpaRepository<Order, Long>{

}
