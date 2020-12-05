# Write your MySQL query statement below
​
select users.name, sum(amount) balance from users
left join transactions on users.account = transactions.account
group by users.name having balance > 10000
