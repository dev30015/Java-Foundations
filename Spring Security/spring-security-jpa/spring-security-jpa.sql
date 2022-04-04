DROP DATABASE IF EXISTS `spring-security-jpa`;
CREATE DATABASE IF NOT EXISTS `spring-security-jpa`;
USE `spring-security-jpa`;

SET FOREIGN_KEY_CHECKS = 0;

DROP TABLE IF EXISTS `users`;
CREATE TABLE users (
    uid     INT  NOT NULL AUTO_INCREMENT PRIMARY KEY, 
    username VARCHAR(16),  
    password VARCHAR(100)        NOT NULL, 
    email    VARCHAR(30)       NOT NULL,
    /*start of user details*/
    enabled boolean default 1,
    account_non_expired boolean default 1,
    account_non_locked boolean default 1,
    credentials_non_expired boolean default 1,
    /*end of user details*/
    UNIQUE (username),
    UNIQUE (uid)
)ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;


INSERT INTO `users` VALUES 
  (1,"admin","$2a$10$k2sFbBdYtN9l4GWA.zS6tOb8oYHLPZjXG.v3Rh3aet7szYD3H0.9a","admin@test.com","1","1","1","1"),
  (2,"user1","$2a$10$k2sFbBdYtN9l4GWA.zS6tOb8oYHLPZjXG.v3Rh3aet7szYD3H0.9a","user1@test.com","1","1","1","1");


DROP TABLE IF EXISTS `Role`;
CREATE TABLE Role (
    rid INT  NOT NULL AUTO_INCREMENT PRIMARY KEY,
    role_name varchar(30),
    role_description varchar(80)
); 

INSERT INTO `Role` VALUES 
  (1,"ROLE_ADMIN",'Administrator'),
  (2,"ROLE_MANAGER",'Manager'),
  (3,"ROLE_USER",'User');


DROP TABLE IF EXISTS `Permission`;
CREATE TABLE Permission (
    pid int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    permission_name varchar(30),
    permission_tag varchar(50)
); 


/*Many user can have many roles */
DROP TABLE IF EXISTS `users_roles`;
CREATE TABLE users_roles (
  user_id int not null,
  role_id int not null,
  PRIMARY KEY (`user_id`,`role_id`),
  FOREIGN KEY (user_id) REFERENCES users(uid),
  FOREIGN KEY (role_id) REFERENCES role(rid)
);

insert  into `users_roles`(`user_id`,`role_id`) values (1,1),(2,3);

DROP TABLE IF EXISTS `role_permission`;
CREATE TABLE role_permission (
  role_id int default null,
  permission_id int default null,
  FOREIGN KEY (role_id) REFERENCES role(rid),
  FOREIGN KEY (permission_id) REFERENCES permission(pid)
);
