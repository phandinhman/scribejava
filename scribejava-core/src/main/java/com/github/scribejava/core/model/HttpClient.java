package com.github.scribejava.core.model;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Future;

/**
 *
 * @deprecated use {@link com.github.scribejava.core.httpclient.HttpClient}
 */
@Deprecated
public interface HttpClient {

    void close() throws IOException;

    <T> Future<T> executeAsync(String userAgent, Map<String, String> headers, Verb httpVerb, String completeUrl,
            byte[] bodyContents, OAuthAsyncRequestCallback<T> callback,
            OAuthRequestAsync.ResponseConverter<T> converter);

    <T> Future<T> executeAsync(String userAgent, Map<String, String> headers, Verb httpVerb, String completeUrl,
            String bodyContents, OAuthAsyncRequestCallback<T> callback,
            OAuthRequestAsync.ResponseConverter<T> converter);

    <T> Future<T> executeAsync(String userAgent, Map<String, String> headers, Verb httpVerb, String completeUrl,
            File bodyContents, OAuthAsyncRequestCallback<T> callback, OAuthRequestAsync.ResponseConverter<T> converter);

    /**
     *
     * @deprecated use {@link com.github.scribejava.core.httpclient.HttpClientConfig}
     */
    @Deprecated
    interface Config {

    }
}
