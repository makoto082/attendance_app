package com.attendanceapp.attendance.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.attendanceapp.attendance.entity.User;

/**
 * User:リポジトリ
 */

@Mapper
public interface UserMapper {
	
	/**
	 * 全ての社員情報を取得する
	 */
	List<User> selectAll();
	
	/**
	 * 指定されたIDに対応する社員情報を取得する
	 */
	User selectById(@Param("uid") Integer uid);
	
	/**
	 * 社員情報を登録する
	 */
	void insert(User user);
	
	/**
	 * 社員情報を更新する
	 */
	void update(User user);
	
	/**
	 * 社員情報を削除する
	 */
	void delete(@Param("uid") Integer uid);
	
	
}
