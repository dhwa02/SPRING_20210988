package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.demo.model.domain.TestDB;
import com.example.demo.model.service.TestService;




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

    @GetMapping("/about_detailed")
    public String about() {
        return "about_detailed";
    }

    @GetMapping("/test1")
    public String thymeleaf_test1(Model model) {
        model.addAttribute("data1", "<h2> 반갑습니다 <h2>");
        model.addAttribute("data2", "태그의 속성 값");
        model.addAttribute("link", 01);
        model.addAttribute("name", "설동화");
        model.addAttribute("para1", "001");
        model.addAttribute("para2", 002);
        return "thymeleaf_test1";
    }

    @Autowired
    private TestService testService;
    
    @GetMapping("/testdb")
    public String getAllTestDBs(Model model) {
        TestDB test = testService.findByName("설동화");
        model.addAttribute("data4", test);
        TestDB test1 = testService.findByName("김철수");
        model.addAttribute("data5", test1);
        TestDB test2 = testService.findByName("아저씨");
        model.addAttribute("data6", test2);
        System.out.println("데이터 출력 디버그 : " + test);
        System.out.println("데이터 출력 디버그 : " + test1);
        System.out.println("데이터 출력 디버그 : " + test2);
        return "testdb";
    }

    // @GetMapping("/article_list")
    // public String article_list() {
    //     return "article_list";
    // }
    
}

