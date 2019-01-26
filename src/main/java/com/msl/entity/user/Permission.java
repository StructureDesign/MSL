package com.msl.entity.user;

import com.msl.entity.book.Book;
import com.msl.exception.NoPermissionException;

import java.util.List;

/**
 * @author hxh
 * @date 2019-01-25 16:25
 */
public class Permission {
    private boolean ableToCreateUser;
    private boolean ableToSearchUser;
    private boolean ableToGeneratePenaltyReport;
    private boolean ableToGenerateBorrowReport;
    private boolean ableToCreateBook;
    private boolean ableToEditBookInfo;

    public Permission() {
        ableToCreateUser = false;
        ableToSearchUser = false;
        ableToGenerateBorrowReport = false;
        ableToGeneratePenaltyReport = false;
        ableToEditBookInfo = false;
        ableToCreateBook = false;
    }

    public Permission(boolean ableToCreateUser, boolean ableToSearchUser, boolean ableToGeneratePenaltyReport, boolean ableToGenerateBorrowReport, boolean ableToCreateBook, boolean ableToEditBookInfo) {
        this.ableToCreateUser = ableToCreateUser;
        this.ableToSearchUser = ableToSearchUser;
        this.ableToGeneratePenaltyReport = ableToGeneratePenaltyReport;
        this.ableToGenerateBorrowReport = ableToGenerateBorrowReport;
        this.ableToCreateBook = ableToCreateBook;
        this.ableToEditBookInfo = ableToEditBookInfo;
    }

    boolean createUser(User user) throws NoPermissionException {
        if (!ableToCreateUser) {
            throw new NoPermissionException();
        }
        return false;
    }

    List<User> searchUser(String query) throws NoPermissionException {
        if (!ableToSearchUser) {
            throw new NoPermissionException();
        }
        return null;
    }

    String generatePenaltyReport(String userID) throws NoPermissionException {
        if (!ableToGeneratePenaltyReport) {
            throw new NoPermissionException();
        }
        return null;
    }

    String generateBorrowReport(String userID) throws NoPermissionException {
        if (!ableToGenerateBorrowReport) {
            throw new NoPermissionException();
        }
        return null;
    }

    boolean createBook(Book book) throws NoPermissionException {
        if (!ableToCreateBook) {
            throw new NoPermissionException();
        }
        return false;
    }

    boolean editBookInfo(Book book) throws NoPermissionException {
        if (!ableToEditBookInfo) {
            throw new NoPermissionException();
        }
        return false;
    }

    public boolean isAbleToCreateBook() {
        return ableToCreateBook;
    }

    public boolean isAbleToCreateUser() {
        return ableToCreateUser;
    }

    public boolean isAbleToEditBookInfo() {
        return ableToEditBookInfo;
    }

    public boolean isAbleToGenerateBorrowReport() {
        return ableToGenerateBorrowReport;
    }

    public boolean isAbleToGeneratePenaltyReport() {
        return ableToGeneratePenaltyReport;
    }

    public boolean isAbleToSearchUser() {
        return ableToSearchUser;
    }
}

