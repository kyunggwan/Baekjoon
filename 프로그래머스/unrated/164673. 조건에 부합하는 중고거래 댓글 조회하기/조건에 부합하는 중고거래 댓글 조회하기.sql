
SELECT a.title, b.board_id, b.reply_id, b.writer_id, b.contents, date_format(b.CREATED_DATE, '%Y-%m-%d') as CREATED_DATE 
from USED_GOODS_BOARD as a
join USED_GOODS_REPLY as b
on a.board_id = b.board_id
where a.CREATED_DATE like '2022-10%'
order by b.CREATED_DATE asc, a.title asc