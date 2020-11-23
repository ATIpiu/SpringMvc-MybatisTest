package com.test2.demo.service.impl;

import com.test2.demo.dao.TestDao;
import com.test2.demo.entity.Test1;
import com.test2.demo.service.TestService;

import java.util.List;

public class TestServiceImpl implements TestService {

    private TestDao testDao;

    public void setTestDao(TestDao testDao) {
        this.testDao = testDao;
    }

    @Override
    public List<Test1> getTestList() {
        List<Test1> tests=testDao.queryTest();
        return tests;
    }

    @Override
    public Test1 getTestById(int test_id) {
        return null;
    }

    @Override
    public boolean addTest(Test1 test) {
        return false;
    }

    @Override
    public boolean modifyTest(Test1 test) {
        return false;
    }

    @Override
    public boolean deleteTest(int test_id) {
        return false;
    }
}
