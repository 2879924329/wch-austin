package com.wch.austin.pojo;

import lombok.Builder;
import lombok.Data;

import java.util.Set;

/**
 * @author wch
 * @version 1.0
 * @date 2022/6/15 21:01
 */
@Data
@Builder
public class SmsParam {

    /**
     * 需要发送的手机号
     */
    private Set<String> phones;

    /**
     * 发送文案
     */
    private String content;
}
