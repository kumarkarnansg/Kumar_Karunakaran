package com.singtel.model.fish;

import com.singtel.behaviours.impl.swimmable.GreatSwimmers;
import com.singtel.model.Fish;
import com.singtel.model.Parent;
import com.singtel.behaviours.IsSing;
import com.singtel.behaviours.IsWalk;

public class Dolphin extends Parent {

    Fish fish;

    public Dolphin(){
        this.swimmable= new GreatSwimmers();
        this.fish =new Fish();
        this.walkable = this.fish.getWalkable();
        this.singable = this.fish.getSingable();
    }

}
