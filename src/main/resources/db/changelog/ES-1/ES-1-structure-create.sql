CREATE TABLE "product"
(
    "id"                SERIAL PRIMARY KEY,
    "name"              varchar(255),
    "short_description" varchar(500),
    "description"       varchar(1000),
    "price"             numeric,
    "created_at"        timestamp,
    "updated_at"        timestamp
);
CREATE TABLE "product_property"
(
    "id"          SERIAL PRIMARY KEY,
    "product_id"  int,
    "property_id" int,
    "order"       int

);
CREATE TABLE "property_type"
(
    "id"         SERIAL PRIMARY KEY,
    "name"       varchar(255),
    "created_at" timestamp,
    "updated_at" timestamp
);
CREATE TABLE "property"
(
    "id"               SERIAL PRIMARY KEY,
    "property_type_id" int,
    "data"             varchar(255),
    "created_at"       timestamp,
    "updated_at"       timestamp
);