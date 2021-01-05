CREATE TABLE tb_order_product(
   order_id BIGINT NOT NULL,
   product_id BIGINT NOT NULL,

   CONSTRAINT pk_order_product_id PRIMARY KEY (order_id, product_id),
   CONSTRAINT fk_order_product_order FOREIGN KEY (order_id) REFERENCES tb_order (id),
   CONSTRAINT fk_order_product_product FOREIGN KEY (product_id) REFERENCES tb_product (id)
);