package io.callable.sdk;

import com.fasterxml.jackson.databind.ObjectMapper;

abstract class ServiceImpl {
    protected CallableHTTPClient client = CallableHTTPClient.getInstance();
}
