select member_id, member_name, gender, DATE_FORMAT(DATE_OF_BIRTH, '%Y-%m-%d') AS DATE_OF_BIRTH
from MEMBER_PROFILE
where TLNO <> "NULL"
AND DATE_OF_BIRTH LIKE "%-03-%" 
AND GENDER = "W"
order by member_id Asc;