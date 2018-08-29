package com.dubbo.api;

import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 测试
 *
 * @author xuhualiang
 * @version V1.0
 * @date 2018/8/28 17:33
 */

@Service
public interface UserService {

    Map<String, Object> getUserInfo(int id);
}
