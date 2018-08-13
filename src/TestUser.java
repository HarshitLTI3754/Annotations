import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import forum.pojo.User;
import lti.util.HibernateUtil;


public class TestUser {

	@Test
	public void testSaveUser() {
		Session session = HibernateUtil.getSession();
		Transaction txn = session.getTransaction();
		txn.begin();
		User tu=new User();
		tu.setUserid("12534");
		tu.setEmail("a@mail.com");
		tu.setPassword("abc");
		session.save(tu);		//saving customer object
		txn.commit();
}
}