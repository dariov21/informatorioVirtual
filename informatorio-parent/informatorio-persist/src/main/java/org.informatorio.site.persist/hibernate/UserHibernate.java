package org.informatorio.site.persist.hibernate;

import org.hibernate.type.StringClobType;

class UserHibernate implements IUser{


    public void addUser(User user){

        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();


    }
    public void removeUser(User user){

    }

    public User searchUserByName(String name){



    }

}