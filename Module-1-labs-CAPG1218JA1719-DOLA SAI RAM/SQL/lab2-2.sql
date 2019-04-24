SELECT ROUND(max(Staff_sal)) AS Maximum,ROUND(Min(Staff_Sal)) AS Minimum,ROUND(Avg(Staff_sal)) AS Average
      FROM Staff_master;
	  
SELECT Deptno,COUNT(deptno) AS Total_Number_of_Managers     
       FROM EMP WHERE JOB IN('MANAGER') GROUP BY Deptno,job;
	   
SELECT Deptno,sum(sal) FROM EMP
    WHERE JOB NOT IN('MANAGER')
         GROUP BY Deptno --HAVING sum(sal) > 20000-- ORDER BY DeptNo;