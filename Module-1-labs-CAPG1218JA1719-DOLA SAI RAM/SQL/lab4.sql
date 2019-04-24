Create the Customer table with the following columns. 
	CustomerId	Number(5)
	Cust_Name	varchar2(20)
	Address1	Varchar2(30)
	Address2 	Varchar2(30)
	   ==>create table customer
	(
	customerid number(5),
	cust_name varchar2(20),
	Address1 varchar2(30),
	Address2 varchar2(30)
	); 
	
Alter table customer rename column cust_name to customername;
Alter table customer modify customername  varchar2(30) Not Null;

Alter table customer add Gender varchar2(1);
Alter table customer add Age Number(3);
Alter table customer add phoneNo(10);

Rename customer to cust_table;

insert into cust_table(&Customerid,'&cust_Name','&Address1','&Address2','&Gender',&Age,&phoneNo);

Alter table cust_table add constraints Custid_prim PRIMARY KEY (customerid);

Alter table cust_table drop PRIMARY KEY custid_prim;

Alter table cust_table add constraints Custid_prim PRIMARY KEY (customerid);

Alter table cust_table drop PRIMARY KEY custid_prim;
Insert into cust_table(1002, Becker, #114 New York, #114 New york , M, 45,431525, 15000.50);
insert into cust_table(1003, Nanapatekar, #115 India, #115 India , M, 45, 431525,20000.50);

TRUNCATE table cust_table;
Alter table add e_mail varchar2(30);
Alter table cust_table DROP e_mail;

create table Suppliers as 
	select(customerid as suppid,customername as sname,adddress1 as addr1,address2 as addr2,phoneno as contactno) from cust_table;

Drop table Suppliers;
create table customermaster(customerid(10) primary key(custid_pk),customername varchar2(30),Address1 varchar2(30),Address2 varchar2(30),
	Gender varchar2(1),Age number(3),phoneno number(10));
	
Create table Accoutnmaster(customerid number(5),Accountnumber number(10) primary key(acno),accounttype char(3),ledgerbalance number(10) Not Null);

Create sequence seq_ano
		MINVALUE 101
		MAXVALUE 10000
		START WITH 101
		INCREMENT BY 1
		CACHE 101;
		
Alter table Accountmaster ADD constraint ass_fk FOREIGN KEY(customerid) REFERENCES customermaster(customerid);

Insert into customermaster values(1000, Allen, #115 Chicago, #115 Chicago, M, 25, 7878776);
Insert into customermaster values(1001, George, #116 France, #116 France, M, 25, 4345240;
insert into customermaster values(1002, Becker, #114 New York, #114 New York, M, 45, 4315250;


alter table Accountmaster add constraint ck_ac check(accountype='NRI' or accountype='IND');
Delete from Accountmaster,customertable where customerid = 1001;
Create table accountdetails as select * from Accountmaster;
CREATE VIEW Acc_view AS SELECT(Customerid,Customername,Accountnumber,AccountType,ledgerBalance)
	from AccountMaster;
CREATE VIEW vAccs_Dtls AS SELECT 	Accounttype,ledgerbalance from Accountmaster where accounttype = 'IND' and ledgerbalance < 10000;
create view accsvw10 AS SELECT * FROM Employee with READ ONLY;
CREATE sequence SEQ_DEPT minvalue 40 start with 40
	increment by 10 MAX VALUE 200 cache 40;
	
create table departmentmaster(deptno number(50),Dname varchar2(25),location varchar2(25));
insert into departmentmaster  values(seq_dept.NEXTVAL,'MARKETING','NEW DELHI');
insert into departmentmaster  values(seq_dept.NEXTVAL,'SALES','chennai');
insert into departmentmaster  values(seq_dept.NEXTVAL,'RESEARCH','BOSTON');

DROP sequence seq_dept;

CREATE INDEX no_name on emp(empno);

create SYNONYM synemp for emp;

select * from synemp;

CREATE INDEX IDX_EMP_HIREDATE on emp(HIREDATE);

CREATE sequence SEQ_EMP minvalue 1001 start with 1001
	increment by 1 cache 1001;