package com.my.column.controller.rest;

import io.github.asleepyfish.util.OpenAiUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ChatgptController {
    @GetMapping({"/chatPage", "/chatPage.html"})
    public String chatPage() {
        return "chatPage";
    }

    @PostMapping("/chat")
    @ResponseBody
    public List<String> chatTest(@RequestBody String content) {
        return OpenAiUtils.createChatCompletion(content, "testUser");
    }
}
