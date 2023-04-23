-- Crear tabla DEMO
DROP TABLE IF EXISTS PEDIDO_MUJER;
CREATE TABLE PEDIDO_MUJER (
    ID INT NOT NULL AUTO_INCREMENT,
    KEY_NAME VARCHAR(50) NOT NULL,
    FIRST_NAME VARCHAR(255) NOT NULL,
    PRIMARY KEY (ID)
);

-- Crear tabla DEMO
DROP TABLE IF EXISTS STOCK_MUJER;
CREATE TABLE STOCK_MUJER (
    ID INT NOT NULL AUTO_INCREMENT,
    KEY_NAME VARCHAR(50) NOT NULL,
    FIRST_NAME VARCHAR(255) NOT NULL,
    CANTIDAD INT NOT NULL,
    PRIMARY KEY (ID)
);