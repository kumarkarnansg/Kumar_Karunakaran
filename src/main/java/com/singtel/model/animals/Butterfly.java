package com.singtel.model.animals;

import com.singtel.behaviours.impl.flyable.CanFly;
import com.singtel.behaviours.impl.singable.CanNotSing;

public class Butterfly extends Caterpillar {

    public Butterfly(){
        this.flyable =new CanFly();
        this.singable= new CanNotSing();
    }
}
