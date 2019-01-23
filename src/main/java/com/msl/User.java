package com.msl;

import java.util.List;

/**
 * @author hxh
 * @date 2019-01-22 15:44
 */
public class User {
    private Role role;
    private String name;
    private String phone;
    private String address;
    private String mail;
    private List<User> admins;

    public void register(User admin) {
        admins.add(admin);
    }

    public void notifyAdmin() {
        for (User u :
                admins) {
            u.receive(this.name);
        }
    }

    public void receive(String username) {
        System.out.println(username + " has changed his information");
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public List<User> getAdmins() {
        return admins;
    }

    public void setAdmins(List<User> admins) {
        this.admins = admins;
    }
}
