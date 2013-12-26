package com.thoughtworks;

public class BloodGroup {
    public static final BloodGroup O = new BloodGroup(0);
    public static final BloodGroup A = new BloodGroup(1);
    public static final BloodGroup B = new BloodGroup(2);
    public static final BloodGroup AB = new BloodGroup(3);
    private static BloodGroup[] values = {O, A, B, AB};

    private int code;

    private int getCode() {
        return code;
    }

    public BloodGroup(int code) {
        this.code = code;
    }

    private static BloodGroup code(int arg){
        return values[arg];
    }
}
