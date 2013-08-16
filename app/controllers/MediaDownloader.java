package controllers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import models.DetailsStorage;
import play.mvc.Controller;
import play.mvc.Result;

public class MediaDownloader extends Controller {
	
	
	
	
	public static Result downloadMedia(String uniqueRecordPath) throws FileNotFoundException{
		
		
		return ok(new FileInputStream(new File("public/"+uniqueRecordPath)));
		
	}

}
