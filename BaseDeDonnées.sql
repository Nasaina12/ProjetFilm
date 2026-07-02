CREATE DATABASE "Platforme_film";

\c "Platforme_film";

CREATE TABLE Films
(
    id SERIAL PRIMARY KEY,
    titre VARCHAR(255),
    type VARCHAR(50),
    date_sortie DATE,
    qualite_video VARCHAR(20),
    duree INTEGER
);

INSERT INTO Films (titre, type, date_sortie, qualite_video, duree) VALUES
('Avatar', 'Science-fiction', '2009-12-18', '4K', 162),
('Titanic', 'Romance', '1997-12-19', '1080p', 195),
('Inception', 'Science-fiction', '2010-07-16', '4K', 148),
('The Dark Knight', 'Action', '2008-07-18', '1080p', 152),
('Interstellar', 'Science-fiction', '2014-11-07', '4K', 169),
('Avengers: Endgame', 'Action', '2019-04-26', '4K', 181),
('The Lion King', 'Animation', '1994-06-24', '720p', 88),
('Frozen', 'Animation', '2013-11-27', '1080p', 102),
('Joker', 'Drame', '2019-10-04', '1080p', 122),
('Parasite', 'Thriller', '2019-05-30', '4K', 132);