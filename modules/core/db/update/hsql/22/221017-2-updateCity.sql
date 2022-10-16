alter table SALES_CITY alter column PHONE_NUMBER rename to PHONE_NUMBER__U85240 ^
alter table SALES_CITY alter column PHONE_NUMBER__U85240 set null ;
-- alter table SALES_CITY add column PHONE_NUMBER varchar(255) ^
-- update SALES_CITY set PHONE_NUMBER = <default_value> ;
-- alter table SALES_CITY alter column PHONE_NUMBER set not null ;
alter table SALES_CITY add column PHONE_NUMBER varchar(255) ;
