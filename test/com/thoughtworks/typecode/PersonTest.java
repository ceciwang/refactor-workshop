package com.thoughtworks.typecode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PersonTest {
    @Test
    public void should_get_blood_type_for_person(){
        Person person = new Person(BloodGroup.A);
        assertThat(person.getBloodGroup().getCode(), is(1));
    }

    @Test
    public void should_set_blood_type_for_person(){
        Person person = new Person(BloodGroup.A);
        person.setBloodGroup(BloodGroup.AB);
        assertThat(person.getBloodGroup().getCode(), is(3));
    }

}
