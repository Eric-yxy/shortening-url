package com.wosai.shortUrl.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by ericyang on 2018/6/29.
 */
@RestController
@Slf4j(topic = "WebHook")
public class UrlRedirectController {
    @GetMapping("/a")
    public void redirect(HttpServletRequest request){

        log.info(request.getServletPath());
    }
}
