package com.test2.demo.entity;

import org.springframework.stereotype.Component;

public class Test1 {
    private String test_name;
    public int test_id;

    public int getTest_id() {
        return test_id;
    }

    public void setTest_id(int test_id) {
        this.test_id = test_id;
    }

    public String getTest_name() {
        return test_name;
    }

    public void setTest_name(String test_name) {
        this.test_name = test_name;
    }

    public Test1(String test_name) {
        this.test_name = test_name;
    }
}
