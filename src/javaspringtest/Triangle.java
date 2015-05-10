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
    private String type;
    private String edges;

    Triangle(){
    }
    Triangle(String edges){
        this.edges = edges;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public void draw(){
    if(edges!=null) System.out.println("how many edges you have?\n  A"+ this.edges );
    if(type!=null) System.out.println("this is a triangle with type "+ getType());
    }
}
