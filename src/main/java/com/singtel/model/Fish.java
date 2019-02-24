package com.singtel.model;

import com.singtel.behaviours.impl.singable.CanNotSing;
import com.singtel.behaviours.impl.swimmable.CanSwim;
import com.singtel.behaviours.impl.walkable.CanNotWalk;
import com.singtel.utils.Color;
import com.singtel.utils.Size;

public class Fish  extends Parent{

    protected Size size;
    protected Color color;

    public Fish(){
        this.swimmable=new CanSwim();
        this.walkable =new CanNotWalk();
        this.singable= new CanNotSing();
    }

    public Size size() {
        return size;
    }

    public Color color() {
        return color;
    }
}
