package com.example.homenavigation;

public class Cards {
    private String imgUrl;
    private String title;
    public String index;

    public Cards(String imgUrl, String title, String index) {
        this.imgUrl = imgUrl;
        this.title = title;
        this.index = index;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }
}

