package com.imooc.sell.dto;

import lombok.Data;

/**
 * @author Li Yan
 * 2019/7/28 23:25
 */
@Data
public class WexinAccessTokenResponse {

    public String access_token;
    public String expires_in;
    public String refresh_token;
    public String openid;
    public String scope;
}
