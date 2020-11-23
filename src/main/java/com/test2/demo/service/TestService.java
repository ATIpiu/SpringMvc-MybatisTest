package com.test2.demo.service;

import java.util.List;

import com.test2.demo.entity.Test1;

public interface TestService {

    /**
     * 获取区域列表
     *
     * @return
     */
    List<Test1> getTestList();

    /**
     * 通过区域Id获取区域信息
     *
     * @param test_id
     * @return
     */
    Test1 getTestById(int test_id);

    /**
     * 增加区域信息
     *
     * @param test
     * @return
     */
    boolean addTest(Test1 test);

    /**
     * 修改区域信息
     *
     * @param test
     * @return
     */
    boolean modifyTest(Test1 test);

    /**
     * 删除区域信息
     *
     * @param test_id
     * @return
     */
    boolean deleteTest(int test_id);

}
