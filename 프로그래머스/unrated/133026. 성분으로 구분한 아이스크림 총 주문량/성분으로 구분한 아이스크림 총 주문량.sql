select b.INGREDIENT_TYPE, SUM(a.TOTAL_ORDER) 
from first_half a
JOIN icecream_info b
ON a.flavor = b.flavor
group by ingredient_type
ORDER BY TOTAL_ORDER ASC;