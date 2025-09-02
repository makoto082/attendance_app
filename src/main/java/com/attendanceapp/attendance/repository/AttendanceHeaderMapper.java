package com.attendanceapp.attendance.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.attendanceapp.attendance.entity.AttendanceHeader;

@Mapper
public interface AttendanceHeaderMapper {
	/**
	 * 全ての勤怠を取得する
	 */
	List<AttendanceHeader> selectAll();
	
	/**
	 * 指定されたID(日付)の勤怠を取得する
	 */
	AttendanceHeader selectById(@Param("ahid") Integer ahid);
	/**
	 * 勤怠を登録する
	 */
	void insert(AttendanceHeader attendanceHeader);
	
	/**
	 * 勤怠を更新する
	 */
	void update(AttendanceHeader attendanceHeader);
	
	/**
	 * 指定されたIDの勤怠を削除する
	 */
	void delete(@Param("ahid") Integer ahid);
}
