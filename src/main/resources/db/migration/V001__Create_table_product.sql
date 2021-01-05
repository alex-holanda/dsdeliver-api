CREATE TABLE tb_product (
    id BIGINT NOT NULL AUTO_INCREMENT,
    name VARCHAR(80) NOT NULL,
    price DECIMAL(10,2) NOT NULL,
    description VARCHAR(200),
    image_uri VARCHAR(254),

    CONSTRAINT pk_product_id PRIMARY KEY (id)
);