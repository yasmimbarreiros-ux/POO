package controller;
import dao.MedicaoDao;
import dao.MedicaoDao;
import model.Medicao;
import java.util.ArrayList;

public class MedicaoController {
    private MedicaoDao medicaoDAO = new MedicaoDao();
    public void salvar(Medicao medicao) throws Exception {
        if (medicao.getSensor() == null || medicao.getSensor().getId() <= 0) {
            throw new Exception("Selecione um sensor válido para a medição.");
        }
        medicaoDAO.salvar(medicao);
    }
    public ArrayList<Medicao> consultar() throws Exception {
        return medicaoDAO.consultar();
    }
}