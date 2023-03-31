-- 코드를 입력하세요
SELECT animal_id, name, date_format(datetime, '%y-%m-%d') as '날짜'
from animal_ins
order by animal_id;

SELECT ANIMAL_ID, NAME, DATE_FORMAT(DATETIME, '%Y-%m-%d') AS '날짜'
FROM ANIMAL_INS
ORDER BY ANIMAL_ID;