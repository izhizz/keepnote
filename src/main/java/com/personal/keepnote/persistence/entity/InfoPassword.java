package com.personal.keepnote.persistence.entity;

public class InfoPassword {
    private Integer id;

    private String key;

    public InfoPassword(Integer id, String key) {
        this.id = id;
        this.key = key;
    }

    public InfoPassword() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }
}