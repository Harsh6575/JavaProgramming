-- # 184. Department Highest Salary

SELECT d.name AS Department, e.name AS Employee, e.salary AS Salary
FROM Employee e
JOIN Department d ON e.departmentId = d.id
WHERE (d.name, e.salary) IN (
    SELECT d.name, MAX(e.salary)
    FROM Employee e
    JOIN Department d ON e.departmentId = d.id
    GROUP BY d.name
);