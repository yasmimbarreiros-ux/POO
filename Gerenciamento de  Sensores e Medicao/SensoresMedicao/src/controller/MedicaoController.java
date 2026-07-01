package controller;

import dao.MedicaoDao;
import model.Medicao;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class MedicaoController {

    private MedicaoDao medicaoDao;

    public MedicaoController() {
        medicaoDao = new MedicaoDao();
    }

    public void cadastrarMedicao(Medicao medicao) {

        if (medicao == null) {
            JOptionPane.showMessageDialog(null, "Medição inválida.");
            return;
        }

        if (medicao.getValor() <= 0) {
            JOptionPane.showMessageDialog(null, "O valor da medição deve ser maior que zero.");
            return;
        }

        if (medicao.getUnidade() == null || medicao.getUnidade().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O campo Unidade é obrigatório.");
            return;
        }

        if (medicao.getDataHora() == null || medicao.getDataHora().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O campo Data/Hora é obrigatório.");
            return;
        }

        if (medicao.getSensor() == null || medicao.getSensor().getId() <= 0) {
            JOptionPane.showMessageDialog(null, "Selecione um sensor.");
            return;
        }

        medicaoDao.cadastrar(medicao);
    }

    public ArrayList<Medicao> listarMedicoes() {
        return medicaoDao.listar();
    }

    public void atualizarMedicao(Medicao medicao) {

        if (medicao == null) {
            JOptionPane.showMessageDialog(null, "Medição inválida.");
            return;
        }

        if (medicao.getId() <= 0) {
            JOptionPane.showMessageDialog(null, "Selecione uma medição para atualizar.");
            return;
        }

        if (medicao.getValor() <= 0) {
            JOptionPane.showMessageDialog(null, "O valor da medição deve ser maior que zero.");
            return;
        }

        if (medicao.getUnidade() == null || medicao.getUnidade().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O campo Unidade é obrigatório.");
            return;
        }

        if (medicao.getDataHora() == null || medicao.getDataHora().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O campo Data/Hora é obrigatório.");
            return;
        }

        if (medicao.getSensor() == null || medicao.getSensor().getId() <= 0) {
            JOptionPane.showMessageDialog(null, "Selecione um sensor.");
            return;
        }

        medicaoDao.atualizar(medicao);
    }

    public void excluirMedicao(int id) {

        if (id <= 0) {
            JOptionPane.showMessageDialog(null, "Selecione uma medição para excluir.");
            return;
        }

        medicaoDao.excluir(id);
    }

    // Métodos extras para evitar erro caso sua TelaMedicao use nomes mais simples

    public void cadastrar(Medicao medicao) {
        cadastrarMedicao(medicao);
    }

    public ArrayList<Medicao> listar() {
        return listarMedicoes();
    }

    public void atualizar(Medicao medicao) {
        atualizarMedicao(medicao);
    }

    public void excluir(int id) {
        excluirMedicao(id);
    }
}