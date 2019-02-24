package com.singtel.behaviours.impl.singable;

import com.singtel.behaviours.IsSing;

public class DuckSound extends CanSing {
    @Override
    public void sing() {
        System.out.println("Quack,quack");
    }
}
