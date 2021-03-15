package com.github.yun.shiro.oauth2;

import org.apache.shiro.authc.AuthenticationException;

/**
 * @author Administrator
 * <p>Date:
 * <p>Version: 1.0
 */
public class OAuth2AuthenticationException extends AuthenticationException {

    public OAuth2AuthenticationException(Throwable cause) {
        super(cause);
    }
}
