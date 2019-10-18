-- 1.统计每个员工的工龄，超过半年的算一年
SELECT ename,ROUND(DATEDIFF(NOW(),joindate)/365) FROM emp;
-- 2.统计每个部门的平均薪资,保留2位小数
SELECT dept_id,TRUNCATE(AVG(salary),2) FROM emp GROUP BY dept_id;
-- 3.统计每个部门的平均薪资,小数向上取整
SELECT dept_id,CEIL(AVG(salary)) FROM emp GROUP BY dept_id;
-- 4.统计每个部门的平均薪资,小数向下取整
SELECT dept_id,FLOOR(AVG(salary)) FROM emp GROUP BY dept_id;