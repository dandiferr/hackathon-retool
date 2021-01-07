USE `retool_demo`;

INSERT INTO `users` (id, ari, first_name, last_name, email, phone, status) VALUES (1, "USR-123", "Jason", "Campos", "jason.campos@affirm.com", "8005551212", "active");
INSERT INTO `loans` (id, ari, apr, autopay, merchant, total_paid, total_remaining, purchase_total, monthly_amount) VALUES (1, "LOAN-1234", 9.99, false, "Peloton", 100.00, 900.00, 1000.00, 33.33);
