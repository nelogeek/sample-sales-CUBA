-- update SALES_CITY set PHONE_NUMBER = <default_value> where PHONE_NUMBER is null ;
alter table SALES_CITY alter column PHONE_NUMBER set not null ;
