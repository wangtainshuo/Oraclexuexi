package com.dongfang.javabean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 客户实体类
 * @author like
 * @version 1.0
 *	编号  密码  姓名   年龄   电话号码   积分   生日   购物车  购买记录
 */
public class Customer {
	private String id;
	private String pass;
	private String name;
	private int age;
	private String phoneNum;
	private int point;
	private String birthday;
	private Map<Goods,Integer> shoppingCarMap;//购物车
	private List<Btr> btrList;
	
	{
		shoppingCarMap = new HashMap<Goods,Integer>();
		btrList = new ArrayList<Btr>();
	}
	public Customer() {
		
	}
	public Customer(String id, String pass, String name, int age
			, String phoneNum, int point, String birthday) {
		super();
		this.id = id;
		this.pass = pass;
		this.name = name;
		this.age = age;
		this.phoneNum = phoneNum;
		this.point = point;
		this.birthday = birthday;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public Map<Goods, Integer> getShoppingCarMap() {
		return shoppingCarMap;
	}
	public void setShoppingCarMap(Map<Goods, Integer> shoppingCarMap) {
		this.shoppingCarMap = shoppingCarMap;
	}
	public List<Btr> getBtrList() {
		return btrList;
	}
	public void setBtrList(List<Btr> btrList) {
		this.btrList = btrList;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", pass=" + pass + ", name=" + name + ", age=" + age + ", phoneNum=" + phoneNum
				+ ", point=" + point + ", birthday=" + birthday + ", shoppingCarMap=" + shoppingCarMap + ", btrList="
				+ btrList + "]";
	}
	
	
	
}
