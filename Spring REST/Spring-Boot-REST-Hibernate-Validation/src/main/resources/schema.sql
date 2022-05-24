DROP DATABASE IF EXISTS `employee-db`;
CREATE DATABASE IF NOT EXISTS `employee-db`;
USE `employee-db`;

CREATE TABLE `employees`(
    `id`               BIGINT      NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `username`              VARCHAR(50) NOT NULL,
    `email`              VARCHAR(50) NOT NULL
);
