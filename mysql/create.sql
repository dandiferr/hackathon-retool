CREATE DATABASE IF NOT EXISTS `retool_demo`;

USE `retool_demo`;

CREATE TABLE IF NOT EXISTS `merchants` (
  `id` INT auto_increment PRIMARY KEY,
  `ari` VARCHAR(255) NOT NULL,
  `merchant_name` VARCHAR(255) NOT NULL,
  `website` VARCHAR(255) NOT NULL,
  `affirm_txn_fee` DECIMAL(6,2) NOT NULL,
  `integration_type` VARCHAR(255) NOT NULL,
  `integration_channel` VARCHAR(255) NOT NULL,
  `admin_name` VARCHAR(255) NOT NULL,
  `admin_email` VARCHAR(255) NOT NULL,
  `admin_phone` VARCHAR(64) NOT NULL,
  `fraud_name` VARCHAR(255) NOT NULL,
  `fraud_email` VARCHAR(255) NOT NULL,
  `fraud_phone` VARCHAR(64) NOT NULL
) ENGINE=INNODB;

CREATE FULLTEXT INDEX `idx_merchants_ari` ON `merchants` (`ari`);
CREATE FULLTEXT INDEX `idx_merchants_merchant_name` ON `merchants` (`merchant_name`);
CREATE FULLTEXT INDEX `idx_merchants_website` ON `merchants` (`website`);
