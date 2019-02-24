package com.singtel.model.birds;

import com.singtel.behaviours.impl.flyable.CanNotFly;
import com.singtel.behaviours.impl.singable.ChickenSound;
import com.singtel.model.Bird;

public class Chicken extends Bird {

    public  Chicken(){
        this.singable=new ChickenSound();
        this.flyable =new CanNotFly();
    }
}
