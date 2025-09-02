-- テーブルが存在していたら削除する
DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS roles;
DROP TABLE IF EXISTS user_roles;
DROP TABLE IF EXISTS departments;
DROP TABLE IF EXISTS work_calender;
DROP TABLE IF EXISTS work_rules;
DROP TABLE IF EXISTS attendance_headers;
DROP TABLE IF EXISTS attendance_entries;
DROP TABLE IF EXISTS approval_comments;
DROP TABLE IF EXISTS audit_logs;

-- テーブルの作成
CREATE TABLE users (
	-- id(社員ID):主キー
	uid serial PRiMARY KEY,
	-- name(社員名):NULL不許可
	ename varchar(255) NOT NULL,
	employee_no INTEGER NOT NULL,
	email varchar(255),
	password_hash varchar(255) NOT NULL,
	enabled boolean,
	did INTEGER
);

CREATE TABLE departments (
	-- id(部署ID):主キー
	did serial PRiMARY KEY,
	-- name(部署名):NULL不許可
	dname varchar(255) NOT NULL,
	-- 部署ID
	manager_user_id INTEGER NOT NULL
);

CREATE TABLE attendance_headers (
	-- id(勤怠ID):主キー
	ahid serial PRiMARY KEY, -- attendance_headers_id
	user_id INTEGER,
	year_month TIMESTAMP,
	status VARCHAR(12), -- 未入力、未承認、承認済み
	submitted_at TIMESTAMP,
	approved_at TIMESTAMP,
	approver_id INTEGER
);

CREATE TABLE attendance_entries (
	-- id(勤怠詳細ID):主キー
	aeid serial PRIMARY KEY,
	header_id INTEGER,
	work_date TIMESTAMP,
	clock_in TIMESTAMP,
	clock_out TIMESTAMP,
	break_minutes TIMESTAMP, -- 休憩時間
	location VARCHAR(120),
	total_minutes TIMESTAMP,
	overtime_minutes TIMESTAMP,
	night_minutes TIMESTAMP,
	holiday_minutes TIMESTAMP,
	remark VARCHAR(255) -- 備考
);

