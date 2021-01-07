CREATE DATABASE IF NOT EXISTS `retool_demo`;

USE `retool_demo`;

CREATE TABLE IF NOT EXISTS `users` (
  id INT auto_increment PRIMARY KEY,
  ari VARCHAR(255) NOT NULL,
  first_name VARCHAR(255) NOT NULL,
  last_name VARCHAR(255) NOT NULL,
  email VARCHAR(255) NOT NULL,
  phone VARCHAR(64) NOT NULL,
  status VARCHAR(16) NOT NULL
) ENGINE=INNODB;

CREATE FULLTEXT INDEX `idx_users_ari` ON `users` (`ari`);
CREATE FULLTEXT INDEX `idx_users_first_name` ON `users` (`first_name`);
CREATE FULLTEXT INDEX `idx_users_last_name` ON `users` (`last_name`);
CREATE FULLTEXT INDEX `idx_users_email` ON `users` (`email`);
CREATE FULLTEXT INDEX `idx_users_phone` ON `users` (`phone`);
