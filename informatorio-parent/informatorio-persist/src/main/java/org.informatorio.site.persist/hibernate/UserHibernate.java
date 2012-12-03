package org.informatorio.site.persist.hibernate;

import org.informatorio.site.model.User;
import org.hibernate.Session;
import org.informatorio.site.persist.UserServiceI;


class UserHibernate implements UserServiceI{


    public void addUser(User user){

        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();


    }
    public void removeUser(User user){

    }

    public User searchUserByName(String name){
         return null;

    }

}