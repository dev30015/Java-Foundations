DROP DATABASE IF EXISTS `one-to-many-db`;
CREATE DATABASE IF NOT EXISTS `one-to-many-db`;
USE `one-to-many-db`;

SET FOREIGN_KEY_CHECKS = 0;

DROP TABLE IF EXISTS `Users`;
CREATE TABLE `Users` (
  `uid` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(16),
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `Notes`;
CREATE TABLE `Notes` (
  `nid` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `content` VARCHAR(500),
  `uid` int(11) unsigned NOT NULL,
  PRIMARY KEY (`nid`),
  KEY `uid` (`uid`),
  CONSTRAINT `user_uid_fk_1` FOREIGN KEY (`uid`) REFERENCES `Users` (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

INSERT INTO `Users` VALUES 
  (1,"admin"),
  (2,"guest"),
  (3,"zhua");

INSERT INTO `Notes` VALUES
  (1,"my first note",1),
  (2,"my 2nd note",1);