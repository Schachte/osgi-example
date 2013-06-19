package com.khubla.osgiexample.restlet.restlet;

import org.restlet.resource.Resource;

import com.khubla.osgiexample.restlet.service.HelloService;

/**
 * @author tome
 */
public class HelloServiceResource extends Resource {
   /**
    * the hello service
    */
   private static HelloService helloService;

   public static HelloService getHelloService() {
      return helloService;
   }

   public static void setHelloService(HelloService helloService) {
      HelloServiceResource.helloService = helloService;
   }

   public String sayHello() {
      if (null != helloService) {
         return helloService.sayHello();
      } else {
         return "helloService has not been bound";
      }
   }
}
