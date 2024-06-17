 CREATE TABLE shoppers (
     shopper_id VARCHAR(255) PRIMARY KEY,
     shelf JSONB
 );

 CREATE TABLE products (
     product_id VARCHAR(255) PRIMARY KEY,
     category VARCHAR(255),
     brand VARCHAR(255)
 );
