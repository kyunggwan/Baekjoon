select mcdp_cd as '진료과코드', count(apnt_YMD) as '5월예약건수'
from appointment
where apnt_YMD like '2022-05%'
group by mcdp_cd
order by 2, 1;