package controller;
import dao.MedicaoDao;
import model.Medicao;


public class MedicaoController {
    private MedicaoDao medicaoDao = new MedicaoDao();
    public MedicaoController(MedicaoDao medicaoDao){

        if(medicaoDao == null){
            System.out.println("Já existe ");
        }

    }
}
