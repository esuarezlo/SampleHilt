package org.danp.samplehilt;

import javax.inject.Inject;

public class Director {
    private String name;

    @Inject
    public Director(){

    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
}
