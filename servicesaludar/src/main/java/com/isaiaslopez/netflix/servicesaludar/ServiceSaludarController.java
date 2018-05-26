package com.isaiaslopez.netflix.servicesaludar;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceSaludarController {
	
	private static final String TEMPLATE = "Hola, %s %s IP: %s soy Docker!";

	private String serverAddress;
    
    @RequestMapping(value = "/saludar/{name}", method = RequestMethod.GET)
    public String saludar(@PathVariable("name") String name) {
    	try {
			serverAddress = InetAddress.getLocalHost().getHostAddress();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
        return String.format(TEMPLATE, name, "envía un saludo desde la", serverAddress) ;      
    }

}
