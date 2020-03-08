package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {

    @Test
    public void instanceTest() {

        //Given
        Student Tim = new Student(1001, "Tim");
        Student Jim = new Student(1002, "Jim");
        Student Lim = new Student(1003, "Lim");
        Student Kim = new Student(1004, "Kim");
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

