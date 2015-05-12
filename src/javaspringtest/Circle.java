/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaspringtest;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;

/**
 *
 * @author Emma
 */
@Controller
public class Circle implements Shape, ApplicationEventPublisherAware{

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher Publisher) {
        this.aep = Publisher;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Point center;
    private ApplicationEventPublisher aep;
    

    public ApplicationEventPublisher getAep() {
        return aep;
    }

    public void setAep(ApplicationEventPublisher aep) {
        this.aep = aep;
    }
    
    @Autowired
    private MessageSource messageSource;

    public MessageSource getMessageSource() {
        return messageSource;
    }

    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }



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
        System.out.println(this.messageSource.getMessage("drawing.c",null,"default Drawing",null));
        System.out.println(this.messageSource.getMessage("drawing.point", new Object[]{center.getX(), center.getY()},"default Drawing",null));
        DrawEvent newE=new  DrawEvent(this);
        aep.publishEvent(newE);
        
//        center.draw();
//        System.out.println(this.messageSource.getMessage("greetings",null, "Default",null));
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
