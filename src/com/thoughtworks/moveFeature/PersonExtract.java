package com.thoughtworks.moveFeature;

public class PersonExtract {
    private String name;
    private TelephoneNumber telephoneNumber;

    public String getTelephoneNumber(){
        return telephoneNumber.getString();
    }

    public void setTelephoneNumber(TelephoneNumber telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getName() {
        return name;
    }

}

class TelephoneNumber{
    private String officeAreaCode;
    private String officeNumber;

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

    public String getString() {
        return ("("+ getOfficeAreaCode() +")" + getOfficeNumber());
    }
}