package com.example.rent591.config;

import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

/**
 * Created with IntelliJ IDEA.
 * User: ChiYuan
 * Date: 2021/03/25 上午 11:03
 * To change this template use File | Settings | File Templates.
 */
@Configuration
public class SSLConfig {

    @PostConstruct
    private void configureSSL() {

        System.setProperty("https.protocols", "TLSv1.2");
    }
}