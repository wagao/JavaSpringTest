/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaspringtest;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;

/**
 *
 * @author Emma
 */
@Component
public class Circle implements Shape{
    private Point center;

    public Point getCenter() {
        return center;
    }
@PostConstruct
public void iniC(){
        System.out.print("after  ini ");
}

@PreDestroy
public void destroy(){
        System.out.print("pre destroy ");
}
//    @Required
//    @Autowired
//    @Qualifier("circleC")
//    @Resource(name="zeroPoint3")  
     @Resource // if there is no name , would looking for the member variable 
    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public void draw() {
        System.out.print("this is a circle with center ");
        center.draw();
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
