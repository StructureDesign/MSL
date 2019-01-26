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

    @Override
    public boolean updateUser(User user) throws NoPermissionException {
        if (!this.user.isAbleToUpdateUser()) {
            throw new NoPermissionException();
        }
        return user.updateUser(user);
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
