package com.singtel.behaviours.impl.singable;

import com.singtel.behaviours.IsSing;

public class CatSound extends CanSing {
    @Override
    public void sing() {
        System.out.println("Meow");
    }
}
