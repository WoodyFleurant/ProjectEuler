package com.gemdevs.tests;

import org.assertj.core.api.SoftAssertions;
import org.junit.Test;

public class InitializeTest {

    @Test
    public void initializationTest(){
        SoftAssertions softly = new SoftAssertions();
        softly.assertThat(true).isTrue();
    }

}
