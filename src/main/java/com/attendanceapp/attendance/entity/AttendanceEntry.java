package com.attendanceapp.attendance.entity;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AttendanceEntry {
	/** 勤怠詳細ID */
	int aeid;
	/** 勤怠ID */
	int header_id;
	/** 出勤日時 */
	LocalDate work_date;
	/** 出勤時間 */
	LocalDate clock_in;
	/** 退勤時間 */
	LocalDate clock_out;
	/** 休憩時間 */
	LocalDate break_minutes;
	/** 勤務場所 */
	String location;
	/** 勤務時間 */
	LocalDate total_minutes;
	/** 残業時間 */
	LocalDate overtime_minutes;
	/** 深夜勤務時間 */
	LocalDate night_minutes;
	/** 休日勤務時間 */
	LocalDate holiday_minutes;
	/** 備考 */
	String remark;
}
