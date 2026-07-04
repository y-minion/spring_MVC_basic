package hello.servlet.basic.reponse;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "responseHeaderServlet", urlPatterns = "/response-header")
public class ResponseHeaderServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //[status-line]
        resp.setStatus(HttpServletResponse.SC_OK); //200

        //[response-headers]
        resp.setHeader("Content-type", "text/plain;charset=utf-8");
        resp.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
        resp.setHeader("Pragma", "no-cache");
        resp.setHeader("my-header","hello");

        //[Header 편의 메서드]
        content(resp);
        cookie(resp);
        redirect(resp);

    }

    private void content(HttpServletResponse res){
        //Content-Type: text/plain;charset=utf-8
        //Content-Length: 2
        //response.setHeader("Content-Type", "text/plain;charset=utf-8");
        //위의 헤더 요소들을 작성해주는 메서드를 지원한다. 메서드 이름은 실제 헤더 요소와 비슷함
        res.setContentType("text/plain");
        res.setCharacterEncoding("utf-8");

    }

    private void cookie(HttpServletResponse res){
        //Set-Cookie: myCookie=good; Max-Age=600;
        //response.setHeader("Set-Cookie", "myCookie=good; Max-Age=600");
        Cookie cookie = new Cookie("myCookie", "good");
        cookie.setMaxAge(600); //600초
        res.addCookie(cookie);

    }

    private void redirect(HttpServletResponse res) throws IOException{
        //Status Code 302
        //Location: /basic/hello-form.html

        //response.setStatus(HttpServletResponse.SC_FOUND); //302
        //response.setHeader("Location", "/basic/hello-form.html");
        res.sendRedirect("/basic/hello-form.html");
    }
}
