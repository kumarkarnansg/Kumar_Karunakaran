package com.singtel.behaviours.impl.walkable;

import com.singtel.behaviours.IsWalk;

public class CanNotWalk implements IsWalk {

    @Override
    public void walk() {
        System.out.println("Can not walk");
    }
}
