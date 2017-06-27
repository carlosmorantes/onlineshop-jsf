package de.java2enterprise.onlineshop;

import java.io.Serializable;

import javax.annotation.Resource;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.transaction.UserTransaction;

@RequestScoped
@Named
public class RegisterController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//@Inject
	//private Customer customer;
	
	
	private String testEmail;
	private String testPassword;
	
	
	@PersistenceUnit
	private EntityManagerFactory emf;
	
	@Resource
	private UserTransaction ut;

	/*public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}*/
	
	public String persist(){
		try{
			//ut.begin();
			//emf.createEntityManager().persist(customer);
			//ut.commit();			
			FacesMessage m = new FacesMessage("Succesfully registration");
			FacesContext.getCurrentInstance().addMessage(null, m);			
		}catch(Exception e){
			e.printStackTrace();
		}
		return "/register.xhtml";
	}

	public String getTestEmail() {
		return testEmail;
	}

	public void setTestEmail(String testEmail) {
		this.testEmail = testEmail;
	}

	public String getTestPassword() {
		return testPassword;
	}

	public void setTestPassword(String testPassword) {
		this.testPassword = testPassword;
	}

}
