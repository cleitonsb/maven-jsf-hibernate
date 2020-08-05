package dao;

import util.Hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.ArrayList;
import java.util.List;

public class DaoBase<E> {
    private EntityManager entityManager;

    public DaoBase(){
        entityManager = Hibernate.getEntityManager();
    }

    public void inserir(E entidade) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(entidade);
        transaction.commit();
    }

    public E get(Long id,  Class<E> entidade){
        E e = (E) entityManager.find(entidade, id);
        return e;
    }

    public List<E> getAll(Class<E> entidade){
        List<E> list = entityManager.createQuery("from " + entidade.getName()).getResultList();
        return list;
    }
}
