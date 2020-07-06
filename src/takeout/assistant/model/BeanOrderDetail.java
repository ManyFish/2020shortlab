package takeout.assistant.model;

public class BeanOrderDetail {

	private int pro_id;
	private int order_id;
	private int dd_num;
	private float  ys_price;
	private float dp_coupon;
	public int getPro_id() {
		return pro_id;
	}
	public void setPro_id(int pro_id) {
		this.pro_id = pro_id;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public int getDd_num() {
		return dd_num;
	}
	public void setDd_num(int dd_num) {
		this.dd_num = dd_num;
	}
	public float getYs_price() {
		return ys_price;
	}
	public void setYs_price(float ys_price) {
		this.ys_price = ys_price;
	}
	public float getDp_coupon() {
		return dp_coupon;
	}
	public void setDp_coupon(float dp_coupon) {
		this.dp_coupon = dp_coupon;
	}
	
	
}
