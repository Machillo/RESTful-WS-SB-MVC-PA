package com.project.app.ws.security;

import org.springframework.core.env.Environment;

import com.project.app.ws.SpringApplicationContext;

public class SecurityConstants {

    public static final long EXPIRATION_TIME = 864000000; // 10 days
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";
    public static final String SIGN_UP_URL = "/users";
    public static final String TOKEN_SECRET = "TlpeCqmF12TlpeCqmF12TlpeCqmF12TlpeCqmF12TlpeCqmF12TlpeCqmF12";

    public static String getTokenSecret() {
        Environment environment = (Environment) SpringApplicationContext.getBean("environment");
        return environment.getProperty("tokenSecret");
    }
}
