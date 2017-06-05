package com.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import org.seasar.doma.Entity;

/**
 * UserテーブルEntityクラス
 * @author shingo_ito
 *
 */
@Entity
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private Timestamp createAt;
	private Timestamp updateAt;
	private Timestamp deleteAt;
	private Boolean deleteFlag;
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
	public Timestamp getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Timestamp createAt) {
		this.createAt = createAt;
	}
	public Timestamp getUpdateAt() {
		return updateAt;
	}
	public void setUpdateAt(Timestamp updateAt) {
		this.updateAt = updateAt;
	}
	public Timestamp getDeleteAt() {
		return deleteAt;
	}
	public void setDeleteAt(Timestamp deleteAt) {
		this.deleteAt = deleteAt;
	}
	public Boolean getDeleteFlag() {
		return deleteFlag;
	}
	public void setDeleteFlag(Boolean deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	/**
	 * コンストラクタ
	 * @param id
	 * @param name
	 * @param createAt
	 * @param updateAt
	 * @param deleteAt
	 * @param deleteFlag
	 */
	public User(Integer id, String name, Timestamp createAt, Timestamp updateAt, Timestamp deleteAt, Boolean deleteFlag) {
		this.id = id;
		this.name = name;
		this.createAt = createAt;
		this.updateAt = updateAt;
		this.deleteAt = deleteAt;
		this.deleteFlag = deleteFlag;
	}
}
