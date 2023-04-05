package com.codeflix.catalog.admin.application;

import com.codeflix.catalog.admin.domain.Category;

public class UseCase {
    public Category execute() {
        return new Category();
    }
}