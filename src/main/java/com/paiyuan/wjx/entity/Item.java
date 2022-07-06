package com.paiyuan.wjx.entity;

public class Item {

    private String activity;

    private String name;

    private int timetaken;

    private String joinid;

    private String totalvalue;

    private String submittime;

    private String sojumpparm;

    private String thirdusername;

    private String sign;

    public Item(String activity, String name, String timetaken, String joinid, String totalvalue, String submittime, String sojumpparm, String thirdusername, String sign) {

        this.activity = activity;
        this.name = name;
        this.timetaken = Integer.parseInt(timetaken);
        this.joinid = joinid;
        this.totalvalue = totalvalue;
        this.submittime = submittime;
        this.sojumpparm = sojumpparm;
        this.thirdusername = thirdusername;
        this.sign = sign;
    }
}
