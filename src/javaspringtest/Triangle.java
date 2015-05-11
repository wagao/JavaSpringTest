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
public class Triangle implements Shape {
    private List<Point> points;
    private ApplicationContext context=null;

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }
    
    public void draw(){
        System.out.print("this is a triangle with points: ");
        for(Point point: points)
            point.draw();
    }
}
