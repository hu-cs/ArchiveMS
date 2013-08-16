package controllers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

import models.ActionSpecifier;
import models.CategoryStorage;
import models.DetailsStorage;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.update;

public class RecordSelector extends Controller {

	public static Result selectRecord(int id) throws FileNotFoundException {

		Form<ActionSpecifier> submitTypeForm = Form.form(ActionSpecifier.class)
				.bindFromRequest();
		ActionSpecifier actionType = submitTypeForm.get();

		DetailsStorage uniqueRecord = DetailsStorage.find.byId("" + id);
		if (actionType.submitType.equals("edit")) {
			new RecordUpdater(uniqueRecord);
			List<CategoryStorage> categories = CategoryStorage.find.all();
			return ok(update.render(uniqueRecord, categories));

		} else 
			if (actionType.submitType.equals("delete")) {
			new RecordRemover().removeRecord(uniqueRecord);
			RecordFinder.findRecord();
			return redirect(controllers.routes.PageMaker.makePage("manipulate"));

		} else if (actionType.submitType.equals("download")) {
			
			
			return redirect(routes.MediaDownloader.downloadMedia(uniqueRecord.path));

		}

		else {
			return redirect(routes.RecordPlayer.playRecord(uniqueRecord.path));

		}
		// }

	}
}
