package com.loicbaillif;

import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        System.out.println(StringUtils.center(
                " Apache Maven: Beginner to Guru ",
                70,
                '*'));
        System.out.println(StringUtils.center(
                " S6C47 - Maven and Source Control ",
                70,
                '*'
        ));
    }
}