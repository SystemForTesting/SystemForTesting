INSERT INTO ROLE(id, deleted, createdAt,  roleName) VALUES (1, 0, CURRENT_TIMESTAMP, 'admin');
INSERT INTO ROLE(id, deleted, createdAt, roleName) VALUES (2, 0, CURRENT_TIMESTAMP, 'student');
INSERT INTO DBUSER(id, deleted, createdAt, username, password, firstName, lastName, email, ROLE_ID) VALUES (1, 0, CURRENT_TIMESTAMP, 'admin', 'admin', 'Latarsha', 'Weyand', 'weyand@gmail.com', 1);
INSERT INTO DBUSER(id, deleted, createdAt, username, password, firstName, lastName, email, ROLE_ID) VALUES (2, 0, CURRENT_TIMESTAMP, 'student01', 'student01', 'Shay', 'Macaraeg', 'macaraeg@gmail.com', 2);
INSERT INTO DBUSER(id, deleted, createdAt, username, password, firstName, lastName, email, ROLE_ID) VALUES (3, 0, CURRENT_TIMESTAMP, 'student02', 'student02', 'Danica', 'Ramerez', 'ramerez@gmail.com', 2);