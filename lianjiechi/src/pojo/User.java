package pojo;

import java.util.Date;

/*
 * vo或者  entity 或者 pojo  包  这里都是存放与数据库表名对应的java文件
 * 
 * 这个文件又叫   实体类 
 */
public class User {
	
	private  Integer uid;
	private  String  uname;
	private  String  password;
	private  Date    regTime;
	private  String  address;
	private  String  phone;
	private  Integer money;
	
	
	
	public Integer getMoney() {
		return money;
	}
	public void setMoney(Integer money) {
		this.money = money;
	}
	public User() {
		super();
	}
	public User(Integer uid, String uname, String password, Date regTime, String address, String phone) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.password = password;
		this.regTime = regTime;
		this.address = address;
		this.phone = phone;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getRegTime() {
		return regTime;
	}
	public void setRegTime(Date regTime) {
		this.regTime = regTime;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", password=" + password + ", regTime=" + regTime
				+ ", address=" + address + ", phone=" + phone + "]";
	}
	
	
	
	
}
