package com.adozgen.learnjava.beans.scope;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.context.WebApplicationContext;


public class MyWebScopedBean {

    @Bean
    @Scope(value = WebApplicationContext.SCOPE_REQUEST, proxyMode = ScopedProxyMode.TARGET_CLASS)
    public WebScopeBean requestScopeBean() {
        return new WebScopeBean();
    }


    @Bean
    @Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
    public WebScopeBean sessionScopeBean() {
        return new WebScopeBean();
    }
    @Bean
    @Scope(value = WebApplicationContext.SCOPE_APPLICATION, proxyMode = ScopedProxyMode.TARGET_CLASS)
    public WebScopeBean applicationScopeBean() {
        return new WebScopeBean();
    }

    @Bean
    @Scope(scopeName = "websocket", proxyMode = ScopedProxyMode.TARGET_CLASS)
    public WebScopeBean websocketScopeBean() {
        return new WebScopeBean();
    }

}
