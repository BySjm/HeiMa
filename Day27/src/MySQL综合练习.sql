-- MySQL综合练习
-- 1.计算员工的日薪(按30天)，保留二位小数
SELECT ename,TRUNCATE(((salary + IFNULL(bonus,0))/30),2) AS 日薪 FROM emp;
-- 2.计算出员工的年薪，并且以年薪降序排序
SELECT ename,(salary + IFNULL(bonus,0))*12 AS 年薪 FROM emp ORDER BY 年薪 DESC;
-- 3.找出奖金少于5000或者没有获得奖金的员工的信息
SELECT ename FROM emp WHERE bonus < 5000 OR bonus IS NULL;
SELECT ename FROM emp WHERE IFNULL(bonus,0) < 5000;
-- 4.返回员工职务名称及其从事此职务的最低工资
SELECT j.`jname`,MIN(salary) FROM emp e INNER JOIN job j ON e.`job_id` = j.`id` GROUP BY j.`jname`;
-- 5.返回工龄超过10年，且2月份入职的员工信息
SELECT * FROM emp WHERE DATEDIFF(NOW(),joindate)/365 > 10 AND MONTH(joindate) = 2;
-- 6.返回与 林冲 同一年入职的员工
SELECT ename FROM emp WHERE YEAR(joindate) = (SELECT YEAR(joindate) FROM emp WHERE ename = '林冲');
-- 7.返回每个员工的名称及其上级领导的名称
SELECT em.`ename`,mg.`ename` FROM emp em LEFT JOIN emp mg ON em.`mgr` = mg.`id`;
-- 8.返回工资为二等级（工资等级表）的职员名字（员工表）、部门名称（部门表）
SELECT
  e.`ename`,
  d.`dname`
FROM
  emp e
  INNER JOIN dept d
    ON e.`dept_id` = d.`id`
  INNER JOIN salarygrade j
    ON e.`salary` BETWEEN j.`losalary` AND j.`hisalary` WHERE j.`grade` = 2;
-- 9.涨工资：董事长2000 经理1500 其他800
SELECT
  e.`ename`,
  j.`jname`,
  CASE
    j.`jname`
    WHEN '董事长'
    THEN e.salary + 2000
    WHEN '经理'
    THEN e.salary + 1500
    ELSE
     e.salary + 800
  END AS '薪资'
FROM
  emp e
  INNER JOIN job j
    ON e.`job_id` = j.`id`;