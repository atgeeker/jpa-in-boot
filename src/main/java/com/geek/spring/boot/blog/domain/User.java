package com.geek.spring.boot.blog.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * User实体类
 * @author zhuyangyong
 * @date 2017年9月5日 下午1:50:40 
 */
@Entity  // 实体
@XmlRootElement // MediaType 转为 XML
@Table(name="user")
public class User {
	
	@Id  // 主键
    @GeneratedValue(strategy=GenerationType.IDENTITY) // 自增长策略
	private Long id;	// 用户的唯一标识
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private String email;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public User() {	// JPA 的规范要求无参构造函数；设为 protected 防止直接使用 
	}

	public User(String name, String email) {
		this.name = name;
		this.email = email;
	}

	@Override
	public String toString() {
		return String.format(
                "User[id=%d, name='%s', email='%s']",
                id, name, email);
	}

}
