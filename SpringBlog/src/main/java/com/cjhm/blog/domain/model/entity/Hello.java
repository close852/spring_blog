package com.cjhm.blog.domain.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author CJHM
 *
 */
@Entity
public class Hello {

	@Id
	@GeneratedValue
	private int id;

	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Hello [id=" + id + ", name=" + name + "]";
	}

}
