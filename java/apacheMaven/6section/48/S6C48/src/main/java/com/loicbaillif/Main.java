package com.loicbaillif;

import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        System.out.println(StringUtils.center(
                " Apache Maven: Beginner to Guru ",
                70,
                '*'));
        System.out.println(StringUtils.center(
                " S6C48 - Other Maven Plugins ",
                70,
                '*'));
        System.out.println("\nHave a look to https://maven.apache.org/ref/3.8.5/");
    }
}