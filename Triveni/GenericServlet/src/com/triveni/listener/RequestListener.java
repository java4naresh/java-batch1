package com.triveni.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

/**
 * Application Lifecycle Listener implementation class RequestListener
 *
 */
public class RequestListener implements ServletRequestListener {

    /**
     * Default constructor. 
     */
    public RequestListener() {
    	System.out.println("Servlet Request Created");
    }

	/**
     * @see ServletRequestListener#requestDestroyed(ServletRequestEvent)
     */
    public void requestDestroyed(ServletRequestEvent arg0)  { 
    	System.out.println("Servlet Request Destroyed");
    }

	/**
     * @see ServletRequestListener#requestInitialized(ServletRequestEvent)
     */
    public void requestInitialized(ServletRequestEvent req)  { 
    	System.out.println(req.getServletRequest().getParameter("empName"));
    }
	
}
