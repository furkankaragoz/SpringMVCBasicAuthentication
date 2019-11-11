# SpringMVCBasicAuthentication
 SpringMVCBasicAuthentication via JDBC
 

 1-)User enters username and password in the corresponding fields.<br>
 2-)Routing to successful or unsuccessful screens after checking over database.<br>
 
 
 
 
--MYDATABASE DLL-- <br>
 
CREATE TABLE USERS <br>
(<br>
  ID NUMBER <br>
, FIRST_NAME VARCHAR2(20 BYTE) <br>
, LAST_NAME VARCHAR2(20 BYTE) <br>
, USER_NAME VARCHAR2(20 BYTE) <br>
, PASSWORD VARCHAR2(20 BYTE) <br>
, LAST_LOGIN_DATE DATE <br>
) <br>
LOGGING <br>
TABLESPACE USERS <br>
PCTFREE 10 <br>
INITRANS 1 <br>
STORAGE <br>
( 
  INITIAL 65536 <br>
  NEXT 1048576 <br>
  MINEXTENTS 1 <br>
  MAXEXTENTS UNLIMITED <br>
  BUFFER_POOL DEFAULT <br>
) <br>
NOCOMPRESS <br>
NOPARALLEL;<br>

---------------
