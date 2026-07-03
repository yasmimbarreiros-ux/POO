CREATE DATABASE	sistema_medicoes;
USE sistema_medicoes;


CREATE TABLE sensor (
    id_sensor INT AUTO_INCREMENT PRIMARY KEY,
    codigo VARCHAR(50) NOT NULL,
    tipo VARCHAR(100) NOT NULL,
    localizacao VARCHAR(150) NOT NULL
);

CREATE TABLE medicao (
    id_medicao INT AUTO_INCREMENT PRIMARY KEY,
    valor DECIMAL(10,2) NOT NULL,
    unidade VARCHAR(30) NOT NULL,
    data_hora DATETIME NOT NULL,
    id_sensor INT NOT NULL,

    CONSTRAINT fk_medicao_sensor
    FOREIGN KEY (id_sensor) REFERENCES sensor(id_sensor)
);