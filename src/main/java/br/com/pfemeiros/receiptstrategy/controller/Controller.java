package br.com.pfemeiros.receiptstrategy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("receipts")
public class Controller {

    @GetMapping
    public String get() {
        return "Teste";
    }
    
}
