package controllers;

import java.io.File;
import java.util.StringTokenizer;

import models.DetailsStorage;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;

public class RecordUpdater extends Controller {

	public static DetailsStorage recordForUpdate;

	public RecordUpdater(DetailsStorage recordForUpdate) {
		RecordUpdater.recordForUpdate = recordForUpdate;

	}

	public static Result updateRecord() {

		Form<DetailsStorage> updateForm = Form.form(DetailsStorage.class)
				.bindFromRequest();
		DetailsStorage updateDetails = updateForm.get();

		DetailsStorage detailsFromDatabase = DetailsStorage.find.byId(""
				+ recordForUpdate.id);

		updateRecordInDisk(detailsFromDatabase, updateDetails);
		updateRecordInDatabase(updateDetails);
		flash("success", "the record was successfully updated");
		return redirect(controllers.routes.Application.renderRecordPage());
	}

	public static void updateRecordInDatabase(DetailsStorage updateDetails) {

		updateDetails.update(recordForUpdate.id);

	}

	public static void updateRecordInDisk(DetailsStorage detailsFromDatabase,
			DetailsStorage updateDetails) {

		File category = new File("public/uploads/" + updateDetails.category);
		if (!category.exists())
			category.mkdir();

		File tag = new File("public/uploads/" + updateDetails.category + "/"
				+ updateDetails.tag);
		if (!tag.exists())
			tag.mkdir();

		File record = new File("public/" + detailsFromDatabase.path);

		StringTokenizer st = new StringTokenizer(record.getName(), ".");
		String extension = ".flv";
		while (st.hasMoreTokens())
			extension = "." + st.nextToken();

		updateDetails.path = "uploads/" + updateDetails.category + "/"
				+ updateDetails.tag + "/" + updateDetails.name + extension;
		updateDetails.update(recordForUpdate.id);

		record.renameTo(new File("public/" + updateDetails.path));

	}

}
