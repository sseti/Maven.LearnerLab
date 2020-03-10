package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {

    @Test
    public void instanceTest() {

        //Given
        Student Tim = new Student(1023L, "Tim");
        Student Jim = new Student(1024L, "Jim");
        Student Lim = new Student(1025L, "Lim");
        Student Kim = new Student(1026L, "Kim");
        Students list = Students.getInstance();
        list.add(Tim);
        list.add(Jim);
        list.add(Lim);
        list.add(Kim);
        Integer expected = 4;

        //When
        Integer actual = list.getCount();
        Person[] students = list.getArray();

        //Then
        Assert.assertEquals(expected, actual);
    }
}

