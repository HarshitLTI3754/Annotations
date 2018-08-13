package forum.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "comments")
public class Comment {
	@Id
	@Column(name = "comid")
	private int comid;

	@ManyToOne
	@JoinColumn(name="feedid")
	private Feed feeds;


	@ManyToOne
	@JoinColumn(name="userid")
	private User user;
	
	@Column(name = "comment")
	private String comment;

	@Column(name = "feedstamp")
	private Date feedstamp;

	public int getComid() {
		return comid;
	}

	public void setComid(int comid) {
		this.comid = comid;
	}

	public Feed getFeeds() {
		return feeds;
	}

	public void setFeeds(Feed feeds) {
		this.feeds = feeds;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Date getFeedstamp() {
		return feedstamp;
	}

	public void setFeedstamp(Date feedstamp) {
		this.feedstamp = feedstamp;
	}

}
