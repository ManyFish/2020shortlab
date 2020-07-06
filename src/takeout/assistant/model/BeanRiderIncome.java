package takeout.assistant.model;

import java.util.Date;

public class BeanRiderIncome {

	
	private int order_id;
	private int rider_id;
	private Date rz_time;
	private String user_comment;
	private float rider_income;
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public int getRider_id() {
		return rider_id;
	}
	public void setRider_id(int rider_id) {
		this.rider_id = rider_id;
	}
	public Date getRz_time() {
		return rz_time;
	}
	public void setRz_time(Date rz_time) {
		this.rz_time = rz_time;
	}
	public String getUser_comment() {
		return user_comment;
	}
	public void setUser_comment(String user_comment) {
		this.user_comment = user_comment;
	}
	public float getRider_income() {
		return rider_income;
	}
	public void setRider_income(float rider_income) {
		this.rider_income = rider_income;
	}
	
	
}
