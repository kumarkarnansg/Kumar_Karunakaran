package com.singtel.model;

import com.singtel.behaviours.impl.walkable.CanWalk;

public class Animal extends Parent {

    public Animal(){
        this.walkable=new CanWalk();
    }
}
