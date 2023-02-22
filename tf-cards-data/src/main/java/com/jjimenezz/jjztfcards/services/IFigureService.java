package com.jjimenezz.jjztfcards.services;

import java.util.Set;

import com.jjimenezz.jjztfcards.model.Figure;

public interface IFigureService extends ICrudServiceTf<Figure, Long>{
    
    Set<Figure> getAllByType();

}
