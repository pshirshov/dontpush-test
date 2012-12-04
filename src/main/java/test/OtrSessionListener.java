package test;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public final class OtrSessionListener implements ServletContextListener,
        HttpSessionListener, HttpSessionAttributeListener {

    // Public constructor is required by servlet spec
    public OtrSessionListener() {
    }

    // -------------------------------------------------------
    // ServletContextListener implementation
    // -------------------------------------------------------
    @Override
    public void contextInitialized(final ServletContextEvent sce) {
        /* This method is called when the servlet context is
           initialized(when the Web application is deployed).
           You can initialize servlet context related data here.
        */
    }

    @Override
    public void contextDestroyed(final ServletContextEvent sce) {
        /* This method is invoked when the Servlet Context
           (the Web application) is undeployed or
           Application Server shuts down.
        */
    }

    // -------------------------------------------------------
    // HttpSessionListener implementation
    // -------------------------------------------------------
    @Override
    public void sessionCreated(final HttpSessionEvent se) {

    }

    @Override
    public void sessionDestroyed(final HttpSessionEvent se) {
    }

    // -------------------------------------------------------
    // HttpSessionAttributeListener implementation
    // -------------------------------------------------------

    @Override
    public void attributeAdded(final HttpSessionBindingEvent sbe) {
        /* This method is called when an attribute
           is added to a session.
        */
    }

    @Override
    public void attributeRemoved(final HttpSessionBindingEvent sbe) {
        /* This method is called when an attribute
           is removed from a session.
        */
    }

    @Override
    public void attributeReplaced(final HttpSessionBindingEvent sbe) {
        /* This method is invoked when an attibute
           is replaced in a session.
        */
    }
}
