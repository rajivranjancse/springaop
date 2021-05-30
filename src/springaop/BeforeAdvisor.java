/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springaop;


import java.lang.reflect.Method;  
import org.springframework.aop.MethodBeforeAdvice;  
public class BeforeAdvisor implements MethodBeforeAdvice{  
    @Override  
    public void before(Method method, Object[] args, Object target)throws Throwable {  
        System.out.println("additional concern before actual logic");  
    }  
}  
