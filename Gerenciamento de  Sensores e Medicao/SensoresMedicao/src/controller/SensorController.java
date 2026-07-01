package controller;

import dao.SensorDao;

public class SensorController {
    public SensorController(SensorDao sensorDao) {

        if(sensorDao == null){
            System.out.println("Já existe um sensorDao cadastrado com esse código. ");
        }

    }
}

