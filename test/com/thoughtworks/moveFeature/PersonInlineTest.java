package com.thoughtworks.moveFeature;

import org.junit.Test;

public class PersonInlineTest {
    @Test
    public void should_telephone_number(){
        PersonInline martin = new PersonInline();
        martin.getOfficeTelephone().setOfficeAreaCode("781");
    }
}
