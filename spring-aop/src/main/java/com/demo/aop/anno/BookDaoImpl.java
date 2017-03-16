package com.demo.aop.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2017-03-16.
 */
@Repository("bookDao")
public class BookDaoImpl implements BookDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void updateBookStock(String isbn) {
        //检查书的库存是否足够, 若不够, 则抛出异常
        String sql2 = "SELECT stock FROM book_stock WHERE isbn = ?";
        int stock = jdbcTemplate.queryForObject(sql2, Integer.class, isbn);
        if (stock == 0) {
            throw new BookStockException("库存不足!");
        }

        String sql = "UPDATE book_stock SET stock = stock -1 WHERE isbn = ?";
        jdbcTemplate.update(sql, isbn);
    }

    public void updateUserAccount(String username, int price) {
        //验证余额是否足够, 若不足, 则抛出异常
        String sql2 = "SELECT balance FROM account WHERE username = ?";
        int balance = jdbcTemplate.queryForObject(sql2, Integer.class, username);
        if(balance < price){
            throw new UserAccountException("余额不足!");
        }

        String sql = "UPDATE account SET balance = balance - ? WHERE username = ?";
        jdbcTemplate.update(sql, price, username);
    }
}
