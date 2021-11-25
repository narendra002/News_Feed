package com.example.newsapp;

public class ModelClass {
    private String author,title,description,url,urlToImage,publisedAt;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrlToImage() {
        return urlToImage;
    }

    public void setUrlToImage(String urlToImage) {
        this.urlToImage = urlToImage;
    }

    public String getPublisedAt() {
        return publisedAt;
    }

    public void setPublisedAt(String publisedAt) {
        this.publisedAt = publisedAt;
    }

    public ModelClass(String author, String title, String description, String url, String urlToImage, String publisedAt) {
        this.author = author;
        this.title = title;
        this.description = description;
        this.url = url;
        this.urlToImage = urlToImage;
        this.publisedAt = publisedAt;
    }
}
