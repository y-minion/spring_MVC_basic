package hello.servlet.basic;

import lombok.Getter;
import lombok.Setter;

//JSON API통신에서 사용될 데이터 구조
@Getter @Setter
public class HelloData {

    private String username;
    private int age;


}
