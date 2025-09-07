package com.attendanceapp.attendance.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AttendanceSystemController {
	/** DI */
	
	// 勤怠登録画面表示
	@GetMapping("/")
	public String attendanceView() {
		return "main";
	}
	
	// 管理画面表示
	@GetMapping("/maintenance")
	public String maintenanceView() {
		return "maintenance";
	}
	
	// 管理者用画面表示
	@GetMapping("/admin")
	public String adminView() {
		return "admin";
	}
}
