package controllers;

import java.util.List;

import models.DetailsStorage;
import models.SearchCriteriaStorage;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;

public class RecordFinder extends Controller {

	public static SearchCriteriaStorage searchCriteria;

	public RecordFinder() {

	}

	public static Result findRecord() {

		Form<SearchCriteriaStorage> searchCriteriaForm = Form.form(
				SearchCriteriaStorage.class).bindFromRequest();

		SearchCriteriaStorage getSearchCriteria = searchCriteriaForm.get();
		if (getSearchCriteria.category != "" || getSearchCriteria.name != ""
				|| getSearchCriteria.tag != ""
				|| getSearchCriteria.recordDate != ""
				|| getSearchCriteria.publishDate != ""
				|| getSearchCriteria.archiveDate != ""
				&& !getSearchCriteria.equals(searchCriteria)){
			searchCriteria = searchCriteriaForm.get();
		}
			

		String query = new QueryCreator().createQuery(searchCriteria);
		List<DetailsStorage> records = findRecordFromDatabase(query);

		findRecordFromDisk();
		new PageMaker(records, searchCriteria.submitType);

		return redirect(controllers.routes.PageMaker
				.makePage(searchCriteria.submitType));
	}

	public static void findRecordFromDisk() {

	}

	public static List<DetailsStorage> findRecordFromDatabase(String query) {

		List<DetailsStorage> records = DetailsStorage.find.query().where(query)
				.findList();
		return records;

	}

}
