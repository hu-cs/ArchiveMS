package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import play.db.ebean.Model;

@Entity
@Table(name = "Records")
public class DetailsStorage extends Model {
	@Id
	public int id;
	public String category;
	public String name;
	public String tag;
	public String publishDate;
	public String recordDate;
	public String archiveDate;
	public String path;

	public static Finder<String, DetailsStorage> find = new Finder<String, DetailsStorage>(
			String.class, DetailsStorage.class);

}
