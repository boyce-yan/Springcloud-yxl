package com.yxl.cloud.controller;

import java.util.UUID;

public class a {

    public static void main(String[] args) {
        String s = UUID.randomUUID().toString().replace("-", "").toLowerCase();
        System.out.println(s);
    }
}
