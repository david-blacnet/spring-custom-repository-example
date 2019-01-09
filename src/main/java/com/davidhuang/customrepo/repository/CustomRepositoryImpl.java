package com.davidhuang.customrepo.repository;

import com.davidhuang.customrepo.models.BaseModel;
import org.springframework.core.GenericTypeResolver;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.Collections;
import java.util.List;

public class CustomRepositoryImpl <T extends BaseModel, ID> implements CustomRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<T> findAllAndSort(Class cls) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<T> cq = cb.createQuery(cls);
        Root<T> re = cq.from(cls);
        CriteriaQuery<T> all = cq.select(re);
        TypedQuery<T> allQuery = entityManager.createQuery(all);

        List<T> listOfT = allQuery.getResultList();

        Collections.sort(listOfT);

        return listOfT;
    }

}
