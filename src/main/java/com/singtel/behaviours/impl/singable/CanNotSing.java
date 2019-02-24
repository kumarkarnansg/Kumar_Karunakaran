package com.singtel.behaviours.impl.singable;

import com.singtel.behaviours.IsSing;

public class CanNotSing implements IsSing {


    @Override
    public void sing() {
        System.out.println("Can not sing");
    }
}
