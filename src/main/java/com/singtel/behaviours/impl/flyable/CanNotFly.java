package com.singtel.behaviours.impl.flyable;

import com.singtel.behaviours.IsFly;

public class CanNotFly implements IsFly {
    @Override
    public void fly() {
        System.out.println("Can not fly");
    }
}
