package com.zy.spring.ioc;

import com.zy.spring.ioc.entity.Company;
import com.zy.spring.ioc.entity.Computer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        Company company = context.getBean("company", Company.class);
        System.out.println(company);
        String website = company.getInfo().getProperty("website");
        String address = company.getInfo().getProperty("address");
        String phone = company.getInfo().getProperty("phone");
        System.out.println(website);
        System.out.println(address);
        System.out.println(phone);
        System.out.println("========================");
        //获取容器所有beanId数组
        String[] beanNames = context.getBeanDefinitionNames();
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
        System.out.println("-------------------");
        Computer computer0 = context.getBean("com.zy.spring.ioc.entity.Computer#0",Computer.class);
        System.out.println(computer0.getBrand());
        Computer computer1 = context.getBean("com.zy.spring.ioc.entity.Computer#1",Computer.class);
        System.out.println(computer1.getBrand());
    }
}
