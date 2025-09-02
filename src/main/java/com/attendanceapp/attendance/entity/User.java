package com.attendanceapp.attendance.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
	/** ID */
	private Integer uid;
	/** 社員番号 */
	private String employee_no;
	/** 社員名 */
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
