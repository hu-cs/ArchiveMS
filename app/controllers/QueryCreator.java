package controllers;

import java.util.Date;

import models.SearchCriteriaStorage;
import play.mvc.Controller;

public class QueryCreator extends Controller {

	public String createQuery(SearchCriteriaStorage searchCriteria) {
		String query = "";
		boolean checkMoreThanOne = false;

		if (!searchCriteria.name.equals("")) {
			query = query + " name = '" + searchCriteria.name + "'";
			checkMoreThanOne = true;
		}
		if (!searchCriteria.tag.equals("")) {
			if (checkMoreThanOne == true)
				query = query + " and ";
			query = query + "tag = '" + searchCriteria.tag + "'";
			checkMoreThanOne = true;
		}
		if (!searchCriteria.category.equals("")) {
			if (checkMoreThanOne == true)
				query = query + " and ";
			query = query + "category = '" + searchCriteria.category + "'";
			checkMoreThanOne = true;
		}
		if (!searchCriteria.recordDate.equals("")) {
			if (checkMoreThanOne == true)
				query = query + " and ";
			query = query + "recordDate = '" + searchCriteria.recordDate + "'";
			checkMoreThanOne = true;
		}
		if (!searchCriteria.publishDate.equals("")) {
			if (checkMoreThanOne == true)
				query = query + " and ";
			query = query + "publishDate = '" + searchCriteria.publishDate
					+ "'";
			checkMoreThanOne = true;
		}
		 if (!searchCriteria.archiveDate.equals("")) {
			 if(checkMoreThanOne == true)
					query = query + " and ";
		 query = query + " and archiveDate = '" + searchCriteria.archiveDate
		 + "'";
		 }

		return query;

	}

}
