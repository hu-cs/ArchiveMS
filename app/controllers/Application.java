package controllers;

import java.util.List;

import models.CategoryStorage;
import models.DetailsStorage;
import models.UserStorage;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;
import views.html.archive;
import views.html.category;
import views.html.index;
import views.html.record;
import views.html.search;
import views.html.add_user;
import views.html.remove_user;
import views.html.backup;
import views.html.report;
import views.html.update;

@Security.Authenticated(Secured.class)
public class Application extends Controller {

	public static Result index() {
		return ok(index.render());
	}

	
	public static Result renderArchivePage() {
		List<CategoryStorage> categories = CategoryStorage.find.all();
		return ok(archive.render(categories));
	}

	public static Result renderRecordPage() {
		List<CategoryStorage> categories = CategoryStorage.find.all();
		return ok(record.render(categories));
	}

	public static Result renderCategoryPage() {

		List<CategoryStorage> categories = CategoryStorage.find.all();
		return ok(category.render(categories));
	}
	
	public static Result renderAddUserPage(){
		
		
		return ok(add_user.render());
	}
	
	
	public static Result renderRemoveUserPage(){
		
		List <UserStorage> users = UserStorage.findAll();
		
		
		return ok(remove_user.render(users));
		
	}
	
	
	public static Result renderSearchPage(){
		List<CategoryStorage> categories = CategoryStorage.find.all();
		return ok(search.render(categories));
	}
	
	
	public static Result renderBackupPage(){
		
		
		return ok(backup.render());
	}
	
	
	public static Result renderReportPage(){
		
		List<CategoryStorage> categories = CategoryStorage.find.all();
		return ok(report.render(categories));
	}
	
	public static Result renderUpdatePage(int id){
		List <CategoryStorage> categories = CategoryStorage.find.all();
		DetailsStorage record = DetailsStorage.find.byId(""+id);
		if(record != null){
			return ok(update.render(record, categories));
		}
		
		else{
			flash("nothing", "no such record");
			return redirect(routes.Application.renderRecordPage());
		}
		
		
		
	}

}
