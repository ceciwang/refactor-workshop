package com.thoughtworks.organizingData;

public class IntRange {
    private int low;
    private int high;

    boolean includes (int arg){
        return arg >= getLow() && arg <= getHigh();
    }

    void grow(int factor){
        setHigh(getHigh() * factor);
    }

    public IntRange(int low, int high) {
        this.low = low;
        this.high = high;
    }

    public int getLow() {
        return low;
    }

    public void setLow(int low) {
        this.low = low;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }
}

class CappedRange extends IntRange {

    private int cap;

    public CappedRange(int low, int high, int cap) {
        super(low, high);

        this.cap = cap;
    }

    int getCap() {
        return cap;
    }

    public int getHigh(){
        return Math.min(super.getHigh(), getCap());
    }
}