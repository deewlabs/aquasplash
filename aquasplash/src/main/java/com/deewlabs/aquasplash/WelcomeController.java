//package com.deewlabs.aquasplash;
//
//import java.io.IOException;
//import java.io.InputStream;
//
//import javax.servlet.http.HttpServletResponse;
//
//import org.apache.tomcat.util.http.fileupload.IOUtils;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.servlet.ModelAndView;
//
//@Controller
//public class WelcomeController {
//
//private static Logger logger=LoggerFactory.getLogger(WelcomeController.class);
//
//	
//	@RequestMapping("/")
//	public String welcome() {
//		//System.out.println("Amit Welcome site called");
//		return "aqua";
//	}
//	
//	@RequestMapping("/aqua")
//	public String aqua() {
//		//System.out.println("Amit Welcome site called");
//		return "aqua";
//	}
//	
//	@RequestMapping("/gallery")
//	public String gallery() {
////		System.out.println("Gallery Action");
//		return "gallery";
//	}
//	
//	@RequestMapping("/pack")
//	public String packages() {
////		System.out.println("packages action");
//		return "pack";
//	}
//	@RequestMapping("/about")
//	public String about() {
//		return "about";
//	}
//	@RequestMapping("/contact")
//	public String contacts() {
//		return "contact";
//	}
//	@RequestMapping("/activities")
//	public String activites(){
//		return "activities";
//	}
//	
//	
//	@RequestMapping(value = {"/robots", "/robot", "/robot.txt", "/robots.txt", "/null"})
//	public void robot(HttpServletResponse response) {
//	 
//	    InputStream resourceAsStream = null;
//	    try {
//	 
//	        ClassLoader classLoader = getClass().getClassLoader();
//	        resourceAsStream = classLoader.getResourceAsStream("robot.txt");
//	 
//	        response.addHeader("Content-disposition", "filename=robot.txt");
//	        response.setContentType("text/plain");
//	        IOUtils.copy(resourceAsStream, response.getOutputStream());
//	        response.flushBuffer();
//	    } catch (Exception e) {
//	        logger.error("Problem with displaying robot.txt", e);
//	    } finally {
//	    	try {
//				resourceAsStream.close();
//			} catch (IOException e) {
//				logger.error("ERROR",e);
//			}
//	       // InputStreamUtil.close(resourceAsStream);
//	    }
//	}
//	
////	@RequestMapping("/amit*")
////	public String allpackage(){
////		return "radius";
////	}
////	@RequestMapping("/detail1*")
////	public String detail1(){
////		return "detail1";
////	}
////	@RequestMapping("/detail2*")
////	public String detail2(){
////		return "detail2";
////	}
////	@RequestMapping("/ampack*")
////	public String radpack(){
////		return "radiuspack";
////	}
//
////	@RequestMapping(value = "/notify", method = RequestMethod.POST )
////	public String notifyAdmin(){
////		System.out.println("NOtfiedj lksj slj hahaha jklj lkaj a");
////		ModelAndView mav = new ModelAndView("contact");
////		return "aqua";
////	}
//}
