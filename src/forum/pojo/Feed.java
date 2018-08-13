package forum.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "feeds")
public class Feed {

	@ManyToOne
	@JoinColumn(name = "userid")
	private User user;

	@Id
	@Column(name = "feedid")
	private int feedid;
	
	private String question;

	@Column(name = "feedstamp")
	private Date feedstamp;

	public int getFeedid() {
		return feedid;
	}

	public void setFeedid(int feedid) {
		this.feedid = feedid;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}



	public Date getFeedstamp() {
		return feedstamp;
	}

	public void setFeedstamp(Date feedstamp) {
		this.feedstamp = feedstamp;
	}

}
