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
    private int height;

    Triangle(){
    }
    Triangle(String edges){
        this.edges = edges;
    }
    Triangle(String type, int h){
        this.type = type;
        this.height = h;
    }
    Triangle(String type, String edges){
        this.type = type;
        this.edges = edges;
    }
    
    Triangle(String type, int h, String edges){
        this.type = type;
        this.edges = edges;
        this.height = h;
    }
    
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public void draw(){
         System.out.println("Draw TriType:"+ height);
    if(edges!=null) System.out.println("how many edges you have?\n  A:"+ this.edges );
    if(type!=null) System.out.println("Draw TriType:"+ getType());
    }
}
