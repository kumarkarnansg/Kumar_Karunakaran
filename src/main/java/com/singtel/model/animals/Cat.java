package com.singtel.model.animals;

import com.singtel.behaviours.impl.singable.CatSound;
import com.singtel.model.Animal;
import com.singtel.model.Parent;

public class Cat extends Animal {

    public Cat(){
        this.singable= new CatSound();
    }
}
