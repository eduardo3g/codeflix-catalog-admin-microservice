package com.codeflix.catalog.admin.infrastructure;

import com.codeflix.catalog.admin.application.UseCase;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(new UseCase().execute());
    }
}