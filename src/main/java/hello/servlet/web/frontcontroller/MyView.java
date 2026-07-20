package hello.servlet.web.frontcontroller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

//해당 클래스는 컨트롤러에서 중복으로 viewPath를 정의하고 dispatcher를 얻고, 호출하는 중복을 방지하기 위한 장치임.
public class MyView {

    //viewPath를 생성자로 받아서 저장한다.
    private String viewPath;

    public MyView(String viewPath) {
        this.viewPath = viewPath;
    }

    //render함수를 호출하면 기존에 중복되던 dispatcher를 얻고, 뷰로 넘기는 로직을 해당 메서드에서 실행한다.
    public void render(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        //상태인 viewPath를 이용해서 dispatcher를 얻는다.
        RequestDispatcher dispatcher = req.getRequestDispatcher(viewPath);

        //뷰로 이동(렌더링)
        dispatcher.forward(req, res);
    }
}
