package com.wosai.shortUrl.domain;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by ericyang on 2018/6/29.
 */
@Data
@ToString
@Entity
@NoArgsConstructor
public class UrlMapping extends BasicDomain{
//    @Builder
//    public UrlMapping(String original_url , String short_url){
//        this.original_url = original_url;
//        this.short_url = short_url;
//    }

    @Column(columnDefinition = "varchar(500) default null comment '原始url'")
    private String original_url;

    @Column(columnDefinition = "varchar(100) default null comment '短链接'")
    private String short_url;

}
