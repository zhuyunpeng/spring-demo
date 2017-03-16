package com.demo.aop.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("bookShopService")
public class BookShopServiceImpl implements BookShopService {

	@Autowired
	private BookDao bookDao;
	

//	@Transactional(propagation=Propagation.REQUIRES_NEW,
//			isolation=Isolation.READ_COMMITTED,
//			noRollbackFor={UserAccountException.class})
	@Transactional(propagation=Propagation.REQUIRED,
			isolation=Isolation.READ_COMMITTED,
			readOnly=false,
			timeout=3)
	public void purchase(String username, String isbn) {
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
		
		int price = 60;
		
		bookDao.updateBookStock(isbn);
		
		bookDao.updateUserAccount(username, price);
	}

}
