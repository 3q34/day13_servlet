package cn.itcast.web.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * Created by cdx on 2019/10/22.
 * desc:
 */

@WebServlet("/demo1")
public class ServletDemo implements Servlet {
    private static final String TAG = "ServletDemo";

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("servletRequest = [" + servletRequest + "], servletResponse = [" + servletResponse + "]");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
