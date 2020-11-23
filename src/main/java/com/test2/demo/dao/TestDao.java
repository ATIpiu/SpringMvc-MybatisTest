package com.test2.demo.dao;

import java.util.List;

import com.test2.demo.entity.Test1;

public interface TestDao {
    /**
     * 列出区域列表
     */
    List<Test1> queryTest();

    /**
     * 根据Id列出具体区域
     */
    Test1 queryTestById(int test_id);

    /**
     * 插入区域信息
     */
    int insertTest(Test1 test);

    /**
     * 更新区域信息
     */
    int updateTest(Test1 test);

    /**
     * 删除区域信息
     */
    int deleteTest(int test_id);
}

