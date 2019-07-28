package com.imooc.sell.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.imooc.sell.dto.WexinAccessTokenResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Li Yan
 * 2019/7/28 22:45
 */
@RestController
@RequestMapping("/weixin")
@Slf4j
public class WeixinController {

    @GetMapping("/auth")
    public void auth(@RequestParam("code") String code) throws Exception {
        log.info("into authorize...");
        log.info("code:{}", code);
        String url = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=wxf018390ab5730423&secret=63961f2bdbcf93837acb4808bcd0d422&code=" + code + "&grant_type=authorization_code";
        RestTemplate restTemplate = new RestTemplate();
        String responseString = restTemplate.getForObject(url, String.class);
        log.info("responseString:{}", responseString);
        ObjectMapper objectMapper = new ObjectMapper();
        WexinAccessTokenResponse wexinAccessTokenResponse = objectMapper.readValue(responseString, WexinAccessTokenResponse.class);

        String getUserInfoUrl = "https://api.weixin.qq.com/sns/userinfo?access_token=" + wexinAccessTokenResponse.getAccess_token() + "&openid=" + wexinAccessTokenResponse.getOpenid();
        String userInfoString = restTemplate.getForObject(getUserInfoUrl, String.class);
        log.info("userInfoString:{}", userInfoString);
    }
}
