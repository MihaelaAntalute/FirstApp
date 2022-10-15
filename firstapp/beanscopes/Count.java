package com.springapps.firstapp.beanscopes;

public class Count {

    private Integer counter;

    private static Count instance;

    private Count() { }

    public static Count getInstance() {
        if (instance == null) {
            instance = new Count(0);
        }
        return instance;
    }



    private Count(Integer counter) {
        this.counter = counter;
    }

    public Integer getCounter() {
        return counter;
    }

    public void setCounter(Integer counter) {
        this.counter = counter;
    }

    public void increment(){
        counter++;
    }
}
