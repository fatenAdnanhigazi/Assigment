CREATE TABLE shopper_shelves if NOT EXISTS(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    shopper_id VARCHAR(255) NOT NULL,
    product_id VARCHAR(255) NOT NULL,
    relevancy_score FLOAT NOT NULL
);
