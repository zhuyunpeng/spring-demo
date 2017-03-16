package com.demo.aop.anno;


import org.junit.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTransactionTest {

	private ApplicationContext ctx = null;
	private BookDao bookDao = null;
	private BookShopService bookShopService = null;

	{
		ctx = new ClassPathXmlApplicationContext("classpath:spring-aop-xml.xml");
		bookDao = ctx.getBean(BookDao.class);
		bookShopService = ctx.getBean(BookShopService.class);
	}
	

	@Test
	public void testBookShopService(){
		bookShopService.purchase("zhang", "AA");
	}
	
	@Test
	public void testBookShopDaoUpdateUserAccount(){
		bookDao.updateUserAccount("zhang", 200);
	}
	
	@Test
	public void testBookShopDaoUpdateBookStock(){
		bookDao.updateBookStock("AA");
	}
	


}
