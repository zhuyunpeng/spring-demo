package com.demo.aop.anno;

/**
 * Created by Administrator on 2017-03-16.
 */
public interface BookDao {
    //更新数的库存. 使书号对应的库存 - 1
    public void updateBookStock(String isbn);

    //更新用户的账户余额: 使 username 的 balance - price
    public void updateUserAccount(String username, int price);
}
