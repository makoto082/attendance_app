package com.attendanceapp.attendance.entity;

import java.time.LocalDate;

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
@Table(name = "attendance_headers")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AttendanceHeader {
	/** 勤怠ID */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ahid;
	/** ユーザーID*/
	private int user_id;
	/** 年月　*/
	private LocalDate year_month;
	/** ステータス */
	private String status;
	/** 入力日時 */
	private LocalDate submitted_at;
	/** 承認日時 */
	private LocalDate approved_at;
	/** 承認者ID */
	private int approver_id;
}
