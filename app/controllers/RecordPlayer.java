package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;

public class RecordPlayer extends Controller {
	
	
	
	
	public static Result playRecord(String path){
		
		
		
		return ok(preview.render(path));
		
	}

}
