package com.msl.entity.user;

/**
 * @author hxh
 * @date 2019-01-25 17:33
 */
public class Admin extends User {
    public Admin(String username, String password, String info) {
        super(username, password, info);
        setAdmin(true);
        setAbleToCreateBook(true);
        setAbleToCreateUser(true);
        setAbleToEditBookInfo(true);
        setAbleToGenerateBorrowReport(true);
        setAbleToGeneratePenaltyReport(true);
        setAbleToSearchUser(true);
        setAbleToUpdatePermission(true);
    }

}
