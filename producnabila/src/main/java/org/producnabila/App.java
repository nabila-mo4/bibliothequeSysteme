package org.producnabila;

import org.librarypro.webservice.business.contract.ManagerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext vApplicationContext
        = new ClassPathXmlApplicationContext("classpath:/bootstrapContext.xml");
        
        ManagerFactory managerFactory = (ManagerFactory) vApplicationContext.getBean("managerFactory");

        System.out.println( "Hello World!" );
        
    }
}
