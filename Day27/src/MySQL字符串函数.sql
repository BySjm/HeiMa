-- 1.将所有员工的昵称(nickname)改为大写
SELECT UCASE(nickname) FROM emp;
-- 2.显示所有员工的姓氏，截取
SELECT SUBSTR(ename,1,1) FROM emp;
-- 3.显示所有员工姓名字符长度
SELECT CHAR_LENGTH(ename) FROM emp;
-- 4.显示所有员工姓名字节长度
SELECT LENGTH(ename) FROM emp;
-- 5.将所有姓李的员工，姓氏替换为li
SELECT REPLACE(ename,'李','li') FROM emp;
SELECT REPLACE(SUBSTR(ename,1,1),"李","li") FROM emp;
-- 6.将所有员工的姓名和昵称拼接在一起
SELECT CONCAT(ename,nickname) FROM emp;
