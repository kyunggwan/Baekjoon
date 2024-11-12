-- 코드를 입력하세요
SELECT a.CATEGORY, a.PRICE AS MAX_PRICE, a.PRODUCT_NAME
FROM FOOD_PRODUCT a
JOIN(
    SELECT CATEGORY, MAX(PRICE) AS MAX_PRICE
    FROM FOOD_PRODUCT
    WHERE CATEGORY IN ('국', '과자', '김치', '식용유')
    GROUP BY CATEGORY
) AS sub 
ON a.CATEGORY = sub.CATEGORY AND a.PRICE = sub.MAX_PRICE
ORDER BY a.PRICE DESC;

