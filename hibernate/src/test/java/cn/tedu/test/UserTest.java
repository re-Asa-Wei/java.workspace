package cn.tedu.test;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Before;
import org.junit.Test;

import cn.tedu.entity.Book;
import cn.tedu.entity.TUser;
import cn.tedu.entity.User;

public class UserTest {
    
	Session session;
	
	@Before
	public void beforeTest(){
		Configuration cfg = new Configuration();
		//读取主配置文件
		cfg.configure("hibernate.cfg.xml");
		//获取session对象
		SessionFactory factory = cfg.buildSessionFactory();
	    session = factory.openSession();
	}
	
	@Test
	public void test1(){
		//通过session操作数据库
		User user = (User) session.get(User.class, 1);//通过id获取数据库数据
		System.out.println(user);
		//关闭session
		session.close();
	}
	
	@Test
	public void test2(){
		//Transaction tran = session.beginTransaction();
		//tran.begin();
		TUser user = (TUser) session.get(TUser.class, 1);
		System.out.println(user.getId());
		System.out.println(user.getName());
		Set<Book> books = user.getBooks();
		for(Book book:books){
		  System.out.println(book);
	    }
		//tran.commit();
		session.close();
		System.out.println(user);
		
	}
}
