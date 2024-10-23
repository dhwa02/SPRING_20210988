package com.example.demo.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

@ControllerAdvice
public class BlogControllerAdvice {

    // PathVariable이 Long 타입이 아닌 경우 예외 처리
    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public String handleTypeMismatchException() {
        return "/error_page/article_error_1"; // 간단히 에러 페이지로 연결
    }
}
