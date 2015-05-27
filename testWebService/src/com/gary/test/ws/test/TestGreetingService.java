package com.gary.test.ws.test;  
  
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;  
  
import com.gary.test.ws.service.GreetingService;  
  
public class TestGreetingService {  
    //git 2015-5-27 ��һ���޸�
    public static void main(String[] args) {  
        //����WebService�ͻ��˴�����  
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();  
        //ע��WebService�ӿ�  
        factory.setServiceClass(GreetingService.class);  
        //����WebService��ַ  
        factory.setAddress("http://localhost:8088/testWebService/GreetingService");  
        GreetingService greetingService = (GreetingService)factory.create();  
        System.out.println("invoke webservice...");  
        System.out.println("message context is:"+greetingService.greeting("���userName"));     
    }  
} 