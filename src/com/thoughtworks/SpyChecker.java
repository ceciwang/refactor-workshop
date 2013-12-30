package com.thoughtworks;

public class SpyChecker {
    void checkSecurity(String[] people){
        boolean found = false;
        for (int i = 0; i < people.length; i++) {
            if(!found){
                if(people[i].equals("Don")){
                    sendAlert();
                    found = true;
                }
                if(people[i].equals("John")){
                    sendAlert();
                    found = true;
                }
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
        someLaterCode();
    }

    private void someLaterCode() {
    }

    private void sendAlert() {
    }
}
