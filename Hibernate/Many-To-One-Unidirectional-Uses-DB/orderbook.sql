DROP DATABASE IF EXISTS `orderbook`;
CREATE DATABASE IF NOT EXISTS `orderbook`;
USE `orderbook`;

CREATE TABLE `users`(
    `uid`               BIGINT      NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `name`              VARCHAR(50) NOT NULL
);

INSERT INTO `users` VALUES
(1, "Eric"),
(2, "Alan");

CREATE TABLE `orders`(
    `oid`                  BIGINT      NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `content`              VARCHAR(80) NOT NULL,
    `price`                FLOAT(2)    NOT NULL,
    `ordered_by`           BIGINT      NOT NULL,
    `order_placed`         DATETIME   NOT NULL,
    `order_execution_date` DATETIME,
    `executed`             BOOLEAN,
    FOREIGN KEY (`ordered_by`) REFERENCES `users`(`uid`)
);

INSERT INTO `orders` VALUES
(1, "Buy order", "350.00", 1, "2000-1-01 13:00:00", "2000-1-01 13:00:00", TRUE),
(2, "Buy order", "350.00", 1, "2000-2-01 13:00:00", "2000-2-01 13:00:00", TRUE),
(3, "Sell order", "350.00", 1, "2000-3-01 13:00:00", "2000-3-01 13:00:00", TRUE),
(4, "Sell order", "350.00", 1, "2000-5-01 13:00:00", NULL, FALSE),
(5, "Sell order", "350.00", 1, "2000-5-01 13:00:00", NULL, FALSE);
