package com.singtel.model.birds;

import com.singtel.behaviours.impl.singable.RoosterSound;
import com.singtel.model.Bird;

public class Rooster extends Bird {

    Chicken chicken;

    public Rooster(){
        this.singable= new RoosterSound();
        this.chicken=new Chicken();
    }

    @Override
    public void fly(){
        this.chicken.fly();
    }
}
