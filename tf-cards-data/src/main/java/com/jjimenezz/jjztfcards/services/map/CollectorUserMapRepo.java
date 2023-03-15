package com.jjimenezz.jjztfcards.services.map;

import java.util.Set;

import com.jjimenezz.jjztfcards.model.BaseUser;
import com.jjimenezz.jjztfcards.model.CollectorUser;
import com.jjimenezz.jjztfcards.services.ICollectorsUserService;
import com.jjimenezz.jjztfcards.services.IFigureService;
import com.jjimenezz.jjztfcards.services.IFigureTypeService;
import org.springframework.stereotype.Service;

@Service
public class CollectorUserMapRepo extends AbstractMapService<CollectorUser, Long> implements ICollectorsUserService {

    private final IFigureService figureService;
    private final IFigureTypeService fgTypeService;

    public CollectorUserMapRepo(IFigureService figureService, IFigureTypeService fgTypeService) {
        this.figureService = figureService;
        this.fgTypeService = fgTypeService;
    }

    @Override
    public Set<CollectorUser> getAll() {
        return super.selectAll();
    }

    @Override
    public CollectorUser getById(Long id) {
        return super.selectById(id);
    }

    @Override
    public void delete(CollectorUser entity) {
        super.delete(entity);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public CollectorUser save(CollectorUser newEntity) {
        if (newEntity == null) throw new RuntimeException("newEntity is null");
        newEntity.getFigures().forEach(f -> {
            if (f.getFigureType() == null) throw new RuntimeException("Figure Type cannot be Null");
            else {
                if (f.getFigureType().getId() == null) {
                    var newFgType = this.fgTypeService.save(f.getFigureType());
                    f.getFigureType().setId(newFgType.getId());
                }
            }
            if (f.getId() == null) {
                var newFg = this.figureService.save(f);
                f.setId(newFg.getId());
            }
        });
        return super.store(newEntity);

    }


}
