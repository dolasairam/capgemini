SELECT Staff_Name,$||LPAD(Staff_sal,15,'') FROM Staff_Master;
SELECT Student_Name,TO_CHAR(Student_dob,'MONTH,DD YYY') from Student_Master WHERE (TO_CHAR(Student_dob,'day') IN ('saturday','sunday');
		 
SELECT Staff_name, ROUND(MONTHS_BETWEEN(SYSDATE,HireDate))AS Months Worked FROM Staff_Master 
           ORDER BY HireDate;

SELECT Staff_Name from Staff_Master WHERE EXTRACT(DATE FROM HireDate) < 16 AND EXTRACT(MONTH FROM HireDate ) = 12 ;


SELECT Staff_Name,HireDate,Staff_Sal 
   CASE
     WHEN Stff_Sal >=50000    THEN  'A',
     WHEN Staff_Sal >= 25000 AND Staff_Sal <5000 THEN 'B',
	 WHEN Staff_Sal >= 10000 AND Staff_Sal <25000 THEN 'C',
	 WHEN Staff_Sal  10000 THEN 'D'
	END AS GRADE 
	FROM Staff_master;
	
SELECT Staff_Name,HireDate,TO_CHAR(HireDate,'DAY') AS DAY FROM Staff_Master
    ORDER BY next_day(HireDate,'Monday')-HireDate;

SELECT INSTR('mississippi','i',1,3) from Dual;

SELECT TO_CHAR(NEXT_DAY(
         LAST_DAY(SYSDATE) - INTERVAL '7' DAY,
         'FRIDAY'
       ),'ddthsp "of"  Month,YYYY') AS PAY_DATE FROM DUAL;
	   
 SELECT  Student_Code,Student-name,Dept_Code 
   DECODE(Dept_Code,10,'Electricals',20,'Electronics','Others')
  FROM Student_Master;