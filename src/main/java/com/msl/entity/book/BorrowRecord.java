package com.msl.entity.book;

import java.io.Serializable;

/**
 * @author hxh
 * @date 2019-01-25 15:41
 */
public class BorrowRecord implements Serializable {
    private String  bid;
    private String  username;
    private String  borrowTime;
    private String  returnTime;

    public BorrowRecord(String bid, String username, String borrowTime, String returnTime) {
        this.bid = bid;
        this.username = username;
        this.borrowTime = borrowTime;
        this.returnTime = returnTime;
    }
}
