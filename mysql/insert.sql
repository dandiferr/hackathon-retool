USE `retool_demo`;

INSERT INTO `merchants` (
  `id`,
  `ari`,
  `merchant_name`,
  `website`,
  `affirm_txn_fee`,
  `integration_type`,
  `integration_channel`,
  `admin_name`,
  `admin_email`,
  `admin_phone`,
  `fraud_name`,
  `fraud_email`,
  `fraud_phone`
) VALUES (
  1,
  "MERCHANT-1234",
  "Peloton",
  "www.peloton.com",
  6.50,
  "direct",
  "ecommerce",
  "John Smith",
  "john.smith@affirm.com",
  "1234567890",
  "",
  "",
  ""
);
