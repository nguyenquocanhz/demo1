package com.example.demo01;

public class Item {

    private int imageResId;
    private String title;

    private String convViec;
    public Item() {
    }

    public Item(int imageResId, String title, String convViec){
        this.imageResId = imageResId;
        this.title = title;
        this.convViec = convViec;
    }
    // Getters
    public int getImageResId() {
        return imageResId;
    }
    public String getTitle() {
        return title;
    }
    public String getConvViec(){
        return convViec;
    }
    // Setters (nếu cần thiết)
    public void setImageResId(int imageResId) {
        this.imageResId = imageResId;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setConvViec(String convViec) {
        this.convViec = convViec;
    }
}
