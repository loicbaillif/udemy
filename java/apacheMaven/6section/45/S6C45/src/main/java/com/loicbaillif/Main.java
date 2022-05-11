package com.loicbaillif;

import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        System.out.println(StringUtils.center(
                " S6C45 ",
                60,
                '*'));
        System.out.println(StringUtils.center(
                " Maven Deploy Plugin ",
                60,
                '*'));
    }
}