package com.singtel.model.animals;

import com.singtel.behaviours.impl.singable.CanSing;
import com.singtel.model.Animal;
import com.singtel.model.Parent;

public class Frog extends Animal {

    public Frog(){
        this.singable =new CanSing();
    }

}
