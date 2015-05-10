/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaspringtest;

import java.util.List;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 *
 * @author Emma
 */
public class Triangle implements ApplicationContextAware, BeanNameAware{
    private List<Point> points;
    private ApplicationContext context=null;

    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException { 
        this.context=context;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setBeanName(String beanName) {
        System.out.println("this is beanName:"+beanName);
//        this is executed before the obj
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }
    
    public void draw(){
        for(Point point: points)
            point.draw();
    }
}
