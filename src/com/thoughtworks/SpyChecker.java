package com.thoughtworks;

public class SpyChecker {
    void checkSecurity(String[] people){
        for (int i = 0; i < people.length; i++) {
            if(people[i].equals("Don")){
                sendAlert();
                break;
            }
            if(people[i].equals("John")){
                sendAlert();
                break;
            }

        }
    }

    void checkSecurity2(String[] people){
        String found = foundMiscreant(people);
        someLaterCode(found);
    }

    private String foundMiscreant(String[] people) {
        for (int i = 0; i < people.length; i++) {
            if (people[i].equals("Don")) {
                sendAlert();
                return "Don";
            }
            if (people[i].equals("John")) {
                sendAlert();
                return "John";
            }
        }
        return "";
    }

    private void someLaterCode(String found) {


    }

    private void sendAlert() {


    }
}
