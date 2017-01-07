package com.mycode.springapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycode.beans.Brand;
import com.mycode.beans.Team;
import com.mycode.service.ServiceBrand;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Team team = new Team();
        team.setName("");
        
        ApplicationContext appContext = new ClassPathXmlApplicationContext("com/mycode/xml/beans.xml");
        
        ServiceBrand sb = (ServiceBrand)appContext.getBean("serviceBrandImpl");
        
        try{
        	sb.register(brand);
        }catch(Exception e){
        	System.out.println(e.getMessage());
        }
        
        ((ConfigurableApplicationContext)appContext).close();
    }
}
