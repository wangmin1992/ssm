package com.wang.ssm.been;

/**
 * 用户实体类。
 * 描述：必须包含get,set方法，属性，重写toString方法。
 * @author wangmin
 * @since 2017年6月1日-上午10:23:14
 * @version V1.0
 */
public class User {

	private Integer id;
	private String name;
	private Integer age;
	private Integer gender;
	private String address;
	
	public User(){
		super();
	}
	
	public User(Integer id, String name, Integer age, Integer gender, String address) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age
				+ ", gender=" + gender + ", address=" + address + "]";
	}
}
