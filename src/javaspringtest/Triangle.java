/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaspringtest;

/**
 *
 * @author Emma
 */
public class Triangle {
    private Point pointA;
    private Point pointB;
    private Point pointC;
    private String pointD;

    public String getPointD() {
        return pointD;
    }

    public void setPointD(String pointD) {
        this.pointD = pointD;
    }

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }
    
    public void draw(){
        pointA.draw();
        pointB.draw();
        pointC.draw();
        System.out.print(pointD);
    }
}
