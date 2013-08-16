package controllers;

import models.UserStorage;
import play.mvc.Controller;
import play.mvc.Result;

public class UserRemover extends Controller {
	
	
	public static Result removeUser(String username){
		
		if(UserStorage.findByEmail(username)!=null){
			
			UserStorage.findByEmail(username).delete();
			flash("success", "user was removed");
			return redirect(routes.Application.renderRemoveUserPage()); 
			
		}
		
		else{
			
			flash("none", "User does not exist");
			return redirect(routes.Application.renderRemoveUserPage());
		}
		
		
		
	}

}
