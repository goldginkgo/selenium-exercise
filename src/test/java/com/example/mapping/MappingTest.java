package com.example.mapping;

import org.junit.Test;

import org.junit.Assert;

public class MappingTest {
    @Test
    public void getMapping() throws Exception {
        Assert.assertEquals("sign-in-button", Mapping.getMapping("https://www.vodafone.co.nz/knox/login_handler.jsp", "Sign in"));
        Assert.assertEquals("myvfLoginOnlineId", Mapping.getMapping("https://www.vodafone.co.nz/knox/login_handler.jsp", "username"));
        Assert.assertEquals("myvfLoginPassword", Mapping.getMapping("https://www.vodafone.co.nz/knox/login_handler.jsp", "password"));
        Assert.assertEquals("sign-in-button", Mapping.getMapping("https://www.vodafone.co.nz/", "Sign in"));
    }

}