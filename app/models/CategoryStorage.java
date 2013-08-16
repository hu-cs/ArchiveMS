package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import play.db.ebean.Model;

@SuppressWarnings("serial")
@Entity
public class CategoryStorage extends Model {

	@Id
	public String categoryName = "";

	public static Finder<String, CategoryStorage> find = new Finder<String, CategoryStorage>(
			String.class, CategoryStorage.class);

}
