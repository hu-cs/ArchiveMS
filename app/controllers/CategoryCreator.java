package controllers;

import java.io.File;

import models.CategoryStorage;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;

public class CategoryCreator extends Controller {

	public static Result addCategory() {
		Form<CategoryStorage> categoryNameFromForm = Form.form(
				CategoryStorage.class).bindFromRequest();
		CategoryStorage newCategory = categoryNameFromForm.get();
		CategoryStorage sameCategoryInDatabase = CategoryStorage.find.where()
				.eq("categoryName", newCategory.categoryName).findUnique();

		if (sameCategoryInDatabase == null) {
			addCategoryToDatabase(newCategory);
			addCategoryToDisk(newCategory);
			flash("addsuccess", "Category '"+newCategory.categoryName+"' was successfully added");
			
			return redirect(controllers.routes.Application.renderCategoryPage());

		} else {
			flash("exist", "the category already exist");
			return redirect(controllers.routes.Application.renderCategoryPage());
		}

		
	}

	private static void addCategoryToDisk(CategoryStorage newCategory) {

		File uploads = new File("public/uploads");
		if (!uploads.exists())
			uploads.mkdir();

		File theCategory = new File(uploads + "/" + newCategory.categoryName);

		
		if (!theCategory.exists()) {
			
			theCategory.mkdir();

		}

	}

	private static void addCategoryToDatabase(CategoryStorage newCategory) {
		newCategory.save();

	}
}
