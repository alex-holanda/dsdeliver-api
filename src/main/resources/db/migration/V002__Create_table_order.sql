CREATE TABLE tb_order (
    id BIGINT NOT NULL AUTO_INCREMENT,
    address VARCHAR(250),
    latitude DECIMAL(10,8),
    longitude DECIMAL(10,8),
    moment DATETIME,
    status VARCHAR(50),
    total DECIMAL (12,2),

    CONSTRAINT pk_order_id PRIMARY KEY (id)
);