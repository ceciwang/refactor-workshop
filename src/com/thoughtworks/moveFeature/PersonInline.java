package com.thoughtworks.moveFeature;

public class PersonInline {
    private String name;
    private Telephone officeTelephone = new Telephone();

    public String getName(){
        return name;
    }

    public String getTelephoneNumber(){
        return officeTelephone.getTelephoneNumber();
    }

    public Telephone getOfficeTelephone() {
        return officeTelephone;
    }
}

class Telephone {
    private String officeAreaCode;
    private String officeNumber;

    public String getTelephoneNumber() {
        return ("("+ officeAreaCode + ")"+ officeNumber);
    }

    String getOfficeAreaCode() {
        return officeAreaCode;
    }

    void setOfficeAreaCode(String officeAreaCode) {
        this.officeAreaCode = officeAreaCode;
    }

    String getOfficeNumber() {
        return officeNumber;
    }

    void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }
}