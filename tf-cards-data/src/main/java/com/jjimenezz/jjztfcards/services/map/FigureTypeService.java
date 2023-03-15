package com.jjimenezz.jjztfcards.services.map;

import com.jjimenezz.jjztfcards.model.FigureType;
import com.jjimenezz.jjztfcards.services.IFigureTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class FigureTypeService extends AbstractMapService<FigureType, Long> implements IFigureTypeService {
    @Override
    public Set<FigureType> getAll() {
        return super.selectAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(FigureType entity) {
        super.delete(entity);
    }

    @Override
    public FigureType getById(Long aLong) {
        return super.selectById(aLong);
    }

    @Override
    public FigureType save(FigureType newEntity) {
        return super.store(newEntity);
    }
}
