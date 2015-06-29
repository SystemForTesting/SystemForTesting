INSERT INTO ROLE(id, deleted, createdAt,  name) VALUES (1, 0, CURRENT_TIMESTAMP, 'admin');
INSERT INTO ROLE(id, deleted, createdAt, name) VALUES (2, 0, CURRENT_TIMESTAMP, 'user');
INSERT INTO DBUSER(id, deleted, createdAt, username, password, firstName, lastName, email, ROLE_ID) VALUES (1, 0, CURRENT_TIMESTAMP, 'admin', '$2a$10$tmbxYWr3HiDCvq1dxPu6luNWACloAIE7teQfEnxW5DZ2cWXP7Pqa.', 'Latarsha', 'Weyand', 'weyand@gmail.com', 1);
INSERT INTO DBUSER(id, deleted, createdAt, username, password, firstName, lastName, email, ROLE_ID) VALUES (2, 0, CURRENT_TIMESTAMP, 'student01', '$2a$10$HREPNHpD1PPLynDpj14ryO0Flh06/GZI/t4F/vKhNimX9qZR6y.Ii', 'Shay', 'Macaraeg', 'macaraeg@gmail.com', 2);
INSERT INTO DBUSER(id, deleted, createdAt, username, password, firstName, lastName, email, ROLE_ID) VALUES (3, 0, CURRENT_TIMESTAMP, 'student02', '$2a$10$q0EhIvjh59VKVhMWNYyxMecDz5RuWlCUune1MkPkl/NUcCB15b0Ea', 'Danica', 'Ramerez', 'ramerez@gmail.com', 2);

Insert into TEST (ID,CREATEDAT,DELETED,UPDATEDAT,DURATION,PASSMARK,TITLE,CREATEDBY_ID,UPDATEDBY_ID) values (1,to_timestamp('24-JUN-15 01.58.24.531000000 PM','DD-MON-RR HH.MI.SS.FF AM'),0,null,'PT2H',80,'First test',1,null);

Insert into QUESTION (ID,CREATEDAT,DELETED,UPDATEDAT,TITLE,WEIGHT) values (1,to_timestamp('24-JUN-15 02.11.30.337000000 PM','DD-MON-RR HH.MI.SS.FF AM'),0,to_timestamp('24-JUN-15 02.11.33.909000000 PM','DD-MON-RR HH.MI.SS.FF AM'),'First question',0.5);
Insert into QUESTION (ID,CREATEDAT,DELETED,UPDATEDAT,TITLE,WEIGHT) values (2,to_timestamp('24-JUN-15 02.12.06.824000000 PM','DD-MON-RR HH.MI.SS.FF AM'),0,to_timestamp('24-JUN-15 02.12.04.144000000 PM','DD-MON-RR HH.MI.SS.FF AM'),'Second question',1);

Insert into TEST_QUESTION (TEST_ID,QUESTIONS_ID) values (1,1);
Insert into TEST_QUESTION (TEST_ID,QUESTIONS_ID) values (1,2);

Insert into ANSWER (ID,CREATEDAT,DELETED,UPDATEDAT,RIGHT,TEXT,QUESTION_ID) values (1,to_timestamp('24-JUN-15 02.06.59.221000000 PM','DD-MON-RR HH.MI.SS.FF AM'),0,to_timestamp('24-JUN-15 02.07.01.514000000 PM','DD-MON-RR HH.MI.SS.FF AM'),1,'First answer',1);
Insert into ANSWER (ID,CREATEDAT,DELETED,UPDATEDAT,RIGHT,TEXT,QUESTION_ID) values (2,to_timestamp('24-JUN-15 02.12.20.746000000 PM','DD-MON-RR HH.MI.SS.FF AM'),0,to_timestamp('24-JUN-15 02.12.23.902000000 PM','DD-MON-RR HH.MI.SS.FF AM'),0,'Second answer',1);
Insert into ANSWER (ID,CREATEDAT,DELETED,UPDATEDAT,RIGHT,TEXT,QUESTION_ID) values (3,to_timestamp('24-JUN-15 02.12.45.644000000 PM','DD-MON-RR HH.MI.SS.FF AM'),0,to_timestamp('24-JUN-15 02.12.50.788000000 PM','DD-MON-RR HH.MI.SS.FF AM'),0,'Third answer',1);

-- so that hibernate sequence starts from 4
select hibernate_sequence.nextval from dual;
select hibernate_sequence.nextval from dual;
select hibernate_sequence.nextval from dual;

