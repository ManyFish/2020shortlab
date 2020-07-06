package takeout.assistant.model;

import java.util.Date;

public class BeanCoupon {
	private int coupon_id;
	private int business_id;
	private int order_id;
	private int couponp_amount;
	private int requireamount;
	private Date startdate;
	private Date enddate;
	public int getCoupon_id() {
		return coupon_id;
	}
	public void setCoupon_id(int coupon_id) {
		this.coupon_id = coupon_id;
	}
	public int getBusiness_id() {
		return business_id;
	}
	public void setBusiness_id(int business_id) {
		this.business_id = business_id;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public int getCouponp_amount() {
		return couponp_amount;
	}
	public void setCouponp_amount(int couponp_amount) {
		this.couponp_amount = couponp_amount;
	}
	public int getRequireamount() {
		return requireamount;
	}
	public void setRequireamount(int requireamount) {
		this.requireamount = requireamount;
	}
	public Date getStartdate() {
		return startdate;
	}
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}
	public Date getEnddate() {
		return enddate;
	}
	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}
	
	
}
