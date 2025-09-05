-- 1人目の社員登録
insert into users (employee_no, name, email, password_hash, enabled, department_id)
values
('A0001', 'テスト太郎', 'aaa@email.com', 'test', true, 1);

-- 2人目の社員登録
insert into users (employee_no, name, email, password_hash, enabled, department_id)
values
('B0001', 'テスト花子', 'bbb@email.com', 'test', true, 2);


-- 1人目の管理者社員登録


-- 管理者アカウント登録

-- テスト太郎の勤怠登録
insert into attendance_entries (header_id , work_date, clock_in, clock_out, break_minutes, location, total_minutes, overtime_minutes, night_minutes, holiday_minutes, remark)
values
('20250911', '2025/09/11', '2025/09/11 9:00', ' 2025/09/11 18:00', '60', '東京本社', '8:00', '0', '0', '8', null);

