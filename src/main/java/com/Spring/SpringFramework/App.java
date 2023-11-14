package com.Spring.SpringFramework;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//Car obj=new Car();
    	
    //	ApplicationContext context =new ClassPathXmlApplicationContext("spring.xml");
//    	Vehicle obj=(Vehicle)context.getBean("bike");
//        obj.drive();
//    	Car obj=(Car) context.getBean("car");
//    	obj.drive();
//    	Tyre t=(Tyre) context.getBean("tyre");
//    	System.out.println(t);
    	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(VehicleConfigure.class);
    	Vehicle v=context.getBean("getCar",Vehicle.class);
    	v.drive();
    	System.out.println("hello");
   }
}
