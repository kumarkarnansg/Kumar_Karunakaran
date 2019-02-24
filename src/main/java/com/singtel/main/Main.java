/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.singtel.main;

import com.singtel.behaviours.IsFly;
import com.singtel.behaviours.IsSing;
import com.singtel.behaviours.IsWalk;
import com.singtel.behaviours.impl.flyable.CanFly;
import com.singtel.behaviours.impl.singable.CanSing;
import com.singtel.behaviours.impl.swimmable.CanSwim;
import com.singtel.behaviours.impl.walkable.CanWalk;
import com.singtel.model.Bird;
import com.singtel.model.Fish;
import com.singtel.model.Parent;
import com.singtel.model.animals.Butterfly;
import com.singtel.model.animals.Cat;
import com.singtel.model.animals.Dog;
import com.singtel.model.animals.Frog;
import com.singtel.model.birds.Chicken;
import com.singtel.model.birds.Duck;
import com.singtel.model.birds.Parrot;
import com.singtel.model.birds.Rooster;
import com.singtel.model.fish.Clownfish;
import com.singtel.model.fish.Shark;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author SMISC54
 */
public class Main {

    public static void main(String[] args) {
        Parent[] animals = new Parent[]{
            new Bird(),
            new Duck(),
            new Chicken(),
            new Rooster(),
            new Parrot(),
            new Fish(),
            new Shark(),
            new Clownfish(),
            new Frog(),
            new Dog(),
            new Butterfly(),
            new Cat()
        };
        List<Parent> names = Arrays.asList(animals);

        System.out.println(" how many of these animals can fly? " + names.stream().filter(p -> p.getFlyable() instanceof CanFly).toArray().length);
        System.out.println(" how many of these animals can swim?" + names.stream().filter(p -> p.getSwimmable() instanceof CanSwim).toArray().length);
        System.out.println(" how many of these animals can walk? " + names.stream().filter(p -> p.getWalkable() instanceof CanWalk).toArray().length);
        System.out.println(" how many of these animals can sing? " + names.stream().filter(p -> p.getSingable() instanceof CanSing).toArray().length);
        names.stream().filter(p -> p.getFlyable() != null);

    }
}
