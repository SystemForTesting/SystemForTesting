INSERT INTO ROLE(id, deleted, createdAt,  name) VALUES (1, 0, CURRENT_TIMESTAMP, 'admin');
INSERT INTO ROLE(id, deleted, createdAt, name) VALUES (2, 0, CURRENT_TIMESTAMP, 'student');
INSERT INTO DBUSER(id, deleted, createdAt, username, password, firstName, lastName, email, ROLE_ID) VALUES (1, 0, CURRENT_TIMESTAMP, 'admin', '$2a$10$tmbxYWr3HiDCvq1dxPu6luNWACloAIE7teQfEnxW5DZ2cWXP7Pqa.', 'Latarsha', 'Weyand', 'weyand@gmail.com', 1);
INSERT INTO DBUSER(id, deleted, createdAt, username, password, firstName, lastName, email, ROLE_ID) VALUES (2, 0, CURRENT_TIMESTAMP, 'student01', '$2a$10$HREPNHpD1PPLynDpj14ryO0Flh06/GZI/t4F/vKhNimX9qZR6y.Ii', 'Shay', 'Macaraeg', 'macaraeg@gmail.com', 2);
INSERT INTO DBUSER(id, deleted, createdAt, username, password, firstName, lastName, email, ROLE_ID) VALUES (3, 0, CURRENT_TIMESTAMP, 'student02', '$2a$10$q0EhIvjh59VKVhMWNYyxMecDz5RuWlCUune1MkPkl/NUcCB15b0Ea', 'Danica', 'Ramerez', 'ramerez@gmail.com', 2);