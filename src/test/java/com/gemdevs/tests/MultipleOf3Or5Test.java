package com.gemdevs.tests;

import org.assertj.core.api.SoftAssertions;
import org.gemdevs.MultipleOf3Or5;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MultipleOf3Or5Test {

    SoftAssertions softly = new SoftAssertions();

    private MultipleOf3Or5 testee;

    @Before
    public void setUp(){
        testee = MultipleOf3Or5.createMultipleOf3Or5();
    }

    @Test(expected = IllegalArgumentException.class)
    public void sumMultiplesOf3Or5WthNullLimitTest(){
        testee.sumMultiplesOf3Or5Under();
    }

    @Test
    public void sumMultiplesOf3Or5Under10Test(){
        sumMultiplesOf3Or5UnderLimitTest(10,23);
        testee.setLimit(10);
        Integer sum = testee.sumMultiplesOf3Or5Under();
        softly.assertThat(sum).isNotNull();
        softly.assertThat(sum).isEqualTo(23);
    }

    @Test
    public void sumMultiplesOf3Or5Under1000Test(){
        sumMultiplesOf3Or5UnderLimitTest(1000,233168);
    }

    private void sumMultiplesOf3Or5UnderLimitTest(Integer limit, Integer expectedSum){
        testee.setLimit(limit);
        Integer sum = testee.sumMultiplesOf3Or5Under();
        softly.assertThat(sum).isNotNull();
        softly.assertThat(sum).isEqualTo(expectedSum);
    }

    @After
    public void tearDown(){
        softly.assertAll();
    }
}
