package com.msl.entity.user;

import com.msl.borrowStrategy.AbstractBorrowStrategy;
import com.msl.entity.book.Book;
import com.msl.exception.NoPermissionException;

import java.io.Serializable;
import java.util.List;

/**
 * @author hxh
 * @date 2019-01-22 15:44
 */
public class User implements Serializable, ProfileObserver {

    private String username;
    private String password;
    private String info;
    private AbstractBorrowStrategy borrowStrategy;
    private int maxNumber;
    private int maxPeriod;
    protected boolean isAdmin;
    protected Permission permission;

    public User(String username, String password, String info) {
        this.username = username;
        this.password = password;
        this.info = info;
        this.isAdmin = false;
        this.permission = new Permission();
    }

    public boolean createUser(User user) throws NoPermissionException {
        return permission.createUser(user);
    }

    public List<User> searchUser(String query) throws NoPermissionException {

        return permission.searchUser(query);
    }

    public String generatePenaltyReport(String username) throws NoPermissionException {

        return permission.generatePenaltyReport(username);
    }

    public String generateBorrowReport(String username) throws NoPermissionException {

        return permission.generateBorrowReport(username);
    }

    public boolean createBook(Book book) throws NoPermissionException {

        return permission.createBook(book);
    }

    public boolean editBookInfo(Book book) throws NoPermissionException {

        return permission.editBookInfo(book);
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public void setPassword(String password) {
        this.password = password;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public void setPermission(Permission permission) {
        this.permission = permission;
    }

    @Override
    public void inform(String s) {

    }
}
