package hello.servlet.basic.request;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletInputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.util.StreamUtils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

@WebServlet(name = "requestBodyStringServlet", urlPatterns = "/request-body-string")
public class RequestBodyStringServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //HTTP요청의 BODY는 Byte 형식으로 스트림으로 들어온다. getInputStream을 통해 데이터를 받아주고,
        //스트림으로 받아온 데이터를 스트림 utils를 사용해서 Byte데이터를 문자열로 변환합니다.
        ServletInputStream inputStream = req.getInputStream();

        String messageBody = StreamUtils.copyToString(inputStream, StandardCharsets.UTF_8);


        System.out.println("messageBody = " + messageBody);

        resp.getWriter().write("ok");



    }
}
