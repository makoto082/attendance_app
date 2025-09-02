package com.attendanceapp.attendance.entity;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AttendanceHeader {
	/** 勤怠ID */
	int ahid;
	/** ユーザーID*/
	int user_id;
	/** 年月　*/
	LocalDate year_month;
	/** ステータス */
	String status;
	/** 入力日時 */
	LocalDate submitted_at;
	/** 承認日時 */
	LocalDate approved_at;
	/** 承認者ID */
	int approver_id;
}
