package com.thoughtworks.moveFeature;

public class PersonInline {
    private String name;
    private String officeNumber;
    private Telephone officeTelephone = new Telephone();

    public String getName(){
        return name;
    }

    public String getTelephoneNumber(){
        return officeTelephone.getTelephoneNumber();
    }

}

class Telephone {
    private String officeAreaCode;
    private String officeNumber;

    public String getTelephoneNumber() {
        return ("("+ officeAreaCode + ")"+ officeNumber);
    }
}