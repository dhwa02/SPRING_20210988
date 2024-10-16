// 모든 코드 주석처리

// package com.example.demo.controller;

// import com.example.demo.model.domain.Article;
// import com.example.demo.model.service.AddArticleRequest;
// import com.example.demo.model.service.BlogService;
// import lombok.RequiredArgsConstructor;
// import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.ModelAttribute;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.GetMapping;

// @RequiredArgsConstructor
// @Controller // @Controller + @ResponseBody
// public class BlogRestController {
//     private final BlogService blogService;

//     @PostMapping("/api/articles")
//     public String addArticle(@ModelAttribute AddArticleRequest request) {
//         Article saveArticle = blogService.save(request);
//         return "redirect:/article_list";
//     }

//     @GetMapping("/favicon.ico")
//     public void favicon() {
//         // 아무 작업도 하지 않음
//     }
// }