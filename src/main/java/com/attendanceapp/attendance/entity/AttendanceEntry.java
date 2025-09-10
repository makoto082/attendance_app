package com.attendanceapp.attendance.entity;

import java.time.LocalDate;

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
@Table(name = "attendance_entries")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AttendanceEntry {
	/** 勤怠詳細ID */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int aeid;
	/** 勤怠ID */
	@Column(nullable = false, unique = true)
	private int header_id;
	/** 出勤日時 */
	private LocalDate work_date;
	/** 出勤時間 */
	private LocalDate clock_in;
	/** 退勤時間 */
	private LocalDate clock_out;
	/** 休憩時間 */
	private LocalDate break_minutes;
	/** 勤務場所 */
	private String location;
	/** 勤務時間 */
	private LocalDate total_minutes;
	/** 残業時間 */
	private LocalDate overtime_minutes;
	/** 深夜勤務時間 */
	private LocalDate night_minutes;
	/** 休日勤務時間 */
	private LocalDate holiday_minutes;
	/** 備考 */
	private String remark;
}
