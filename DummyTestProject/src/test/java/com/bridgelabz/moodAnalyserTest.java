package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class moodAnalyserTest {
    @Test
    public void givenMessage_WhenSad_ShouldReturnSad(){
        moodAnalyser analyser = new moodAnalyser();
        String mood = analyser.analyseMood("this is Sad Mood");
        Assert.assertEquals("SAD",mood);
    }
    @Test
    public void givenMessage_WhenHappy_ShouldReturnHappy(){
        moodAnalyser moodAnalyser = new moodAnalyser();
        String mood = moodAnalyser.analyseMood("this is happy Mood");
        Assert.assertEquals("HAPPY",mood);



    }
}
