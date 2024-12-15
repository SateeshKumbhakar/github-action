package com.self.git.github_action.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("start")

public class BasicActionController {

    @GetMapping("/ping")
    public  ResponseEntity<String> ping(){
        return ResponseEntity.ok("tested success");
    }

}
