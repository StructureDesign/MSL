package com.msl.entity.user;

import com.msl.borrowStrategy.BorrowStrategy;
import com.msl.entity.book.Book;
import com.msl.exception.NoPermissionException;
import com.msl.util.NotificationHelper;

import java.io.Serializable;
import java.util.List;

/**
 * @author hxh
 * @date 2019-01-22 15:44
 */
public class User extends UserFunction implements Serializable, ProfileObserver {

    private String username;
    private String password;
    private String info;
    private BorrowStrategy borrowStrategy;
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

    public boolean isAbleToUpdateUser() {
        return permission.isAbleToUpdateUser();
    }

    public boolean isAbleToCreateUser() {
        return permission.isAbleToCreateUser();
    }

    public boolean isAbleToSearchUser() {
        return permission.isAbleToSearchUser();
    }

    public boolean isAbleToGeneratePenaltyReport() {
        return permission.isAbleToGeneratePenaltyReport();
    }

    public boolean isAbleToGenerateBorrowReport() {
        return permission.isAbleToGenerateBorrowReport();
    }

    public boolean isAbleToCreateBook() {
        return permission.isAbleToCreateBook();
    }

    public boolean isAbleToEditBookInfo() {
        return permission.isAbleToEditBookInfo();
    }

    @Override
    boolean createUser(User user) throws NoPermissionException {
        return false;
    }

    @Override
    List<User> searchUser(String query) throws NoPermissionException {
        return null;
    }

    @Override
    String generatePenaltyReport(String username) throws NoPermissionException {
        return null;
    }

    @Override
    String generateBorrowReport(String username) throws NoPermissionException {
        return null;
    }

    @Override
    boolean createBook(Book book) throws NoPermissionException {
        return false;
    }

    @Override
    boolean editBookInfo(Book book) throws NoPermissionException {
        return false;
    }

    @Override
    boolean updateUser(User user) throws NoPermissionException {
        return false;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public void setBorrowStrategy(BorrowStrategy borrowStrategy) {
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
        NotificationHelper.help(s);
    }
}
