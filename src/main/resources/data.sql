DROP TABLE IF EXISTS people;
 
CREATE TABLE people (
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  sweetness INT NOT NULL,
  definition VARCHAR(250) DEFAULT NULL
);
 
INSERT INTO people (name, sweetness, definition) VALUES
  ('Saadet', 100, 'The last içli köfte bender'),
  ('Ferhat', 170, 'Walking Man'),
  ('Onur', 100, 'Private Hero'),
  ('Evrim', 100, 'Interface Guy'),
  ('Gülin', 100, 'No Mouse, Yes Touchpad'),
  ('Barış', 100, 'Anime Lover'),
  ('Emre', 100, 'Mr. Moustache'),
  ('Eda', 100, 'Rookie Lady'),
  ('Onder', '100', 'Hometown Lover');
