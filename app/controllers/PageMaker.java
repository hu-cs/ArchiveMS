package controllers;

import java.util.List;

import models.ActionSpecifier;
import models.DetailsStorage;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;

public class PageMaker extends Controller {

	public static List<DetailsStorage> records;
	public static String submitType;

	public PageMaker(List<DetailsStorage> records, String submitType) {

		PageMaker.records = records;
		PageMaker.submitType = submitType;

	}

	public static Result makePage(String submitType) {
		
		if(records.isEmpty())
			flash("nothing", "nothing found");

		if (submitType.equals("search")){
			new ActionSpecifier().submitType = "";
			
			return ok(searched.render(records));
		}
			
		else if(submitType.equals("manipulate")){
			new ActionSpecifier().submitType = "";
			return ok(searched_record.render(records));
		}
			
		else{
			
			return ok(report_result.render(records));
		}
			//this is report
			
	}
}
