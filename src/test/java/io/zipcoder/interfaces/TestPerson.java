package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
    @Test
    public void PersonConstructorTest() {
        Person person = new Person(444L, "Brian");
        Long expectedId = 444L;
        Long actualId = person.getId();
        String expectedName = "Brian";
        String actualName = person.getName();
        Assert.assertEquals(expectedId,actualId);
        Assert.assertEquals(expectedName,actualName);

    }


    @Test
    public void setNameTest(){
        Person personOne = new Person(444L, "Brian");
        personOne.setName("Jack");
        String expectedName = "Jack";
        String actualName = personOne.getName();

        Assert.assertEquals(expectedName,actualName);
    }
}
