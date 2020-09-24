DROP TABLE IF EXISTS stock_candle;
DROP TABLE IF EXISTS import_stock_candle;
DROP TABLE IF EXISTS stock;

CREATE TABLE stock (
    id                  SERIAL PRIMARY KEY,
    symbol              VARCHAR(5),
    name                VARCHAR(50),
    industry            VARCHAR(50)
);

CREATE TABLE import_stock_candle (
    id                  SERIAL PRIMARY KEY,
    import_timestamp    TIMESTAMP,
    source_process      VARCHAR(50)
);

CREATE TABLE stock_candle (
    id                  SERIAL PRIMARY KEY,
    stock_id            INT REFERENCES stock (id),
    start_timestamp     TIMESTAMP,
    resolution          VARCHAR(1),
    open                NUMERIC(6,4),
    close               NUMERIC(6,4),
    high                NUMERIC(6,4),
    low                 NUMERIC(6,4),
    volume              INT
);