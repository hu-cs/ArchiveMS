package controllers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.StringTokenizer;

import models.CategoryStorage;
import models.Container;
import models.DetailsStorage;

import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http.MultipartFormData;
import play.mvc.Http.MultipartFormData.FilePart;

public class Archiver extends Controller {

	public static Result archive() {

		// file details form
		Form<DetailsStorage> detailsForm = Form.form(DetailsStorage.class)
				.bindFromRequest();
		DetailsStorage recordDetails = detailsForm.get();
		DetailsStorage check = DetailsStorage.find.where()
				.eq("name", recordDetails.name)
				.eq("category", recordDetails.category)
				.eq("tag", recordDetails.tag).findUnique();
		if (check != null) {

			flash("exist", "A file with this name already exist");
			return redirect(routes.Application.renderArchivePage());

		}

		// file form
		MultipartFormData recordForm = request().body().asMultipartFormData();

		FilePart record = recordForm.getFile("record");

		if (record != null) {
			String fileName = record.getFilename();

			String extension = ".avi";

			StringTokenizer st = new StringTokenizer(fileName, ".");
			while (st.hasMoreTokens()) {
				extension = st.nextToken();
			}

			File file = record.getFile();
			List<CategoryStorage> categories = CategoryStorage.find.all();

			try {

				for (int index = 0; index < categories.size(); index++) {

					if (recordDetails.category
							.equals(categories.get(index).categoryName)) {

						File tag = new File("public/uploads/"
								+ recordDetails.category + "/"
								+ recordDetails.tag);
						if (!tag.exists()) {
							tag.mkdir();
						}

						recordDetails.path = "uploads/"
								+ categories.get(index).categoryName + "/"
								+ recordDetails.tag + "/" + recordDetails.name
								+ "." + extension;
						// in order to upload file the : uploads/lessons/ .
						// folder should exist in the project
						archiveToDisk(file, new File("public/"
								+ recordDetails.path));
						archiveToDatabase(recordDetails);

						Container.backupList.add(Container.backListIndex++,
								recordDetails);
						break;
					}

				}

			} catch (Exception ex) {
				return ok(ex.getMessage());
			}
			flash("success", "The File was successfully archived");
			return redirect(routes.Application.renderArchivePage());

		} else {
			flash("error", "Missing file");
			return redirect(routes.Application.renderArchivePage());
		}

	}

	public static void archiveToDisk(File source, File destination)
			throws Exception {

		InputStream src = new FileInputStream(source);

		OutputStream dest = new FileOutputStream(destination);

		byte buf[] = new byte[1024];
		int read = -1;
		while ((read = src.read(buf)) != -1)
			dest.write(buf, 0, read);

		src.close();
		dest.close();
	}

	public static void archiveToDatabase(DetailsStorage details) {

		details.save();

	}

}
