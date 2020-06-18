package com.demo.mybatis.utils;

import java.util.HashMap;
import java.util.Map;

public class RestResponse extends HashMap<String, Object> {
    public RestResponse() {
        put("code", 0);
        put("msg", "success");
    }

    public static RestResponse success(String msg) {
        RestResponse restResponse = new RestResponse();
        restResponse.put("msg", msg);
        return restResponse;
    }

    public static RestResponse success(Map<String, Object> map) {
        RestResponse restResponse = new RestResponse();
        restResponse.put("data", map);
        return restResponse;
    }

    public static RestResponse success() {
        return new RestResponse();
    }

    @Override
    public RestResponse put(String key, Object value) {
        super.put(key, value);
        return this;
    }

}
