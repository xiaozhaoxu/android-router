package com.github.mr5.androidrouter.matcher;

import android.os.Parcel;
import android.os.Parcelable;

import com.github.mr5.androidrouter.CompiledRoute;

import java.util.Map;

public class Request implements Parcelable {
    private Map<String, String> pathVariables;
    private Map<String, String> queryVariables;
    private CompiledRoute compiledRoute;
    private String refererUrl;
    private String refererClass;
    private String url;
    private String scheme;
    private String host;

    private String anchor;


    public Request(CompiledRoute compiledRoute) {
        this.compiledRoute = compiledRoute;
    }

    public Request() {
    }

    public Map<String, String> getPathVariables() {
        return pathVariables;
    }

    public Request setPathVariables(Map<String, String> pathVariables) {
        this.pathVariables = pathVariables;

        return this;
    }

    public Map<String, String> getQueryVariables() {
        return queryVariables;
    }

    public Request setQueryVariables(Map<String, String> queryVariables) {
        this.queryVariables = queryVariables;

        return this;
    }

    public CompiledRoute getCompiledRoute() {
        return compiledRoute;
    }

    public Request setCompiledRoute(CompiledRoute compiledRoute) {
        this.compiledRoute = compiledRoute;
        return this;
    }

    public String toString() {
        return getCompiledRoute().toString();
    }

    public String getRefererUrl() {
        return refererUrl;
    }

    public Request setRefererUrl(String refererUrl) {
        this.refererUrl = refererUrl;

        return this;
    }

    public String getRefererClass() {
        return refererClass;
    }

    public Request setRefererClass(String refererClass) {
        this.refererClass = refererClass;

        return this;
    }

    public String getUrl() {
        return url;
    }

    public Request setUrl(String url) {
        this.url = url;

        return this;
    }

    public String getScheme() {
        return scheme;
    }

    public Request setScheme(String scheme) {
        this.scheme = scheme;

        return this;
    }

    public String getHost() {
        return host;
    }

    public Request setHost(String host) {
        this.host = host;

        return this;
    }

    public String getAnchor() {
        return anchor;
    }

    public Request setAnchor(String anchor) {
        this.anchor = anchor;

        return this;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(refererUrl);
        parcel.writeString(refererClass);
        parcel.writeString(url);
        parcel.writeString(scheme);
        parcel.writeString(host);
        parcel.writeMap(getQueryVariables());
        parcel.writeMap(getPathVariables());
        parcel.writeString(anchor);
    }
}