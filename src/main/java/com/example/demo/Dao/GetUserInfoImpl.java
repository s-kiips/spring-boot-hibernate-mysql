package com.example.demo.Dao;

import com.example.demo.Entity.Firsttable;
import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.type.IntegerType;
import org.hibernate.type.StringType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;

/**
 * Created by abin on 7/30/2017.
 */
@Repository
public class GetUserInfoImpl implements GetUserInfo {

    @Autowired
    SessionFactory sessionFactory;
    Session session;


    @Override

    public Collection<Firsttable> sendUserInfo() {
        try {
            session= sessionFactory.openSession();
            String sql="select * from firsttable";
            SQLQuery query= session.createSQLQuery(sql);
            query.addScalar("id", IntegerType.INSTANCE);
            query.addScalar("name", StringType.INSTANCE);
            query.addScalar("surname",StringType.INSTANCE);
            query.addScalar("address",StringType.INSTANCE);
            return query.list();

        } catch (HibernateException e) {
            e.printStackTrace();
            return null;
        } finally {
            session.close();
        }


    }
}
