package com.thoughtworks.moveFeature;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PersonExtractTest {
    @Test
    public void should_get_telephone_number(){
        PersonExtract person = new PersonExtract();
        TelephoneNumber telephoneNumber = new TelephoneNumber();
        telephoneNumber.setOfficeAreaCode("area");
        telephoneNumber.setOfficeNumber("123");
        person.setTelephoneNumber(telephoneNumber);
        assertThat(person.getTelephoneNumber(),is("(area)123"));
    }
}
