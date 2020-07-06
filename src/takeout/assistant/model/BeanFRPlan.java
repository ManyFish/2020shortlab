package takeout.assistant.model;

public class BeanFRPlan {
	private int fr_id;
	private int business_id;
	private float fr_amount;
	private int yh_amount;
	private Boolean ifdouble;
	public int getFr_id() {
		return fr_id;
	}
	public void setFr_id(int fr_id) {
		this.fr_id = fr_id;
	}
	public int getBusiness_id() {
		return business_id;
	}
	public void setBusiness_id(int business_id) {
		this.business_id = business_id;
	}
	public float getFr_amount() {
		return fr_amount;
	}
	public void setFr_amount(float fr_amount) {
		this.fr_amount = fr_amount;
	}
	public int getYh_amount() {
		return yh_amount;
	}
	public void setYh_amount(int yh_amount) {
		this.yh_amount = yh_amount;
	}
	public Boolean getIfdouble() {
		return ifdouble;
	}
	public void setIfdouble(Boolean ifdouble) {
		this.ifdouble = ifdouble;
	}
	
	
}
