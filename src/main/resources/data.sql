DROP TABLE IF EXISTS bts_station;

CREATE TABLE bts_station(
  id_bts INT AUTO_INCREMENT,
  name VARCHAR(250) NOT NULL,
);

DROP TABLE IF EXISTS bts_price;

CREATE TABLE bts_price (
  id_bts_price INT AUTO_INCREMENT,
  bts_departure VARCHAR(250) NOT NULL,
  bts_destination VARCHAR(250) NOT NULL,
  bts_price INT NOT NULL
);

DROP TABLE IF EXISTS mrt_station;

CREATE TABLE mrt_station(
  id_mrt INT AUTO_INCREMENT,
  name VARCHAR(250) NOT NULL,
);

DROP TABLE IF EXISTS mrt_price;

CREATE TABLE mrt_price (
  id_mrt_price INT AUTO_INCREMENT,
  mrt_departure VARCHAR(250) NOT NULL,
  mrt_destination VARCHAR(250) NOT NULL,
  mrt_price INT NOT NULL
);

DROP TABLE IF EXISTS place;

CREATE TABLE place (
  id INT AUTO_INCREMENT,
  name VARCHAR(250) NOT NULL,
  id_bts INT NOT NULL,
  id_mrt INT NOT NULL
);

INSERT INTO bts_station (name) VALUES
  ('Mochit')
;

INSERT INTO bts_price (bts_departure, bts_destination, bts_price) VALUES
  ('Mochit', 'Mochit', 16)
;

INSERT INTO mrt_station (name) VALUES
  ('Hua Lamphong')
;

INSERT INTO mrt_price (mrt_departure, mrt_destination, mrt_price) VALUES
  ('Hua Lamphong', 'Sam Yan', 15)
;

INSERT INTO place (name, id_bts, id_mrt) VALUES
  ('Fortune town', 0, 9)
;