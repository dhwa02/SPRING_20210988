package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller // 컨트롤러 어노테이션 명시
public class DemoController {
    @GetMapping("/hello") // 전송 방식 GET
    public String hello(Model model) {
    model.addAttribute("data", "반갑습니다."); // model 설정
    return "hello"; // hello.html 연결
    }

    @GetMapping("/hello2")
    public String hello2(Model model) {
    model.addAttribute("data", "설동화님."); // model 설정
    model.addAttribute("data1", "반갑습니다."); // model 설정
    model.addAttribute("data2", "오늘."); // model 설정
    model.addAttribute("data3", "날씨는."); // model 설정
    model.addAttribute("data4", "매우 좋습니다."); // model 설정
    return "hello2";
    }
}