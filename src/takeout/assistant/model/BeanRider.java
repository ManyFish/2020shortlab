package takeout.assistant.model;

import java.util.Date;

public class BeanRider {
	
	private String rider_id;
	private String rider_name;
	private Date entry_time;
	private String rider_identity;
	public String getRider_id() {
		return rider_id;
	}
	public void setRider_id(String rider_id) {
		this.rider_id = rider_id;
	}
	public String getRider_name() {
		return rider_name;
	}
	public void setRider_name(String rider_name) {
		this.rider_name = rider_name;
	}
	public Date getEntry_time() {
		return entry_time;
	}
	public void setEntry_time(Date entry_time) {
		this.entry_time = entry_time;
	}
	public String getRider_identity() {
		return rider_identity;
	}
	public void setRider_identity(String rider_identity) {
		this.rider_identity = rider_identity;
	}
	
	
}
