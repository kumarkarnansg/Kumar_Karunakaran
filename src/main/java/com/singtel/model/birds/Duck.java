package com.singtel.model.birds;

import com.singtel.behaviours.impl.singable.DuckSound;
import com.singtel.behaviours.impl.swimmable.CanSwim;
import com.singtel.model.Bird;

public class Duck extends Bird {

    public Duck(){
        this.singable =new DuckSound();
        this.swimmable= new CanSwim();
    }
}
