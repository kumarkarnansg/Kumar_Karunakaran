package com.singtel.behaviours.impl.swimmable;

import com.singtel.behaviours.isSwimm;

public class CanSwim implements isSwimm {
    @Override
    public void swim() {
        System.out.println("I am swimming");
    }
}
