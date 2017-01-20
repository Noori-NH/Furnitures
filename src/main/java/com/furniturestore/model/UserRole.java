package com.furniturestore.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;



@Entity
public class UserRole implements Serializable {
	
	private static final long serialVersionUID = 19L;

	@Id
    @GeneratedValue
    private int roleId;
	@OneToOne
	@JoinColumn(name="usersId")
    private Users u;
    private String role;
    

    public Users getU() {
		return u;
	}

	public void setU(Users u) {
		this.u = u;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getRoleId() {
  		return roleId;
  	}

  	public void setRoleId(int roleId) {
  		this.roleId = roleId;
  	}

  	public String getRole() {
  		return role;
  	}

  	public void setRole(String role) {
  		this.role = role;
  	}

//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
   
}
