package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name="";
    private int age;

    public Person() {
    }

    public Person(int age1)
    {
        age=age1;
    }

    public Person(String name1)
    {
       name=name1;
    }

    public Person(String name1, int age1)
    {
        name= name1;
        age= age1;
    }

    public void setName(String name1)
    {
        name=name1;
    }


    public void setAge(int age1)
    {
        age=age1;
    }

    public String getName()
    {

        return name;
    }

    public Integer getAge()
    {
        return age;
    }
}
