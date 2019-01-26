package com.msl.entity.user;

import com.msl.entity.book.Book;
import com.msl.exception.NoPermissionException;

import java.util.List;

/**
 * @author hxh
 * @date 2019-01-26 09:00
 */
public class UserProxy extends UserFunction {
    private User user;

    public UserProxy(User user) {
        this.user = user;
    }

    public void setAbleToCreateUser(User user, boolean ableToCreateUser) throws NoPermissionException {
        if (this.user.isAbleToUpdatePermission()) {
            user.setAbleToCreateUser(ableToCreateUser);
        } else {
            throw new NoPermissionException();
        }
    }


    public void setAbleToSearchUser(User user, boolean ableToSearchUser) throws NoPermissionException {
        if (this.user.isAbleToUpdatePermission()) {
            user.setAbleToSearchUser(ableToSearchUser);
        } else {
            throw new NoPermissionException();
        }

    }


    public void setAbleToGeneratePenaltyReport(User user, boolean ableToGeneratePenaltyReport) throws NoPermissionException {
        if (this.user.isAbleToUpdatePermission()) {
            user.setAbleToGeneratePenaltyReport(ableToGeneratePenaltyReport);
        } else {
            throw new NoPermissionException();
        }
    }


    public void setAbleToGenerateBorrowReport(User user, boolean ableToGenerateBorrowReport) throws NoPermissionException {
        if (this.user.isAbleToUpdatePermission()) {
            user.setAbleToGenerateBorrowReport(ableToGenerateBorrowReport);
        } else {
            throw new NoPermissionException();
        }
    }


    public void setAbleToCreateBook(User user, boolean ableToCreateBook) throws NoPermissionException {
        if (this.user.isAbleToUpdatePermission()) {
            user.setAbleToCreateBook(ableToCreateBook);
        } else {
            throw new NoPermissionException();
        }
    }


    public void setAbleToEditBookInfo(User user, boolean ableToEditBookInfo) throws NoPermissionException {

        if (this.user.isAbleToUpdatePermission()) {
            user.setAbleToEditBookInfo(ableToEditBookInfo);
        } else {
            throw new NoPermissionException();
        }

    }


    public void setAbleToUpdateUser(User user, boolean ableToUpdateUser) throws NoPermissionException {
        if (this.user.isAbleToUpdatePermission()) {
            user.setAbleToUpdatePermission(ableToUpdateUser);
        } else {
            throw new NoPermissionException();
        }
    }

    @Override
    public boolean createUser(User user) throws NoPermissionException {
        if (!this.user.isAbleToCreateUser()) {
            throw new NoPermissionException();
        }
        return user.createUser(user);
    }

    @Override
    public List<User> searchUser(String query) throws NoPermissionException {
        if (!this.user.isAbleToSearchUser()) {
            throw new NoPermissionException();
        }
        return user.searchUser(query);
    }

    @Override
    public String generatePenaltyReport(String username) throws NoPermissionException {
        if (!this.user.isAbleToGeneratePenaltyReport()) {
            throw new NoPermissionException();
        }
        return user.generatePenaltyReport(username);
    }

    @Override
    public String generateBorrowReport(String username) throws NoPermissionException {
        if (!this.user.isAbleToGenerateBorrowReport()) {
            throw new NoPermissionException();
        }
        return user.generateBorrowReport(username);
    }

    @Override
    public boolean createBook(Book book) throws NoPermissionException {
        if (!this.user.isAbleToCreateBook()) {
            throw new NoPermissionException();
        }
        return user.createBook(book);
    }

    @Override
    public boolean editBookInfo(Book book) throws NoPermissionException {
        if (!this.user.isAbleToEditBookInfo()) {
            throw new NoPermissionException();
        }
        return user.editBookInfo(book);
    }
}
