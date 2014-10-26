package com.fic.ipm2_android;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by nirei on 15/10/14.
 */
public class Movie
{
    private int id;
    private String title;
    private String category;
    private String synopsis;
    private String image_url;
    private int year;
    private String username;
    private String email;

    public Movie(JSONObject datos) {
        try {
            this.id = datos.getInt("id");
            this.title = datos.getString("title");
            this.category = datos.getString("category");
            this.synopsis = datos.getString("synopsis");
            this.image_url = datos.getString("url_image");
            this.year = datos.getInt("year");
            this.username = datos.getString("username");
            this.email = datos.getString("email");
        } catch(JSONException e) {
            e.printStackTrace();
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}