package com.stan.demo.service;

import com.stan.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author：stanzeng
 * @Description：
 * @Date ：Created in 2020/9/26 12:51 下午
 * @Modified By：
 */
@Component
public class IndexService {
	@Autowired
	private UserService userService;
	
	public IndexService(){
		System.out.println("IndexService constructor");
	}

	public UserService getUserService() {
		return userService;
	}
}
