DROP DATABASE IF EXISTS `one-to-many-db2`;
CREATE DATABASE IF NOT EXISTS `one-to-many-db2`;
USE `one-to-many-db2`;

SET FOREIGN_KEY_CHECKS = 0;

CREATE TABLE `Cart` (
  `cart_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`cart_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

INSERT INTO `Cart` VALUES 
  (1),
  (2),
  (3);

CREATE TABLE `Items` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `cart_id` int(11) unsigned NOT NULL,
  PRIMARY KEY (`id`),
  KEY `cart_id` (`cart_id`),
  CONSTRAINT `items_ibfk_1` FOREIGN KEY (`cart_id`) REFERENCES `Cart` (`cart_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

INSERT INTO `Items` VALUES 
  (1,1),
  (2,1),
  (3,1);