# SpringMVCBasicAuthentication
 SpringMVCBasicAuthentication via JDBC
 

 1-)User enters username and password in the corresponding fields.
 2-)Routing to successful or unsuccessful screens after checking over database.
 
 
 
 
--MYDATABASE DLL-- 
 
CREATE TABLE USERS 
(
  ID NUMBER 
, FIRST_NAME VARCHAR2(20 BYTE) 
, LAST_NAME VARCHAR2(20 BYTE) 
, USER_NAME VARCHAR2(20 BYTE) 
, PASSWORD VARCHAR2(20 BYTE) 
, LAST_LOGIN_DATE DATE 
) 
LOGGING 
TABLESPACE USERS 
PCTFREE 10 
INITRANS 1 
STORAGE 
( 
  INITIAL 65536 
  NEXT 1048576 
  MINEXTENTS 1 
  MAXEXTENTS UNLIMITED 
  BUFFER_POOL DEFAULT 
) 
NOCOMPRESS 
NOPARALLEL;

---------------
