package takeout.assistant.model;

import java.util.Date;

public class BeanUser {
	
	private String user_id;
	private String user_name;
	private String user_sex;
	private String user_pwd;
	private String user_phone;
	private String user_email;
	private String user_city;
	private Date registdate;
	private Boolean ifvip;
	private Date vipddl;
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_sex() {
		return user_sex;
	}
	public void setUser_sex(String user_sex) {
		this.user_sex = user_sex;
	}
	public String getUser_pwd() {
		return user_pwd;
	}
	public void setUser_pwd(String user_pwd) {
		this.user_pwd = user_pwd;
	}
	public String getUser_phone() {
		return user_phone;
	}
	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public String getUser_city() {
		return user_city;
	}
	public void setUser_city(String user_city) {
		this.user_city = user_city;
	}
	public Date getRegistdate() {
		return registdate;
	}
	public void setRegistdate(Date registdate) {
		this.registdate = registdate;
	}
	public Boolean getIfvip() {
		return ifvip;
	}
	public void setIfvip(Boolean ifvip) {
		this.ifvip = ifvip;
	}
	public Date getVipddl() {
		return vipddl;
	}
	public void setVipddl(Date vipddl) {
		this.vipddl = vipddl;
	}
	
	
}
