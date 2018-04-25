package com.spring.test;

import org.junit.Test;

import java.math.BigDecimal;

/**
 * @program: springssm
 * @description: 精度测试类
 * @author: Mr.Shu
 * @create: 2018-04-25 14:15
 **/
public class BigDecimalTest {

        @Test
        public void test1(){
            System.out.println(0.05+0.01);
            System.out.println(1.0-0.42);
            System.out.println(4.015*100);
            System.out.println(123.3/100);
        }







        @Test
        public void test2(){
            BigDecimal b1 = new BigDecimal(0.05);
            BigDecimal b2 = new BigDecimal(0.01);
            System.out.println(b1.add(b2));
        }

        @Test
        public void test3(){
            BigDecimal b1 = new BigDecimal("0.05");
            BigDecimal b2 = new BigDecimal("0.01");
            System.out.println(b1.add(b2));

        }

    }


