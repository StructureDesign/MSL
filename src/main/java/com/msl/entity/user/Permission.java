package com.msl.entity.user;

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
    private boolean ableToUpdateUser;

    public Permission() {
        ableToCreateUser = false;
        ableToSearchUser = false;
        ableToGenerateBorrowReport = false;
        ableToGeneratePenaltyReport = false;
        ableToEditBookInfo = false;
        ableToCreateBook = false;
        ableToUpdateUser = false;
    }


    public Permission(boolean ableToCreateUser, boolean ableToSearchUser, boolean ableToGeneratePenaltyReport, boolean ableToGenerateBorrowReport, boolean ableToCreateBook, boolean ableToEditBookInfo, boolean ableToUpdateUser) {
        this.ableToCreateUser = ableToCreateUser;
        this.ableToSearchUser = ableToSearchUser;
        this.ableToGeneratePenaltyReport = ableToGeneratePenaltyReport;
        this.ableToGenerateBorrowReport = ableToGenerateBorrowReport;
        this.ableToCreateBook = ableToCreateBook;
        this.ableToEditBookInfo = ableToEditBookInfo;
        this.ableToUpdateUser = ableToUpdateUser;
    }

    public boolean isAbleToUpdateUser() {
        return ableToUpdateUser;
    }

    public void setAbleToUpdateUser(boolean ableToUpdateUser) {
        this.ableToUpdateUser = ableToUpdateUser;
    }

    public boolean isAbleToCreateUser() {
        return ableToCreateUser;
    }

    public void setAbleToCreateUser(boolean ableToCreateUser) {
        this.ableToCreateUser = ableToCreateUser;
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

    public void setAbleToGeneratePenaltyReport(boolean ableToGeneratePenaltyReport) {
        this.ableToGeneratePenaltyReport = ableToGeneratePenaltyReport;
    }

    public boolean isAbleToGenerateBorrowReport() {
        return ableToGenerateBorrowReport;
    }

    public void setAbleToGenerateBorrowReport(boolean ableToGenerateBorrowReport) {
        this.ableToGenerateBorrowReport = ableToGenerateBorrowReport;
    }

    public boolean isAbleToCreateBook() {
        return ableToCreateBook;
    }

    public void setAbleToCreateBook(boolean ableToCreateBook) {
        this.ableToCreateBook = ableToCreateBook;
    }

    public boolean isAbleToEditBookInfo() {
        return ableToEditBookInfo;
    }

    public void setAbleToEditBookInfo(boolean ableToEditBookInfo) {
        this.ableToEditBookInfo = ableToEditBookInfo;
    }
}
