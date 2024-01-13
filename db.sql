CREATE DATABASE eco_tracker_db;
USE eco_tracker_db;

CREATE TABLE carbon_footprint (
    id INT PRIMARY KEY AUTO_INCREMENT,
    user_id INT NOT NULL,
    emissionFactorCar DOUBLE NOT NULL,
    emissionFactorBike DOUBLE NOT NULL
    emissionFactorPublicTransport NOT NULL
    emissionFactorElectricity DOUBLE NOT NULL
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

