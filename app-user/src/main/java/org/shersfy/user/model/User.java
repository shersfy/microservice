package org.shersfy.user.model;

public class User extends BaseEntity {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** 主键 **/
    private Long id;

    /** 用户名 **/
    private String username;

    /** 密码 **/
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
}