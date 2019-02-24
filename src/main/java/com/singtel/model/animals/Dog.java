package com.singtel.model.animals;

import com.singtel.behaviours.impl.singable.DogSound;
import com.singtel.model.Animal;
import com.singtel.model.Parent;

public class Dog extends Animal {

    public Dog(){
        this.singable = new DogSound();
    }
}
