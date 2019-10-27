package model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name ="TweetEntitie")
public class TweetEntitie {

 @Id
 @GeneratedValue(strategy=GenerationType.AUTO)
 
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
