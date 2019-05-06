CREATE TABLE travel(
	id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	travel VARCHAR(30) NOT NULL
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO travel (travel) values ('Rio de Janeiro');
INSERT INTO travel (travel) values ('São Paulo');