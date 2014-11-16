package models.posts;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import play.db.ebean.Model;
import play.db.ebean.Model.Finder;

@Entity
public class Category extends Model{
	
	@Id
	@GeneratedValue
	public int id;
	
	public String name;
	
	public String imageDirectory;
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	
	

	public void setName(String name) {
		this.name = name;
	}

	public String getImageDirectory() {
		return imageDirectory;
	}

	public void setImageDirectory(String imageDirectory) {
		this.imageDirectory = imageDirectory;
	}
	
	public static Finder<Integer,Category> find = 
			new Finder<Integer, Category> (Integer.class, Category.class);
	
}
