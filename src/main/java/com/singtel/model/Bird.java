package com.singtel.model;

import com.singtel.behaviours.impl.flyable.CanFly;
import com.singtel.behaviours.impl.singable.CanSing;
import com.singtel.behaviours.impl.walkable.CanWalk;

public class Bird extends Parent{

    public Bird(){
        this.walkable=new CanWalk();
        this.flyable =new CanFly();
        this.singable=new CanSing();
    }
}
