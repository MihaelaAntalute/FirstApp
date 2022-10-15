package com.springapps.firstapp.DIwithBeans;

import org.springframework.stereotype.Component;

@Component
public class C {
    private B b;

    public C(B b) {
        this.b = b;
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }

    public int generateNumber() {
        return 2 + b.generateNumber();
    }
}
