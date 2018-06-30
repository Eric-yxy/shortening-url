package com.wosai.shortUrl.domain;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by ericyang on 2018/6/29.
 */
public interface UrlMappingRepository extends JpaRepository<UrlMapping, String>{

}
