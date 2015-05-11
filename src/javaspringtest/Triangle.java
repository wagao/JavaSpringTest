/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaspringtest;

import java.util.List;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;

/**
 *
 * @author Emma
 */
public class Triangle implements InitializingBean, DisposableBean {
    private List<Point> points;
    private ApplicationContext context=null;
    
    @Override
    public void destroy() throws Exception {
        System.out.println("Destory triangle");
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }    
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("ini for triangle");
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void myInit(){      
          System.out.println("ini from xml named method");
    }
    public void myDestory(){      
          System.out.println("clean from xml named method");
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
