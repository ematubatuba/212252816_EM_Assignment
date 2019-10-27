package model;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name ="Tweet")
@SessionScoped

public class Tweet {
	
	 private long id;
	 private String tweetbody;
	 private Date tweetTimestape;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTweetbody() {
		return tweetbody;
	}
	public void setTweetbody(String tweetbody) {
		this.tweetbody = tweetbody;
	}
	public Date getTweetTimestape() {
		return tweetTimestape;
	}
	public void setTweetTimestape(Date tweetTimestape) {
		this.tweetTimestape = tweetTimestape;
	}
	 
	 
	 

}
