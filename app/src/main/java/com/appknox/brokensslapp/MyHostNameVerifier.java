package com.appknox.brokensslapp;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

class MyHostNameVerifier implements HostnameVerifier {

    @Override
    public boolean verify(String s, SSLSession sslSession) {
        return true;
    }
}