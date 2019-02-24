package com.singtel.model;

import com.singtel.behaviours.impl.swimmable.CanSwim;
import com.singtel.behaviours.IsFly;
import com.singtel.behaviours.IsSing;
import com.singtel.behaviours.IsWalk;

public abstract class Parent {

    protected IsWalk walkable;
    protected IsFly flyable;
    protected IsSing singable;
    protected CanSwim swimmable;

    /**
     * Need to be refactored
     */
    public void walk(){
        this.walkable.walk();
    }

    public void fly() {
        this.flyable.fly();
    }

    public void sing() {
        this.singable.sing();
    }

    public void swim() {
        this.swimmable.swim();
    }


    public IsWalk getWalkable() {
        return walkable;
    }

    public void setWalkable(IsWalk walkable) {
        this.walkable = walkable;
    }

    public IsFly getFlyable() {
        return flyable;
    }

    public void setFlyable(IsFly flyable) {
        this.flyable = flyable;
    }

    public IsSing getSingable() {
        return singable;
    }

    public void setSingable(IsSing singable) {
        this.singable = singable;
    }

    public CanSwim getSwimmable() {
        return swimmable;
    }

    public void setSwimmable(CanSwim swimmable) {
        this.swimmable = swimmable;
    }
}
