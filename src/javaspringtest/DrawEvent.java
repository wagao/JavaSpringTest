/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaspringtest;

import org.springframework.context.ApplicationEvent;

/**
 *
 * @author Emma
 */
public class DrawEvent extends ApplicationEvent{
    public DrawEvent(Object source){
        super(source);
    }
    
    public String toString(){
        return "Draw Event Occured```";
    }
}
