package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void implementationTest(){
        Student student = new Student(1023L, "Tim");

        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void inheritanceTest(){
        Student student = new Student(1023L, "Tim");

        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void learnTest(){
        Student student = new Student(1023L, "Tim");
        student.learn(9.5);
        double actualStudy = student.getTotalStudyTime();
        double expectedStudy = 9.5;

        Assert.assertEquals(expectedStudy, actualStudy, 0);

    }
}

