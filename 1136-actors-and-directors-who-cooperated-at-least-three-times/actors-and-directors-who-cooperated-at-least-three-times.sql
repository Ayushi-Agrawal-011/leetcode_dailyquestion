# Write your MySQL query statement below
select p.actor_id,p.director_id from ActorDirector p group by actor_id,director_id  having count(*)>2;
