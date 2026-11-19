package com.tap.SpringCore;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    	
//     	CargoPlane cp = context.getBean(CargoPlane.class);
//     	System.out.println(cp);
     	
     	PassengerPlane pp = (PassengerPlane)context.getBean("pp");
     	System.out.println(pp);
    	
 //   	CargoPlane cp = context.getBean(CargoPlane.class);
  //  	System.out.println(cp);
    	
//    	CargoPlane cp1 = (CargoPlane)context.getBean("cp");
//    	CargoPlane cp2 = (CargoPlane)context.getBean("cp");
//    	CargoPlane cp3 = (CargoPlane)context.getBean("cp");

 //   	System.out.println(cp1);
//    	System.out.println(cp2);
 //   	System.out.println(cp3);

    }
}
