package com.jjimenezz.jjztfcards.services.map;


import com.jjimenezz.jjztfcards.model.Figure;
import com.jjimenezz.jjztfcards.services.IFigureService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class FigureMapRepo extends AbstractMapService<Figure, Long> implements IFigureService {

    @Override
    public Set<Figure> getAll() {
        return super.selectAll();
    }

    @Override
    public Figure getById(Long id) {
        return super.selectById(id);
    }

    @Override
    public Figure save(Figure newEntity) {

        return super.store(newEntity);
    }

    @Override
    public void delete(Figure entity) {
        super.delete(entity);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Set<Figure> getAllByType() {
        return Set.of();
    }
}
