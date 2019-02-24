package com.singtel.behaviours.impl.walkable;

import com.singtel.behaviours.IsWalk;

public class CrawlWalk implements IsWalk {
    @Override
    public void walk() {
        System.out.println("I am crawling");
    }
}
