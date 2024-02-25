Create database accountAndUser
\c accountAndUser;

CREATE TABLE "public"."usr" (
    id SERIAL PRIMARY KEY,
    createdDate TIMESTAMP,
    updatedDate TIMESTAMP,
    name VARCHAR(255),
    surname VARCHAR(255),
    email VARCHAR(255),
    phoneNumber VARCHAR(20),
    password VARCHAR(255)
);
