package controllers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

import models.CategoryStorage;
import models.DetailsStorage;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;

public class CategoryRemover extends Controller {

	public static Result removeCategory() {
		Form <CategoryStorage> categoryDetailsForm = Form.form(
				CategoryStorage.class).bindFromRequest();
		CategoryStorage categoryToDelete = categoryDetailsForm.get();
		if (!categoryToDelete.categoryName.equals("")) {
			removeCategoryFromDatabase(categoryToDelete);
			removeCategoryFromDisk(new File("public/uploads/"+categoryToDelete.categoryName));
//			return ok("Category '" + categoryToDelete.categoryName
//					+ "' is now Deleted");
			flash("success", "The selected category was deleted");
			return redirect(controllers.routes.Application.renderCategoryPage());
		} else
			return notFound("No category was selected");
	}

	public static void removeCategoryFromDatabase(
			CategoryStorage categoryToDelete) {
		List <DetailsStorage> records = DetailsStorage.find.where().eq("category", categoryToDelete.categoryName).findList();
		for(DetailsStorage currentRecord: records){
			DetailsStorage.find.byId(""+currentRecord.id).delete();
		}
		categoryToDelete.delete();

	}

	public static void removeCategoryFromDisk(File f) {
		
		if (f.isDirectory()) {
		    for (File c : f.listFiles())
		      removeCategoryFromDisk(c);
		  }
		if (!f.delete())
			try {
				throw new FileNotFoundException("Failed to delete file: " + f);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}
	
	

}
