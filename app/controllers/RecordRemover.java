package controllers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.StringTokenizer;

import models.DetailsStorage;
import play.mvc.Controller;

public class RecordRemover extends Controller {

	public void removeRecord(DetailsStorage uniqueRecord) {
		removeRecordFromDatabase(uniqueRecord);
		removeRecordFromDisk(new File("public/"+uniqueRecord.path), uniqueRecord);
	}

	public static void removeRecordFromDatabase(DetailsStorage uniqueRecord) {
		DetailsStorage.find.byId("" + uniqueRecord.id).delete();

	}

	public static void removeRecordFromDisk(File f, DetailsStorage uniqueRecord) {
		
		if (!f.delete())
			try {
				throw new FileNotFoundException("Failed to delete file: " + f);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

}
