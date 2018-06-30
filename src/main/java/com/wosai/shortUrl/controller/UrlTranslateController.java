package com.wosai.shortUrl.controller;

import com.wosai.shortUrl.bean.request.UrlShorteningRequest;
import com.wosai.shortUrl.domain.UrlMappingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartHttpServletRequest;

/**
 * Created by ericyang on 2018/6/29.
 */
@RestController
@RequestMapping(value = "/api/shortening")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UrlTranslateController {
    private final UrlMappingRepository urlMappingRepository;

    @ResponseBody
    @RequestMapping(value = "shortening" , method = RequestMethod.GET )
    public String shortenUrl(@RequestParam(name = "url") String originalUrl){
        return "a";
    }
}
