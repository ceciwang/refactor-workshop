package com.thoughtworks.typecode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PersonTest {
    @Test
    public void should_get_blood_type_for_person(){
        Person person = new Person(Person.A);
        assertThat(person.getBloodGroup(), is(1));
    }
}
