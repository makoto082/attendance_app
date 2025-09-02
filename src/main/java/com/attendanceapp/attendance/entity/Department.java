package com.attendanceapp.attendance.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {
	/** 部署ID */
	private Integer id;
	/** 部署名 */
	private String name;
	/** 管理職者ID */
	private String manager_user_id;
}
