package com.stan.demo;

import com.stan.demo.config.AppConfig;
import com.stan.demo.entity.User;
import com.stan.demo.service.IndexService;
import com.stan.demo.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.stream.Collectors;


//import org.springframework.context.ApplicationContext;

/**
 * @Author：stanzeng
 * @Description：
 * @Date ：Created in 2020/9/26 10:45 上午
 * @Modified By：
 */

public class Application {

	public static void main(String[] args) {
		System.out.println(111111);
		System.out.println(new User(1, "xpx"));
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

		System.out.println(Arrays.stream(ac.getBeanDefinitionNames()).collect(Collectors.joining("\n")));

		System.out.println(ac.getBean(IndexService.class).getUserService());

	}
}
