DROP TABLE IF EXISTS USERS;

CREATE TABLE USERS (
                       id INT AUTO_INCREMENT PRIMARY KEY,
                       name VARCHAR(30),
                       salary DECIMAL(25, 0)
);