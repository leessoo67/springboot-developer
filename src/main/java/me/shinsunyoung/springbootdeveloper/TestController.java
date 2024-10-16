package me.shinsunyoung.springbootdeveloper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import me.shinsunyoung.springbootdeveloper.Member; // 데이터 모델을 위한 Member 클래스 임포트
import java.util.List;

@RestController
public class TestController {

    @Autowired // Controller가 Service의 빈 주입을 받으면서 비즈니스 로직을 불러와 이용할 수 있게 됨.
    TestService testService;

    @GetMapping("/test")
    public List<Member> getAllMembers() {
        List<Member> members = testService.getAllMembers(); // 올바른 Member 클래스 사용
        return members;
    }
}
