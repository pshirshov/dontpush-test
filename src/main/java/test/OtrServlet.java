package test;

import com.vaadin.Application;
import com.vaadin.ui.Window;
import org.vaadin.dontpush.server.DontPushOzoneServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.io.BufferedWriter;
import java.io.IOException;

@SuppressWarnings("serial")
public final class OtrServlet extends DontPushOzoneServlet {
    public OtrServlet() {
    }

    @Override
    protected void writeAjaxPageHtmlVaadinScripts(final Window window
            , final String themeName
            , final Application application
            , final BufferedWriter page
            , final String appUrl
            , final String themeUri
            , final String appId
            , final HttpServletRequest request
    ) throws ServletException, IOException
    {
        super.writeAjaxPageHtmlVaadinScripts(window, themeName, application, page, appUrl, themeUri, appId, request);
    }

    @Override
    public void destroy() {
        super.destroy();
    }
}
