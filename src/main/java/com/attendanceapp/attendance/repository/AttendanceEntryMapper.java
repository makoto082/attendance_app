package com.attendanceapp.attendance.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.attendanceapp.attendance.entity.AttendanceEntry;

@Mapper
public interface AttendanceEntryMapper {
	/**
	 * 全ての勤怠詳細を取得する
	 */
	List<AttendanceEntry> selectAll();
	
	/**
	 * 指定されたID(日付)に対応する勤怠詳細を取得する
	 */
	AttendanceEntry selectById(@Param("aeid") Integer aeid);
	
	/**
	 * 勤怠詳細を登録する
	 */
	void insert(AttendanceEntry attendanceEntry);
	
	/**
	 * 勤怠詳細を更新する
	 */
	void update(AttendanceEntry attendanceEntry);
	
	/**
	 * 指定されたIDの勤怠詳細を削除する
	 */
	void delete(@Param("aeid") Integer aeid);
	
}
