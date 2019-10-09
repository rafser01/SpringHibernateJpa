package io.bitsofts.hibernatewithmaven;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.j2ee.dao.ProductService;
import com.j2ee.dao.ProductServiceImpJpa;
import com.j2ee.dao.ProductServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Administrator
 */
public class MainClass {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("./beans.xml");
//        ProductService ps = context.getBean("productService", ProductServiceImpl.class);
//        System.out.println(ps.getProducts().size());
        ProductService ps = (ProductService) context.getBean("jpaService");
        System.out.println("---------- "+ps.getProducts().get(0).getName());
    }
    
}
