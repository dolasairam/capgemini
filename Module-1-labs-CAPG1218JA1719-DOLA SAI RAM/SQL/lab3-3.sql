SELECT S.STAFF_NAME,
  D.DEPT_CODE,
  D.DEPT_NAME,
  S.STAFF_SAL
FROM STAFFMASTER S,
  DEPARTMENT_MASTER D
WHERE S.DEPT_CODE=D.DEPT_CODE
AND STAFF_SAL    >20000;

SELECT S.STAFF_CODE AS STAFF# ,
  S.STAFF_NAME      AS STAFF,
  D.DEPT_NAME,
  S.MGR_CODE AS MGR#
FROM STAFFMASTER S,
  DEPARTMENT_MASTER D
WHERE S.DEPT_CODE=D.DEPT_CODE;

SELECT S.STUDENT_CODE,S.STUDENT_NAME,B.BOOK_CODE,BB.BOOK_NAME FROM STUDENTMASTER S,BOOK_TRANSACTIONS B, BOOK_MASTER BB 
	WHERE S.STUDENT_CODE=B.STUDENT_CODE AND TO_CHAR(B.BOOK_EXPECTED_RETURN_DATE,'DD MM YYYY')  LIKE TO_CHAR(SYSDATE,'DD MM YYYY');
	
SELECT S.STUDENT_CODE,
  S.STUDENT_NAME,
  B.BOOK_CODE,
  BB.BOOK_NAME
FROM STUDENTMASTER S,
  BOOK_TRANSACTIONS B,
  BOOK_MASTER BB
WHERE S.STUDENT_CODE=B.STUDENT_CODE
AND TO_CHAR(B.BOOK_EXPECTED_RETURN_DATE,'DD MM YYYY') LIKE TO_CHAR(SYSDATE,'DD MM YYYY');

SELECT S.STAFF_CODE,S.STAFF_NAME,D.DEPT_NAME,F.DESIGN_NAME,G.BOOK_NAME,H.BOOK_ISSUE_DATE FROM
	STAFFMASTER S,DEPARTMENT_MASTER D,DESIGNATION-MASTER F,BOOK_MASTER F,BOOK_ISSUE_DATE H WHERE
	MONTHS_BETWEEN(TO_CHAR(H.BOOK_ISSUE_DATE,'MM'),TO_CHAR(SYSDATE,'MM'))<1;
	
SELECT Staff_Code, Staff_Name,STAFF_SAL  FROM STAFFMASTER WHERE STAFF_SAL<(SELECT AVG(STAFF_SAL) FROM STAFFMASTER);

SELECT AUTHOR,BOOK_NAME FROM BOOK_MASTER GROUP BY AUTHORNAME HAVING COUNT(AUTHOR)>1;

SELECT S.Staff_Code,D.Staff_Name,D.DEPT_NAME FROM STAFFMASTER S,BOOK_TRANSACTIONS D GROUP BY S.STAFF_NAME HAVING COUNT(D.STAFF_NAME)>1;

SELECT S.STUDENT_CODE,S.STUDENT_NAME,D.DEPT_NAME FROM STAFFMASTER S,DEPARTMENT_MASTER D GROUP BY S.DEPT_CODE HAVING MAX(S.DEPT_CODE);

SELECT S.Staff_Code,S.Staff_Name,D.DEPT_NAME,F.DESIGN_NAME FROM STAFFMASTER S, DEPARTMENT_MASTER D,DESIGNATION_MASTER F WHERE 
	MONTHS_BETWEEN(TO_CHAR(HIREDATE,'MM') ,TO_CHAR(SYSDATE,'MM'))<3;
	
SELECT DEPT_CODE,DEPT_NAME,COUNT(S.STAFF_NAME) AS NUMBEROFPEOPLE FROM STAFFMASTER S,DEPARTMENT_MASTER D GROUP BY DEPT_CODE;