package com.singtel.model.animals;

import com.singtel.behaviours.impl.flyable.CanNotFly;
import com.singtel.behaviours.impl.walkable.CrawlWalk;
import com.singtel.model.Animal;

public class Caterpillar extends Animal {

    public Caterpillar(){
        this.flyable= new CanNotFly();
        this.walkable= new CrawlWalk();
    }
}
