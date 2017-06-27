package de.java2enterprise.onlineshop;

import java.io.Serializable;
import java.util.Locale;

import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named
public class LanguageBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Locale locale = FacesContext.getCurrentInstance().getViewRoot().getLocale();
	
	public Locale getLocale(){
		return locale;
	}
	
	public String getLanguage(){
		return locale.getLanguage();
	}
	
	public void changeLocale(String language){
		locale = new Locale(language);
		FacesContext.getCurrentInstance().getViewRoot().setLocale(locale);
	}

}
