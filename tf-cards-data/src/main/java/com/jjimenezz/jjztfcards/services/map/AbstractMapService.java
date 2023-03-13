package com.jjimenezz.jjztfcards.services.map;

import com.jjimenezz.jjztfcards.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity, I extends Long> {

    protected Map<Long, T> persistenceMap = new HashMap<>();

    Set<T> selectAll() {
        return new HashSet<>(this.persistenceMap.values());
    }

    T selectById(I id) {
        return persistenceMap.get(id);
    }

    T store(T newObj) {
        if (newObj != null) {
            if (newObj.getId() == null) newObj.setId(generateNextId());
        } else throw new RuntimeException("Entity was tried to be stored is null");
        return persistenceMap.put(newObj.getId(), newObj);
    }

    void deleteById(I id) {
        persistenceMap.remove(id);
    }

    void delete(T pObj) {
        persistenceMap.entrySet().removeIf(obj -> obj.getValue().equals(pObj));
    }

    private Long generateNextId() {
        Long resNextId = null;
        if (persistenceMap.keySet().size() == 0) resNextId = 1L;
        else {
            Long maxVal = Collections.max(persistenceMap.keySet());
            for (long i = maxVal; 0 == (i % 10); i--) {
                if (!persistenceMap.containsKey(i)) resNextId = i;
            }
        }
        return resNextId;
    }
}
