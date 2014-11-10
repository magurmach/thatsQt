package models.posts;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import java.util.*;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Post extends Model{
	
	public Date getPostDate() {
		return postDate;
	}

	public void setPostDate(Date postDate) {
		this.postDate = postDate;
	}

	@Id
	@GeneratedValue
	@Required
	public int id;
	
	@Required
	public String title;
	
	@Formats.DateTime(pattern="dd/MM/yyyy")
	public Date postDate=new Date();
	
	public String subtitle;
	
	@Column(columnDefinition = "TEXT")
	public String postbody;
	
	
	
	@Required
	@ManyToOne
	public Category category;
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPostbody() {
		return postbody;
	}

	public void setPostbody(String postbody) {
		this.postbody = postbody;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
	
}
