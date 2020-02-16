package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        //Integer expectedAge = Integer.MAX_VALUE;
        Integer expectedAge=0;
        // When
        Person person = new Person();

        System.out.println("The expectedName  is -->"+expectedName);
        System.out.println("The expectedAge  is -->"+expectedAge);
        // Then
        String actualName = person.getName();
        System.out.println("The actual name is -->"+actualName);
        Integer actualAge = person.getAge();
        System.out.println("The actual age is -->"+actualAge);

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);
        System.out.println("The expected name is -->"+expected);
        // Then
        String actual = person.getName();
        System.out.println("The actual name is -->"+actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        System.out.println("The expected age is-->"+expected);
        Person person = new Person(expected);

        // Then

        Integer actual = person.getAge();
        System.out.println("The actual age is-->"+actual);
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        System.out.println("The expected Name is-->"+expectedName);
        Person person = new Person(expectedName, expectedAge);

        // Then

        Integer actualAge = person.getAge();
       System.out.println("The actual Age is-->"+actualAge);
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        System.out.println( "The expected name is--->"+expected);
        String actual = person.getName();

        // Then
        System.out.println("The actual name is -->"+actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        System.out.println( "The expected Age is-->"+expected);
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();

        System.out.println( "The actual Age is-->"+actual);
        Assert.assertEquals(expected, actual);
    }
}
