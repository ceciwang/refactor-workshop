package com.thoughtworks.moveFeature;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PersonExtractTest {
    @Test
    public void should_get_telephone_number(){
        PersonExtract person = new PersonExtract();
        person.setOfficeAreaCode("area");
        person.setOfficeNumber("123");
        String number = person.getTelephoneNumber();
        assertThat(number,is("(area)123"));
    }
}
