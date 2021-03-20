package com.divya.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Application Lifecycle Listener implementation class ContextListener
 *
 */
public class ContextListener implements ServletContextListener
{

    /**
     * Default constructor. 
     */
    public ContextListener()
    {
        System.out.println("Servlet Context Created");
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)
    { 
         
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent context) 
    { 
         System.out.println("User Name:"+context.getServletContext().getInitParameter("userName"));
         System.out.println("Password:"+context.getServletContext().getInitParameter("password"));
    }
	
}
