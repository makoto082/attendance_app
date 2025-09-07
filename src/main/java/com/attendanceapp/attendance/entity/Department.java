package com.attendanceapp.attendance.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Department {
	/** 部署ID */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long  id;
	@Column(nullable = false, unique = true)
	/** 部署名 */
	private String name;
	/** 管理職者ID */
	private String manager_user_id;
}
