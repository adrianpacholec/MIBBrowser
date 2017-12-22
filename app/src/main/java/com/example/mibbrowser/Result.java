package com.example.mibbrowser;

/**
 * Created by Adrian on 17.12.2017.
 */

public class Result {
    private String name, value, type, ip;

    public Result(String name, String value, String type, String ip) {
        this.name = name;
        this.value = value;
        this.type = type;
        this.ip = ip;
    }

    public String getName(){
        return name;
    }

    public String getValue(){
        return value;
    }

    public String getType(){
        return type;
    }

    public String getIP(){
        return ip;
    }

}
