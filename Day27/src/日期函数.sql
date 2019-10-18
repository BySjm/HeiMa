-- 1.统计每个员工入职的天数
SELECT ename,DATEDIFF(NOW(),joindate) FROM emp;
-- 2.统计每个员工的工龄
SELECT ename,DATEDIFF(NOW(),joindate)/365 FROM emp;
-- 3.查询2011年入职的员工
SELECT ename,joindate FROM emp WHERE joindate LIKE '2011%';
SELECT ename,joindate FROM emp WHERE DATE_FORMAT(joindate,'%Y') = 2011;
SELECT ename FROM emp WHERE YEAR(joindate) = 2011 AND MONTH(joindate) = 2;
-- 4.统计入职10年以上的员工信息
SELECT ename,joindate FROM emp WHERE DATEDIFF(NOW(),joindate)/365 > 10;