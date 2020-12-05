# Write your MySQL query statement below
​
select name warehouse_name, sum(units * width * length * height) volume from warehouse
left join products on warehouse.product_id = products.product_id
group by name
​
​
​
# SELECT name warehouse_name, SUM(units * Width * Length * Height) volume
# FROM Warehouse W
# LEFT JOIN Products P 
# ON W.product_id = P.product_id
# GROUP BY name
