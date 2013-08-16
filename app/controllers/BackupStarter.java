package controllers;

import java.io.File;
import java.util.List;

import models.Container;
import models.DetailsStorage;
import play.mvc.Controller;
import play.mvc.Result;

public class BackupStarter extends Controller {

	public static Result startBackup() {

		List<DetailsStorage> backupList = Container.backupList;
		if(backupList.isEmpty()){
			flash("nothing", "nothing to backup");
			return redirect(routes.Application.renderBackupPage());
		}

		for (DetailsStorage recordToBackup : backupList) {

			try {
				File backupDirectory = new File("backup");
				if (!backupDirectory.exists())
					backupDirectory.mkdir();
				File category = new File(backupDirectory + "/"
						+ recordToBackup.category);
				if (!category.exists())
					category.mkdir();
				File tag = new File(category + "/" + recordToBackup.tag);
				if (!tag.exists())
					tag.mkdir();

				Archiver.archiveToDisk(
						new File("public/" + recordToBackup.path),
						new File(backupDirectory.getName()
								+ "/"
								+ category.getName()
								+ "/"
								+ tag.getName()
								+ "/"
								+ new File("public/" + recordToBackup.path)
										.getName()));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		Container.backupList.removeAll(backupList);
		Container.backListIndex = 0;
		
		flash("success", "The records were successfully backed up");
		return redirect(routes.Application.renderBackupPage());

	}

}
