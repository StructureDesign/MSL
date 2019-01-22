package com.msl;

import java.util.List;

/**
 * @author hxh
 * @date 2019-01-22 15:49
 */
public class Factory {
    private static List<User> admins;
    private static List<User> users;
    private static Factory factory;

    public Factory getFactory() {
        if (factory == null) {
            synchronized (Factory.class) {
                if (factory == null) {
                    factory = new Factory();
                }
            }
        }
        return factory;
    }

    public User getOrdinary() {
        User user = new User();
        users.add(user);
        return user;
    }

    public User getAdmin() {
        User user = new User();
        admins.add(user);
        return user;
    }

    private void register(User user) {
        for (User admin : admins) {
            user.register(admin);
        }
    }
}
