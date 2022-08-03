package org.danp.samplehilt;

import javax.inject.Inject;

//assisted injection
public class Escuela {

    //@Inject
    private Director director;

    @Inject
    public Escuela(Director director) {
        this.director = director;
    }

    public void setDirectorName(String name) {
        director.setName(name);
    }

    public String getDirectorName() {
        return director.getName();
    }
}
