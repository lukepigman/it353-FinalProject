CREATE TABLE STUDENT
(FIRSTNAME VARCHAR(30)NOT NULL,
LASTNAME VARCHAR(30)NOT NULL,
USERID VARCHAR(30)NOT NULL,
EMAIL VARCHAR(30)NOT NULL,
PASSWORD VARCHAR(30)NOT NULL,
PASSWORDCONFIRM VARCHAR(30)NOT NULL,
QUESTION VARCHAR(30),
ANSWER VARCHAR(30),
GPA VARCHAR(3),
ACT VARCHAR(4),
SAT VARCHAR(4),
SCHOOLCHOICE VARCHAR(30),
MAJORCHOICE VARCHAR(30),
CONSTRAINT STUDENT_USERID_PK PRIMARY KEY (USERID));
