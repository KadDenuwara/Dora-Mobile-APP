package com.demo.dora.Shorts;

public class DataHandler {

    String title,url;

    public DataHandler(String title, String url) {
        this.title = title;
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public String getTitle() {
        return title;
    }
}
