package com.singtel.behaviours.impl.singable;

import com.singtel.behaviours.IsSing;

public class RoosterSound extends CanSing {

    @Override
    public void sing() {
        System.out.println(getSound("rooster"));
    }
}
