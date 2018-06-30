package com.wosai.shortUrl.bean.request;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Created by ericyang on 2018/6/29.
 */
@Data
@ToString
@EqualsAndHashCode
public class UrlShorteningRequest {
    private String url;
}
