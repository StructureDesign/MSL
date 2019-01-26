package com.msl.entity.user;

import com.msl.entity.book.Book;
import com.msl.exception.NoPermissionException;

import java.util.List;

/**
 * @author hxh
 * @date 2019-01-26 09:00
 */
abstract class UserFunction {

    abstract boolean createUser(User user) throws NoPermissionException;

    abstract List<User> searchUser(String query) throws NoPermissionException;

    abstract String generatePenaltyReport(String username) throws NoPermissionException;

    abstract String generateBorrowReport(String username) throws NoPermissionException;

    abstract boolean createBook(Book book) throws NoPermissionException;

    abstract boolean editBookInfo(Book book) throws NoPermissionException;

    abstract boolean updateUser(User user) throws NoPermissionException;
}
