package com.msl;

import com.msl.borrowStrategy.AbstractBorrowStrategy;

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
    private AbstractBorrowStrategy borrowStrategy;
    private int maxNumber;
    private int maxPeriod;

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

    public void setBorrowStrategy(AbstractBorrowStrategy borrowStrategy) {
        this.borrowStrategy = borrowStrategy;
        this.maxNumber = borrowStrategy.getMaxNumber();
        this.maxPeriod = borrowStrategy.getMaxPeriod();
    }

    public int getMaxPeriod() {
        return maxPeriod;
    }

    public int getMaxNumber() {
        return maxNumber;
    }
}
