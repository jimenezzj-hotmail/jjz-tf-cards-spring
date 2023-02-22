package com.jjimenezz.jjztfcards.model;

import java.time.LocalDate;

public class Figure {
    
    private String name;
    private LocalDate releaseYear;
    // private CollectionGroup collectGrp;
    private FigureType figureType;

    public String getName() {
        var r = 9;
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

}
