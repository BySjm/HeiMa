# 内连接
-- 查询唐僧的 id，姓名，性别，工资和所在部门名称
SELECT
  e.id,
  e.name,
  e.gender,
  e.salary,
  d.name
FROM
  emp e
  INNER JOIN dept d
    ON e.dept_id = d.id
    WHERE e.name='唐僧';

# 左外连接
-- 查询所有员工信息及对应的部门名称
SELECT * FROM emp e LEFT OUTER JOIN dept d ON e.dept_id = d.id

# 右外连接
-- 查询所有部门及对应的员工信息
SELECT * FROM emp e RIGHT OUTER JOIN dept d ON e.dept_id = d.id


# 子查询

# 子查询结果为单值
-- 1 查询工资最高的员工是谁？ 
SELECT MAX(salary) FROM emp; 
SELECT * FROM emp WHERE salary = (SELECT MAX(salary) FROM emp);
-- 2 查询工资小于平均工资的员工有哪些？
SELECT AVG(salary) FROM emp;
SELECT * FROM emp WHERE salary < (SELECT AVG(salary) FROM emp);
# 子查询结果为单列多行
-- 1 查询工资大于5000的员工，来自于哪些部门的名字
SELECT dept_id FROM emp WHERE salary > 5000;
SELECT * FROM dept WHERE id IN(SELECT dept_id FROM emp WHERE salary > 5000);
-- 2 查询开发部与财务部所有的员工信息
SELECT id FROM dept WHERE NAME IN ('开发部','财务部');
SELECT * FROM emp WHERE dept_id IN (SELECT id FROM dept WHERE NAME IN ('开发部','财务部'));
# 子查询结果为多列多行
-- 1 查询出2011年以后入职的员工信息，包括部门名称
SELECT * FROM emp WHERE join_date > '2011-01-01';
SELECT * FROM emp e INNER JOIN dept d ON e.`dept_id` = d.`id` WHERE e.join_date > '2011-01-01';