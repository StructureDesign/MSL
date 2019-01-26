package com.msl.entity.user;

import com.msl.borrowStrategy.BorrowStrategy;
import com.msl.entity.book.Book;
import com.msl.exception.NoPermissionException;
import com.msl.util.Identify;
import com.msl.util.NotificationHelper;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.io.Serializable;
import java.util.ArrayList;
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
    private boolean isAdmin;
    private boolean ableToCreateUser;
    private boolean ableToSearchUser;
    private boolean ableToGeneratePenaltyReport;
    private boolean ableToGenerateBorrowReport;
    private boolean ableToCreateBook;
    private boolean ableToEditBookInfo;
    private boolean ableToUpdatePermission;
    private Identify identify;

    public String getPassword() {
        return password;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        inform(username + "has changed his info form " + this.info + " to " + info);
        this.info = info;
    }

    public void setIdentify(Identify identify) {
        this.identify = identify;
    }

    public String getIdentify() {
        return identify.toString();
    }

    public BorrowStrategy getBorrowStrategy() {
        return borrowStrategy;
    }

    public void setMaxNumber(int maxNumber) {
        this.maxNumber = maxNumber;
    }

    public void setMaxPeriod(int maxPeriod) {
        this.maxPeriod = maxPeriod;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public boolean isAbleToCreateUser() {
        return ableToCreateUser;
    }

    public void setAbleToCreateUser(boolean ableToCreateUser) {
        this.ableToCreateUser = ableToCreateUser;
    }

    public User(String username, String password, String info) {
        this.username = username;
        this.password = password;
        this.info = info;
        this.isAdmin = false;
        this.identify = Identify.Teacher;
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

    public boolean isAbleToSearchUser() {
        return ableToSearchUser;
    }

    public void setAbleToSearchUser(boolean ableToSearchUser) {
        this.ableToSearchUser = ableToSearchUser;
    }

    public boolean isAbleToGeneratePenaltyReport() {
        return ableToGeneratePenaltyReport;
    }

    void setAbleToGeneratePenaltyReport(boolean ableToGeneratePenaltyReport) {
        this.ableToGeneratePenaltyReport = ableToGeneratePenaltyReport;
    }

    public boolean isAbleToGenerateBorrowReport() {
        return ableToGenerateBorrowReport;
    }

    void setAbleToGenerateBorrowReport(boolean ableToGenerateBorrowReport) {
        this.ableToGenerateBorrowReport = ableToGenerateBorrowReport;
    }

    public boolean isAbleToCreateBook() {
        return ableToCreateBook;
    }

    void setAbleToCreateBook(boolean ableToCreateBook) {
        this.ableToCreateBook = ableToCreateBook;
    }

    public boolean isAbleToEditBookInfo() {
        return ableToEditBookInfo;
    }

    void setAbleToEditBookInfo(boolean ableToEditBookInfo) {
        this.ableToEditBookInfo = ableToEditBookInfo;
    }

    public boolean isAbleToUpdatePermission() {
        return ableToUpdatePermission;
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

    public void setAbleToUpdatePermission(boolean ableToUpdatePermission) {
        this.ableToUpdatePermission = ableToUpdatePermission;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public List<Boolean> permissionList(){
        List<Boolean> list = new ArrayList<>();
        if (isAbleToCreateUser())   list.add(true);
        else list.add(false);
        if (isAbleToSearchUser())   list.add(true);
        else list.add(false);
        if (isAbleToGenerateBorrowReport()) list.add(true);
        else list.add(false);
        if (isAbleToGeneratePenaltyReport())    list.add(true);
        else list.add(false);
        if (isAbleToCreateBook())   list.add(true);
        else list.add(false);
        if (isAbleToEditBookInfo()) list.add(true);
        else list.add(false);
        return list;
    }


    @Override
    public void inform(String s) {
        NotificationHelper.help(s);
    }
}
