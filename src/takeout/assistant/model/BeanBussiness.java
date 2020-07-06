package takeout.assistant.model;

public class BeanBussiness {
	private String business_id;
	private String business_name;
	private int level;
	private float avg_consumption;
	private int total_sale;
	public String getBusiness_id() {
		return business_id;
	}
	public void setBusiness_id(String business_id) {
		this.business_id = business_id;
	}
	public String getBusiness_name() {
		return business_name;
	}
	public void setBusiness_name(String business_name) {
		this.business_name = business_name;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public float getAvg_consumption() {
		return avg_consumption;
	}
	public void setAvg_consumption(float avg_consumption) {
		this.avg_consumption = avg_consumption;
	}
	public int getTotal_sale() {
		return total_sale;
	}
	public void setTotal_sale(int total_sale) {
		this.total_sale = total_sale;
	}
	
	
}
