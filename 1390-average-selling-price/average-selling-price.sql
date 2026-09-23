-- # Write your MySQL query statement below
select p.product_id, ROUND(IFNULL(SUM(p.price * u.units) / SUM(u.units), 0), 2) as average_price  from Prices p  left join UnitsSold u on p.product_id=u.product_id and u.purchase_date>=p.start_date and u.purchase_date<= p.end_date  group by p.product_id ;
-- SELECT p.product_id,
--        ROUND(IFNULL(SUM(p.price * u.units) / SUM(u.units), 0), 2) AS average_price
-- FROM Prices p
-- LEFT JOIN UnitsSold u
--   ON p.product_id = u.product_id
--  AND u.purchase_date >= p.start_date
--  AND u.purchase_date <= p.end_date
-- GROUP BY p.product_id;