package takeout.assistant.model;

import java.util.Date;

public class BeanOrder {

	private int order_id;
	private int address_id;
	private int user_id;
	private int business_id;
	private int coupon_id;
	private int rider_id;
	private float beprice;
	private float realprice;
	private int fr_id;
	private Date ordertime;
	private Date requiredtime;
	private String ps_address;
	private String orderstatus;
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public int getAddress_id() {
		return address_id;
	}
	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getBusiness_id() {
		return business_id;
	}
	public void setBusiness_id(int business_id) {
		this.business_id = business_id;
	}
	public int getCoupon_id() {
		return coupon_id;
	}
	public void setCoupon_id(int coupon_id) {
		this.coupon_id = coupon_id;
	}
	public int getRider_id() {
		return rider_id;
	}
	public void setRider_id(int rider_id) {
		this.rider_id = rider_id;
	}
	public float getBeprice() {
		return beprice;
	}
	public void setBeprice(float beprice) {
		this.beprice = beprice;
	}
	public float getRealprice() {
		return realprice;
	}
	public void setRealprice(float realprice) {
		this.realprice = realprice;
	}
	public int getFr_id() {
		return fr_id;
	}
	public void setFr_id(int fr_id) {
		this.fr_id = fr_id;
	}
	public Date getOrdertime() {
		return ordertime;
	}
	public void setOrdertime(Date ordertime) {
		this.ordertime = ordertime;
	}
	public Date getRequiredtime() {
		return requiredtime;
	}
	public void setRequiredtime(Date requiredtime) {
		this.requiredtime = requiredtime;
	}
	public String getPs_address() {
		return ps_address;
	}
	public void setPs_address(String ps_address) {
		this.ps_address = ps_address;
	}
	public String getOrderstatus() {
		return orderstatus;
	}
	public void setOrderstatus(String orderstatus) {
		this.orderstatus = orderstatus;
	}
	
	
}
