package com.attendanceapp.attendance.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
	/** ID */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long uid;
	/** 社員番号 */
	@Column(nullable = false, unique = true)
	private String employee_no;
	/** 社員名 */
	@Column(nullable = false)
	private String name;
	/** 社員メールアドレス */
	private String email;
	/** パスワードハッシュ */
	private String password_hash;
	/** 在籍フラグ */
	private boolean enabled;
	/** 部署ID */
	private String department_id;
}
