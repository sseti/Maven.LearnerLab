package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestZipCodeWilmington {

    @Test
    public void hostLectureTest() {

        //Given
        Students studentList = Students.getInstance();
        Student Tim = new Student((long) 1023, "Tim");
        Student Jim = new Student((long) 1024, "Jim");
        studentList.add(Tim);
        studentList.add(Jim);
        Instructors instructorlist = Instructors.getInstance();
        Instructor kris = new Instructor(1001);
        instructorlist.add(kris);
        double numberOfHours = 2;
        double expectedStudentHours = 1;

        //When
        ZipCodeWilmington.hostLecture(kris, numberOfHours);

        double actualStudentHours = Tim.getTotalStudyTime();

        //Then
        Assert.assertEquals(expectedStudentHours, actualStudentHours, .0001);
    }

    @Test
    public void hostLectureByIdTest() {

        //Given
        Students studentList = Students.getInstance();
        Student kate = new Student((long) 1023, "Jim");
        Student thao = new Student((long) 1024, "Tim");
        studentList.add(jim);
        studentList.add(tim);
        Instructors instructorlist = Instructors.getInstance();
        Instructor kris = new Instructor(2001);
        instructorlist.add(kris);
        double numberOfHours = 2;
        double expectedStudentHours = 1;

        //When
        ZipCodeWilmington.hostLectureById((long) 2001, numberOfHours);

        double actualStudentHours = kate.getTotalStudyTime();

        //Then
        Assert.assertEquals(expectedStudentHours, actualStudentHours, .0001);
    }


}

