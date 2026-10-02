# Write your MySQL query statement below
select distinct(user_id),MAX(time_stamp) as last_stamp from Logins where time_stamp like "%2020%"  GROUP BY user_id order by time_stamp desc;