Create Employee table with same structure as EMP table
Create table employee as select * from emp where 1=3;
desc employee;

update table employee set job=(select job from employee where empno=7788),deptno=(select deptno from employee where empno=7788) where empno=7698;

delete from employee where departmentname like '%sales%';

update table employee set deptno=(select deptno from employee where deptno=7788) where deptno=7698;

insert into emp (empno,'ename','job',mgr,'hiredate',sal,comm,deptno) values (1000,Allen, Clerk,1001,12-jan-01, 3000, 2,10);
insert into emp (empno,'ename','job',mgr,'hiredate',sal,comm,deptno) values (1001,George, analyst, null, 08 Sep 92, 5000,0, 10);
insert into emp (empno,'ename','job',mgr,'hiredate',sal,comm,deptno) values (1002, Becker, Manager, 1000, 4 Nov 92, 2800,4, 20);
insert into emp (empno,'ename','job',mgr,'hiredate',sal,comm,deptno) values (1003, 'Bill', Clerk, 1002, 4 Nov 92,3000, 0, 20);

insert into customermaster (customerid,'customername','address1','address2','gender',age,'phoneno) values 
	( 6000, John, #115 Chicago, #115 Chicago, M, 25, 7878776, 10000 );
	
insert into customermaster (customerid,'customername','address1','address2','gender',age,'phoneno) values
	(	6001, Jack, #116 France, #116 France, M, 25, 434524, 20000  );
	
insert into customermaster (customerid,'customername','address1','address2','gender',age,'phoneno) values
 (	6002, James, #114 New York, #114 New York, M, 45, 431525, 15000.50);
 
 insert into customermaster (customerid,'customername','address1','address2','gender',age,'phoneno) values 
	(	6001, Jack, #116 France, #116 France, M, 25, 434524, 20000  );
	
savepoint p1;

insert into customermaster (customerid,'customername','address1','address2','gender',age,'phoneno) values 
	(	6003, John, #114 Chicago, #114 Chicago, M, 45, 439525, 19000.60);
	
rollback p1;