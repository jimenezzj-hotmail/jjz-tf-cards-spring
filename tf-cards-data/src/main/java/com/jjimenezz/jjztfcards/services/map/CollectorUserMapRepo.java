package com.jjimenezz.jjztfcards.services.map;

import java.util.Set;

import com.jjimenezz.jjztfcards.model.BaseUser;
import com.jjimenezz.jjztfcards.model.CollectorUser;
import com.jjimenezz.jjztfcards.services.ICollectorsUserService;
import org.springframework.stereotype.Service;

@Service
public class CollectorUserMapRepo extends AbstractMapService<CollectorUser, Long> implements ICollectorsUserService {

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
        return super.store(newEntity);
    }


}
