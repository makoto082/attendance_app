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
	@Column(name = "uid")
	private Long uid;
	/** 社員番号 */
	@Column(name = "employee_no", nullable = false, unique = true)
	private String employeeNo;
	/** 社員名 */
	@Column(name = "name", nullable = false)
	private String name;
	/** 社員メールアドレス */
	@Column(name = "email")
	private String email;
	/** パスワードハッシュ */
	@Column(name = "passwor_hash")
	private String passwordHash;
	/** 在籍フラグ */
	@Column(name = "enabled")
	private boolean enabled = true;
	/** 部署ID */
	@Column(name = "department_id")
	private String departmentId;
}
