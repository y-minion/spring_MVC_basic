package hello.servlet.web.servletmvc;


import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "mvcMemberFormServlet", urlPatterns = "/servlet-mvc/members/new-form")
public class MvcMemberFormServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //컨트롤러에서 뷰로 넘길때 필요한 뷰의 경로 변수
        String viewPath = "/WEB-INF/views/new-form.jsp";

        //경로 변수를 인자로 넘기면 해당 경로에 대항하는 디스패처를 얻을 수 있다.
        RequestDispatcher dispatcher = req.getRequestDispatcher(viewPath);

        //이제 컨트롤러에서 뷰로 넘길 차례다. 이때 서블렛을 통해 얻은 응답,요청 객체를 같이 넘겨준다.
        dispatcher.forward(req, resp);

    }
}
