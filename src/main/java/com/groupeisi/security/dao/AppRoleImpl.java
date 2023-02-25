package com.groupeisi.security.dao;

import com.groupeisi.security.config.HibernateUtil;
import com.groupeisi.security.entities.AppRole;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class AppRoleImpl implements IAppRole{
    private Session session;
    private Transaction transaction;
    public AppRoleImpl () {
        session = HibernateUtil.getSessionFactory().openSession();
    }
    public int save(AppRole appRole) {
        try {
            transaction = session.beginTransaction();
            session.save(appRole);
            transaction.commit();
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public AppRole get(int id) {
        return session.get(AppRole.class, id);
    }

    public int update(AppRole appRole) {
        try {
            transaction = session.beginTransaction();
            session.merge(appRole);
            transaction.commit();
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int remove(int id) {
        try {
            transaction = session.beginTransaction();
            session.delete(get(id));
            transaction.commit();
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
@SuppressWarnings("unchecked")
    public List<AppRole> getAll() {
        return session.createQuery("select role from AppRole role").getResultList();
    }
}
