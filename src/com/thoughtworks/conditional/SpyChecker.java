package com.thoughtworks.conditional;

public class SpyChecker {
    void checkSecurity(String[] people) {
        for (int i = 0; i < people.length; i++) {
            if (people[i].equals("Don") || people[i].equals("John")) {
                sendAlert();
                break;
            }
        }
    }

    void checkSecurity2(String[] people){
        String found = "";
        for (int i = 0; i < people.length; i++) {
            if(found.equals("")){
                if(people[i].equals("Don")){
                    sendAlert();
                    found = "Don";
                }
                if(people[i].equals("John")){
                    sendAlert();
                    found = "John";
                }
            }
        }
        someLaterCode(found);
    }

    private void someLaterCode(String found) {
    }

    private void sendAlert() {
    }
}
