package com.hitms.lms;

public class Member {
    private final int id;
    private final String name;

    public Member(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
