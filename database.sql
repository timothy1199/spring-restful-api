CREATE DATABASE belajar_spring_restful_api;

CREATE TABLE users
(
    username VARCHAR(100) NOT NULL,
    password VARCHAR(100) NOT NULL,
    name VARCHAR(100) NOT NULL,
    token VARCHAR(100),
    token_expired_at BIGINT,
    PRIMARY KEY (username),
    UNIQUE(token)
);

SELECT * FROM users;

SELECT
    column_name,
    data_type,
    character_maximum_length,
    is_nullable
FROM
    information_schema.columns
WHERE
    table_name = 'contacts';


CREATE TABLE contacts(
    id VARCHAR(100) NOT NULL,
    username VARCHAR(100) NOT NULL,
    first_name VARCHAR(100) NOT NULL,
    last_name VARCHAR(100),
    phone VARCHAR(100),
    email VARCHAR(100),
    PRIMARY KEY (id),
    CONSTRAINT fk_users_contacts FOREIGN KEY (username) REFERENCES users(username)
)

CREATE TABLE addresses(
    id VARCHAR(100) NOT NULL ,
    contact_id varchar(100) NOT NULL,
    street VARCHAR(200),
    city VARCHAR(100),
    province VARCHAR(100),
    country VARCHAR(100) NOT NULL,
    postal_code VARCHAR(10),
    PRIMARY KEY (id),
    CONSTRAINT fk_contacts_addresses FOREIGN KEY (contact_id) REFERENCES contacts(id)
);

select * from addresses;

DELETE FROM addresses;

DELETE FROM CONTACTS;
DELETE FROM users;
