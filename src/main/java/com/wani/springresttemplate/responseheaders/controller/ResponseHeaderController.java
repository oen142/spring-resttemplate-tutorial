package com.wani.springresttemplate.responseheaders.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/single-response-header")
public class ResponseHeaderController {

    @GetMapping("/http-servlet-response")
    public String usingHttpServletResponse
}
