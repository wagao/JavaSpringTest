
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Emma
 */
public class DisplayNamePP implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object beanO, String beanName) throws BeansException {
        System.out.println("in after initPP "+ beanName);
        return beanO;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object postProcessAfterInitialization(Object beanO, String beanName) throws BeansException {
        System.out.println("in before initPP"+ beanName);
        return beanO;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
