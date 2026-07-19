package hello.servlet.web.frontcontroller.v1;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

//서블릿과 비슷한 모양의 컨트롤러 인터페이스를 만들었다. 앞으로 V1의 컨트롤러는 해당 인터페이스를 구현한다.
//프론트 컨트롤러는 이 인터페이스를 호출함으로써 구현과 관계없이 로직의 일관성을 가져갈 수 있다.
public interface ControllerV1 {
    void process(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException;
}
