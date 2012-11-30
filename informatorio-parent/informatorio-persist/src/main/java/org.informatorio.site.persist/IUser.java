package org.informatorio.site.persist;

import org.hibernate.type.StringClobType;
import org.informatorio.site.model.User;

public interface IUser{
    public void addUser(User user);
    public void removeUser(User user);
    public User searchUserByName(String name);
}

