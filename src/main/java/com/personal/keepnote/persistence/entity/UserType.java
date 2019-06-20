package com.personal.keepnote.persistence.entity;

public class UserType {
    private Integer id;

    private Integer pid;

    private String typeName;

    public UserType(Integer id, Integer pid, String typeName) {
        this.id = id;
        this.pid = pid;
        this.typeName = typeName;
    }

    public UserType() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }
}