-- 查询所有员工信息。显示员工信息和部门名称，没有员工的部门也要显示
SELECT d.`dname`,e.* FROM dept d LEFT JOIN emp e ON d.`id` = e.`dept_id`
-- 查询所有员工信息。显示员工姓名，员工工资，职务名称，工资等级，并按工资升序排序
SELECT
  e.`ename`,e.`salary`,d.`dname`,s.grade
FROM
  emp e
  INNER JOIN dept d
    ON e.`dept_id` = d.`id`
  INNER JOIN salarygrade s
    ON e.`salary` BETWEEN s.`losalary` AND s.`hisalary`
    ORDER BY e.`salary`
-- 列出所有员工的姓名及其直接上级的姓名,没有领导的员工也需要显示
SELECT em.ename,mg.ename FROM emp em LEFT JOIN emp mg ON em.mgr = mg.id
-- 查询入职期早于直接上级的所有员工编号、姓名、部门名称
SELECT
  em.id,
  em.ename,
  d.`dname`
FROM
  emp em
  INNER JOIN emp mg
  INNER JOIN dept d
  ON em.mgr = mg.id AND em.joindate < mg.joindate
  AND em.dept_id = d.`id`
  
  
SELECT
  e.`id`,
  e.`ename`,
  d.`dname`
FROM
  emp e
  INNER JOIN emp m
  INNER JOIN dept d
    ON e.mgr = m.id
    AND e.joindate < m.joindate
    AND e.`dept_id` = d.`id`;

-- 查询工资高于公司平均工资的所有员工信息。显示员工信息，部门名称，上级领导，工资等级


SELECT e.ename,m.`ename`,d.`dname`,s.`grade` FROM emp e
LEFT JOIN emp m ON e.`mgr` = m.`id`
INNER JOIN dept d ON e.`dept_id` = d.`id`
INNER JOIN salarygrade s ON e.`salary` BETWEEN s.`losalary` AND s.`hisalary`
WHERE e.salary > (SELECT AVG(salary) FROM emp) ORDER BY s.`grade` DESC;





