package controller;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import model.Tweet;
import service.TweetEJB;

@ManagedBean(name ="TweetController")
@SessionScoped

public class TweetController {

	@EJB 
	TweetEJB tweetsystem;
	
	@ManagedProperty(value="#{tweet}")
	
	private Tweet tweet;
		
		private void addnewTweet() {
			
			tweetsystem.addnew(tweet.getEntity);
		}

		public Tweet getTweet() {
			return tweet;
		}

		public void setTweet(Tweet tweet) {
			this.tweet = tweet;
		}
		
	
	
}
