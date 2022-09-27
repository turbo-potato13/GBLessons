CREATE TABLE users
(
    id   bigserial PRIMARY KEY,
    name VARCHAR(255),
    age  INTEGER
);
INSERT INTO users (name, age)
VALUES ('Arnold S.', 45),
       ('Jean R.', 54);

CREATE TABLE products
(
    id    bigserial PRIMARY KEY,
    title VARCHAR(255),
    price INTEGER
);
INSERT INTO products (title, price)
VALUES ('vase', 10),
       ('sphere', 3);