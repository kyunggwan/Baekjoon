SELECT A.CATEGORY, SUM(B.SALES) AS TOTAL_SALES
FROM BOOK A, BOOK_SALES B
WHERE A.BOOK_ID = B.BOOK_ID 
AND B.SALES_DATE >= '2022-01-01'
AND B.SALES_DATE <= '2022-01-31'
GROUP BY A.CATEGORY
ORDER BY A.CATEGORY ASC;
