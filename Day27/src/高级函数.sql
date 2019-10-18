-- case表达式【相当于java中swtich语句】
-- 查询每个员工的工资等级并排序
-- 工资等级在1显示为 '努力赚钱'
-- 工资等级在2显示为 '小康生活'
-- 工资等级在3显示为 '可以娶媳妇'
-- 工资等级在4显示为 '可以买车'
-- 工资等级在5显示为 '可以买房'
-- 工资等级不在以上列表中显示为  '土豪'
 SELECT
  e.`ename`,
  s.`grade`,
  CASE
    s.`grade`
    WHEN 1
    THEN '努力赚钱'
    WHEN 2
    THEN '小康生活'
    WHEN 3
    THEN '可以娶媳妇'
    WHEN 4
    THEN '可以买车'
    WHEN 5
    THEN '可以买房'
    ELSE '土豪'
  END AS 等级
FROM
  emp e
  INNER JOIN salarygrade s
    ON e.`salary` BETWEEN s.`losalary`
    AND s.`hisalary` ORDER BY grade DESC;
-- --------------------------------------------
-- if表达式
-- 工资+奖金大于20000的员工 显示家有娇妻（波多野结衣），否则显示单身狗（盲僧）    
 SELECT
  ename,
  IF((salary + IFNULL (bonus, 0)) > 20000,'家有娇妻','单身狗') AS 状态
FROM
  emp;
-- --------------------------------------------
-- cast（显示）类型转换【了解】  
SELECT CAST('s' AS DATE);
SELECT CAST('1996-11-11' AS DATE);



