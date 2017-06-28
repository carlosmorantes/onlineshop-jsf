package de.java2enterprise.onlineshop;

import java.io.Serializable;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "userData", eager = true)
@SessionScoped
public class UserData implements Serializable {
   private static final long serialVersionUID = 1L;
   public Date date;

   public void send(){
	   System.out.println(">>>>> date sent: >>>>>" +date);
   }
   public Date getDate() {
      return date;
   }

   public void setDate(Date date) {
      this.date = date;
   }
}
