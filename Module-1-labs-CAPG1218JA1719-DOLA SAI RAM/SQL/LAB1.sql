1.1 SELECT Staff_Name AS STAFF NAME,Design_code AS DESIGNATION CODE from Staff_Master 
        WHERE HireDate < 01-JAN-2003 AND Staff_sal BETWEEN 12000 AND 25000;
		
1.2 SELECT Staff_code,Staff_Name,Dept_code from Staff_Master WHERE ROUND((MONTHS_BETWEEN(SYSTEM,HireDate)/12) >= 18 ORDER BY HireDate;

1.3 SELECT Staff_code,Staff_Name,Staff_dob,Staf_Address,Staff_sal FROM Staff-Master WHERE Mgr_code IS NULL;

1.4 SELECT Book_Code,Book_Name,Book_pub_year,Book_pub_author 
        WHERE Book_pub_year BETWEEN 2001 AND 2004 OR Book_Name LIKE '%&%';
		
1.5 SELECT Staff_Name FROM Staff_Master WHERE Staff_Name LIKE '%$_%' ESCAPE= '$';
