CREATE TABLE shopper_product (
    id SERIAL PRIMARY KEY,
    shopper_id VARCHAR(50) NOT NULL,
    product_id VARCHAR(50) NOT NULL,
    relevancy_score FLOAT NOT NULL
);
