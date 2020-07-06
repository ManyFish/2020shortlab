package takeout.assistant.model;

import java.awt.Image;
import java.util.Date;

public class BeanProductComment {

	private int user_id;
	private int pro_id;
	private int business_id;
	private String pro_comment;
	private Date comment_date;
	private int com_level;
	private Image image;
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getPro_id() {
		return pro_id;
	}
	public void setPro_id(int pro_id) {
		this.pro_id = pro_id;
	}
	public int getBusiness_id() {
		return business_id;
	}
	public void setBusiness_id(int business_id) {
		this.business_id = business_id;
	}
	public String getPro_comment() {
		return pro_comment;
	}
	public void setPro_comment(String pro_comment) {
		this.pro_comment = pro_comment;
	}
	public Date getComment_date() {
		return comment_date;
	}
	public void setComment_date(Date comment_date) {
		this.comment_date = comment_date;
	}
	public int getCom_level() {
		return com_level;
	}
	public void setCom_level(int com_level) {
		this.com_level = com_level;
	}
	public Image getImage() {
		return image;
	}
	public void setImage(Image image) {
		this.image = image;
	}
	
	
}
