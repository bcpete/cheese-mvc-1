package org.launchcode.models;

import java.lang.ref.SoftReference;

/**
 * Created by Brady on 3/26/17.
 */
public enum CheeseType {

    HARD ("Hard"),
    SOFT ("Soft"),
    FAKE ("Fake");

    private final String name;

    CheeseType(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

}
