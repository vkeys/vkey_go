/**
 * @author vkey
 * @datetime 2015年9月23日 下午4:46:57
 */
package com.vkey.entity;
public class User{
	private Integer id;
	private String username;
	private String password;
	private int sex;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	
}