package com.atroot.admin;

import org.junit.jupiter.api.*;

import java.util.concurrent.TimeUnit;

/**
 * Description:
 *
 * @author atroot@126.com  @ZYD
 * @create 2021.5.17 15:52
 */
@DisplayName("Junit5的功能测试")
public class JUnit5Test {
    @BeforeAll
    static void beforeAllTest() {
        System.out.println("所有测试准备就绪准备开始测试！");
    }

    @AfterAll
    static void afterALLTest() {
        System.out.println("所有测试已经测试完成！");
    }

    /**
     * 标注测试的方法名
     */
    @DisplayName("DisplayName测试")
    @Test
    void testDisplayName() {
        System.out.println("DisplayName test success！");
    }

    @Disabled //禁用测试
    @Test
    void testDisplayName2() {
        System.out.println("DisplayName test2 success！");
    }

    /**
     * 每个测试方法开始之前执行的方法
     */
    @BeforeEach
    void beforeEachTest() {
        System.out.println("测试即将开始！");
    }

    /**
     * 每个测试方法结束后执行的方法
     */
    @AfterEach
    void afterEachTest() {
        System.out.println("测试结束！");
    }

    @Timeout(value = 300,unit = TimeUnit.MILLISECONDS)
    @Test
    void timeoutTest() throws InterruptedException {
        Thread.sleep(500);;
    }
}

