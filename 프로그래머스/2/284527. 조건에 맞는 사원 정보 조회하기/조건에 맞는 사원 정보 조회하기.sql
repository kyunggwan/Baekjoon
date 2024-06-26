-- 코드를 작성해주세요
-- 2022년도 평가 점수가 가장 높은 사원 정보
-- 점수, 사번, 성명, 직책, 이메일
-- 상,하반기 점수 합, 점수 칼럼명 score
SELECT SUM(C.SCORE) AS SCORE, B.EMP_NO, B. EMP_NAME, B.POSITION, B.EMAIL
FROM HR_DEPARTMENT A
JOIN HR_EMPLOYEES B ON A.DEPT_ID = B.DEPT_ID
JOIN HR_GRADE C ON B.EMP_NO = C.EMP_NO
WHERE C.YEAR = '2022'
GROUP BY B.EMP_NO, B.EMP_NAME, B.POSITION, B.EMAIL
ORDER BY SCORE DESC
LIMIT 1;