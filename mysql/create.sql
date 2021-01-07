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

CREATE TABLE IF NOT EXISTS `loans` (
  id INT auto_increment PRIMARY KEY,
  ari VARCHAR(255) NOT NULL,
  apr DECIMAL(5,2) NOT NULL,
  autopay BOOLEAN NOT NULL,
  merchant VARCHAR(255) NOT NULL,
  total_paid DECIMAL(6,2) NOT NULL,
  total_remaining DECIMAL(6,2) NOT NULL,
  purchase_total DECIMAL(6,2) NOT NULL,
  monthly_amount DECIMAL(6,2) NOT NULL
) ENGINE=INNODB;

CREATE FULLTEXT INDEX `idx_loans_ari` ON `loans` (`ari`);
