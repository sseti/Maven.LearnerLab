package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {

    @Test
    public void instanceTest() {

        Instructor kris = new Instructor(1001);
        Instructor dolio = new Instructor(1002);
        Instructor froilan = new Instructor(1003);
        Instructor nobles = new Instructor(1004);
        Instructors list = Instructors.getInstance();
        list.add(kris);
        list.add(dolio);
        list.add(froilan);
        list.add(nobles);
        Integer expected = 4;
        Integer actual = list.getCount();
        Person[] instructors = list.getArray();
        Assert.assertEquals(expected, actual);
    }

}
