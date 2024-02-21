# Write your MySQL query statement below
SELECT uni.unique_id,em.name
FROM employees em
LEFT JOIN employeeUNI uni
     ON em.id =uni.id;