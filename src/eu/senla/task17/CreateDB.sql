CREATE DATABASE app CHARACTER SET utf8 COLLATE utf8_bin;
USE app;



CREATE TABLE users (
  id int(10) NOT NULL AUTO_INCREMENT,
  login varchar(20) NOT NULL,
  password varchar(24) NOT NULL,
  PRIMARY KEY (id)
);

