package controller;

import dao.SensorDao;
import model.Sensor;
import java.util.ArrayList;

public class SensorController {
    private SensorDao sensorDAO = new SensorDao();
    public void salvar(Sensor sensor) throws Exception {
        if (sensorDAO.existeCodigo(sensor.getCodigo())) {
            throw new Exception("Já existe um sensor cadastrado com este código.");
        }
        sensorDAO.salvar(sensor);
    }
    public ArrayList<Sensor> consultar() throws Exception {
        return sensorDAO.consultar();
    }
    public ArrayList<Sensor> listarSensores() throws Exception {
        return sensorDAO.consultar();
    }
}