CREATE TABLE product_metadata (
    id SERIAL PRIMARY KEY,
    product_id VARCHAR(50) NOT NULL,
    category VARCHAR(50),
    brand VARCHAR(50)
);
