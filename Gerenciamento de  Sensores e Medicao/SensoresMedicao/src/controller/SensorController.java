package controller;

import dao.SensorDao;
import model.Sensor;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class SensorController {

    private SensorDao sensorDao;

    public SensorController() {
        sensorDao = new SensorDao();
    }

    public void cadastrarSensor(Sensor sensor) {

        if (sensor.getCodigo() == null || sensor.getCodigo().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O campo Código é obrigatório.");
            return;
        }

        if (sensor.getTipo() == null || sensor.getTipo().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O campo Tipo é obrigatório.");
            return;
        }

        if (sensor.getLocalizacao() == null || sensor.getLocalizacao().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O campo Localização é obrigatório.");
            return;
        }

        sensorDao.cadastrar(sensor);
    }

    public ArrayList<Sensor> listarSensores() {
        return sensorDao.listar();
    }

    public Sensor buscarSensorPorId(int id) {

        if (id <= 0) {
            JOptionPane.showMessageDialog(null, "ID inválido.");
            return null;
        }

        return sensorDao.buscarPorId(id);
    }

    public void atualizarSensor(Sensor sensor) {

        if (sensor.getId() <= 0) {
            JOptionPane.showMessageDialog(null, "Selecione um sensor para atualizar.");
            return;
        }

        if (sensor.getCodigo() == null || sensor.getCodigo().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O campo Código é obrigatório.");
            return;
        }

        if (sensor.getTipo() == null || sensor.getTipo().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O campo Tipo é obrigatório.");
            return;
        }

        if (sensor.getLocalizacao() == null || sensor.getLocalizacao().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O campo Localização é obrigatório.");
            return;
        }

        sensorDao.atualizar(sensor);
    }

    public void excluirSensor(int id) {

        if (id <= 0) {
            JOptionPane.showMessageDialog(null, "Selecione um sensor para excluir.");
            return;
        }

        sensorDao.excluir(id);
    }
}