package com.singtel.behaviours.impl.singable;

import com.singtel.behaviours.IsSing;

public class DogSound extends CanSing {
    @Override
    public void sing() {
        System.out.println("Woof,woof");
    }
}
