set foreign_key_checks = 0;

truncate table tb_product;
truncate table tb_order;
truncate table tb_order_product;

set foreign_key_checks = 1;

INSERT INTO tb_product (id, name, price, image_Uri, description) VALUES (1, 'Pizza Bacon', 49.9, 'https://raw.githubusercontent.com/devsuperior/sds2/master/assets/pizza_bacon.jpg', 'Pizza de bacon com mussarela, orégano, molho especial e tempero da casa.');
INSERT INTO tb_product (id, name, price, image_Uri, description) VALUES (2, 'Pizza Moda da Casa', 59.9, 'https://raw.githubusercontent.com/devsuperior/sds2/master/assets/pizza_moda.jpg', 'Pizza à moda da casa, com molho especial e todos ingredientes básicos, e queijo à sua escolha.');
INSERT INTO tb_product (id, name, price, image_Uri, description) VALUES (3, 'Pizza Portuguesa', 45.0, 'https://raw.githubusercontent.com/devsuperior/sds2/master/assets/pizza_portuguesa.jpg', 'Pizza Portuguesa com molho especial, mussarela, presunto, ovos e especiarias.');
INSERT INTO tb_product (id, name, price, image_Uri, description) VALUES (4, 'Risoto de Carne', 52.0, 'https://raw.githubusercontent.com/devsuperior/sds2/master/assets/risoto_carne.jpg', 'Risoto de carne com especiarias e um delicioso molho de acompanhamento.');
INSERT INTO tb_product (id, name, price, image_Uri, description) VALUES (5, 'Risoto Funghi', 59.95, 'https://raw.githubusercontent.com/devsuperior/sds2/master/assets/risoto_funghi.jpg', 'Risoto Funghi feito com ingredientes finos e o toque especial do chef.');
INSERT INTO tb_product (id, name, price, image_Uri, description) VALUES (6, 'Macarrão Espaguete', 35.9, 'https://raw.githubusercontent.com/devsuperior/sds2/master/assets/macarrao_espaguete.jpg', 'Macarrão fresco espaguete com molho especial e tempero da casa.');
INSERT INTO tb_product (id, name, price, image_Uri, description) VALUES (7, 'Macarrão Fusili', 38.0, 'https://raw.githubusercontent.com/devsuperior/sds2/master/assets/macarrao_fusili.jpg', 'Macarrão fusili com toque do chef e especiarias.');
INSERT INTO tb_product (id, name, price, image_Uri, description) VALUES (8, 'Macarrão Penne', 37.9, 'https://raw.githubusercontent.com/devsuperior/sds2/master/assets/macarrao_penne.jpg', 'Macarrão penne fresco ao dente com tempero especial.');

INSERT INTO tb_order (id, status, latitude, longitude, address, moment) VALUES (1, 0, -23.561680, -46.656139, 'Avenida Paulista, 1500', date_sub(sysdate(), interval 1 day));
INSERT INTO tb_order (id, status, latitude, longitude, address, moment) VALUES (2, 1, -22.946779, -43.217753, 'Avenida Paulista, 1500', date_sub(sysdate(), interval 1 day));
INSERT INTO tb_order (id, status, latitude, longitude, address, moment) VALUES (3, 0, -25.439787, -49.237759, 'Avenida Paulista, 1500', date_sub(sysdate(), interval 1 day));
INSERT INTO tb_order (id, status, latitude, longitude, address, moment) VALUES (4, 0, -23.561680, -46.656139, 'Avenida Paulista, 1500', date_sub(sysdate(), interval 1 day));
INSERT INTO tb_order (id, status, latitude, longitude, address, moment) VALUES (5, 1, -23.561680, -46.656139, 'Avenida Paulista, 1500', date_sub(sysdate(), interval 1 day));
INSERT INTO tb_order (id, status, latitude, longitude, address, moment) VALUES (6, 0, -23.561680, -46.656139, 'Avenida Paulista, 1500', date_sub(sysdate(), interval 1 day));
INSERT INTO tb_order (id, status, latitude, longitude, address, moment) VALUES (7, 0, -23.561680, -46.656139, 'Avenida Paulista, 1500', date_sub(sysdate(), interval 1 day));

INSERT INTO tb_order_product (order_id, product_id) VALUES (1 , 1);
INSERT INTO tb_order_product (order_id, product_id) VALUES (1 , 4);
INSERT INTO tb_order_product (order_id, product_id) VALUES (2 , 2);
INSERT INTO tb_order_product (order_id, product_id) VALUES (2 , 5);
INSERT INTO tb_order_product (order_id, product_id) VALUES (2 , 8);
INSERT INTO tb_order_product (order_id, product_id) VALUES (3 , 3);
INSERT INTO tb_order_product (order_id, product_id) VALUES (3 , 4);
INSERT INTO tb_order_product (order_id, product_id) VALUES (4 , 2);
INSERT INTO tb_order_product (order_id, product_id) VALUES (4 , 6);
INSERT INTO tb_order_product (order_id, product_id) VALUES (5 , 4);
INSERT INTO tb_order_product (order_id, product_id) VALUES (5 , 6);
INSERT INTO tb_order_product (order_id, product_id) VALUES (6 , 5);
INSERT INTO tb_order_product (order_id, product_id) VALUES (6 , 1);
INSERT INTO tb_order_product (order_id, product_id) VALUES (7 , 7);
INSERT INTO tb_order_product (order_id, product_id) VALUES (7 , 5);