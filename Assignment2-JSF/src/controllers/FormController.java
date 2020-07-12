package controllers;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import beans.User;

@ManagedBean
public class FormController {

	public String onSubmit() {
		
		FacesContext context = FacesContext.getCurrentInstance();
		User user = context.getApplication().evaluateExpressionGet(context, "#{user}", User.class);
		System.out.print("You clicked the submit button");
		System.out.print("The First Name is: " + user.getFirstName());
		System.out.print("The Last Name is: " + user.getLastName());
		
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("user", user);
		
		return "Response.xhtml";
	}
	
}
