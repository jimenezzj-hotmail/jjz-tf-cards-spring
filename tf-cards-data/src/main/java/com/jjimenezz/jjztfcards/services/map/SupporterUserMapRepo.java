package com.jjimenezz.jjztfcards.services.map;

import java.util.Set;

import com.jjimenezz.jjztfcards.model.SupporterUser;
import com.jjimenezz.jjztfcards.services.ICrudServiceTf;
import com.jjimenezz.jjztfcards.services.ISupporterUserService;
import org.springframework.stereotype.Service;

@Service
public class SupporterUserMapRepo extends AbstractMapService<SupporterUser, Long>
        implements ISupporterUserService {

    @Override
    public Set<SupporterUser> getAll() {
        return super.selectAll();
    }

    @Override
    public SupporterUser getById(Long id) {
        return super.selectById(id);
    }

    @Override
    public SupporterUser save(SupporterUser newEntity) {
        return super.store(newEntity);
    }

    @Override
    public void delete(SupporterUser entity) {
        super.delete(entity);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

}
