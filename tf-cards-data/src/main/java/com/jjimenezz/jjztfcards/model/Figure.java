package com.jjimenezz.jjztfcards.model;

import java.time.LocalDate;

public class Figure extends BaseEntity {

    private String name;
    private LocalDate releaseYear;
    // private CollectionGroup collectGrp;
    private FigureType figureType;
    private CollectorUser userOwner;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(LocalDate releaseYear) {
        this.releaseYear = releaseYear;
    }

    public FigureType getFigureType() {
        return figureType;
    }

    public void setFigureType(FigureType figureType) {
        this.figureType = figureType;
    }

    public CollectorUser getUserOwner() {
        return userOwner;
    }

    public void setUserOwner(CollectorUser userOwner) {
        this.userOwner = userOwner;
    }
}
