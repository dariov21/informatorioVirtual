package org.informatorio.site.persist;


import org.informatorio.site.model.User;

public interface UserServiceI{
    public void addUser(User user);
    public void removeUser(User user);
    public User searchUserByName(String name);
}

