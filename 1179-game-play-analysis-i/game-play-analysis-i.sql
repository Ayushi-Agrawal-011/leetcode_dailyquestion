# Write your MySQL query statement below
select player_id ,event_date as first_login  from Activity  having event_date=(select min(event_date) from  Activity a where a.player_id =Activity.player_id);