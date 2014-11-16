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
import play.data.format.Formats.DateFormatter;
import play.data.validation.*;

@Entity
public class Post extends Model{

	@Id
	@GeneratedValue
	@Required
	public int id;
	
	@Required
	public String title;
	
	@Formats.DateTime(pattern="dd/MM/yyyy")
	public Date postDate=new Date();
	
	public String subtitle;
	
	public String summary;

	@Column(columnDefinition = "TEXT")
	public String postbody;
	
	
	public boolean postStatus=false;
	
	@Required
	@ManyToOne
	public Category category;
	
	public static Finder<Integer,Post> find = 
			new Finder<Integer, Post> (Integer.class, Post.class);
	
	
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

	public boolean isPostStatus() {
		return postStatus;
	}

	public void setPostStatus(boolean postStatus) {
		this.postStatus = postStatus;
	}
	
	public Date getPostDate() {
		return postDate;
	}

	public void setPostDate(Date postDate) {
		this.postDate = postDate;
	}
	
	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}
	
	public String getDateString()
	{
		String ret="";
		DateFormatter formatter=new DateFormatter("dd MMM, yyyy h:m a");
		ret=formatter.print(postDate,Locale.getDefault());
		return ret;
	}
	
}
