/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaspringtest;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Emma
 */
public class JavaSpringTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Triangle tri = new Triangle();
//        BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
//        Triangle triObj = (Triangle) factory.getBean("triangle");
        
//        ApplicationContext context = new ClassPathXmlApplicationContext("file:spring.xml");
//        file: preffix point to file system resources, not classpath.
//        file path can be relative or system (/home/user/Work/src...)
        
        
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        context.registerShutdownHook();
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Triangle triObj = (Triangle) context.getBean("triangle");
        triObj.draw();
        
        
        Triangle triObj2 = (Triangle) context.getBean("triangleinit");
        triObj2.draw();
        
    }
    
}
