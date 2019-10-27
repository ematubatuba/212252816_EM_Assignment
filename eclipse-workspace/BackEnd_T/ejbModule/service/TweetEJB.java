package service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import model.TweetEntitie;

@Stateless
@LocalBean
public class TweetEJB {
	
	@PersistenceContext
	
	private EntityManager tw;
	
	public TweetEJB() {
		
	}
	
	public void addnew(TweetEntitie tweetentitie) {
		
		tw.persist(tweetentitie);
	}

}
