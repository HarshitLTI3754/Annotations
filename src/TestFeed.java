import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import forum.pojo.Feed;
import lti.util.HibernateUtil;

public class TestFeed {

	@Test
	public void testSavefeed() {
		Session session = HibernateUtil.getSession();
		Transaction txn = session.getTransaction();
		txn.begin();
		Feed fe=new Feed();	
		fe.setFeedid(120);
		fe.setQuestion("hello question");
		
		
		session.save(fe);		
		txn.commit();
}
	}


