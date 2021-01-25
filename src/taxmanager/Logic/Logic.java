/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taxmanager.Logic;
import taxmanager.Logic.Calculation;
import taxmanager.ModelProgram.ModelProgram;
/**
 *
 * @author IQBAL NOTEBOOK
 */
public class Logic {
    public double fin;

    
    public String sum_Person (ModelProgram modelprogram){
            if (modelprogram.getYear() < 5)
            {
            ModelProgram cac = new Calculation();
            double sum_person = cac.calculate(modelprogram.getOmzet(), fin);
            String total = "Rp" + sum_person;
            return total;
            }
            else
            {
            ModelProgram cac = new Calculation();
            double sum_person = cac.calculate(modelprogram.getOmzet(),1);
            String total = "Rp" + sum_person;
            return total;
            }

    }
    
    public String sum_Koperasi (ModelProgram modelprogram){
            if (modelprogram.getYear() < 5)
            {
            ModelProgram cac = new Calculation();
            double sum_koperasi = cac.calculate(modelprogram.getOmzet(), fin);
            String total = "Rp" + sum_koperasi;
            return total;  
            }
            else 
            {
            ModelProgram cac = new Calculation();
            double sum_koperasi = cac.calculate(modelprogram.getOmzet(),1);
            String total = "Rp" + sum_koperasi;
            return total;
            }


    }
    
    public String sum_Pt (ModelProgram modelprogram){
            if (modelprogram.getYear() < 6)
            {
            ModelProgram cac = new Calculation();
            double sum_pt = cac.calculate(modelprogram.getOmzet(), fin);
            String total = "Rp" + sum_pt;
            return total;
            }
            else
            {
            ModelProgram cac = new Calculation();
            double sum_pt = cac.calculate(modelprogram.getOmzet(),1);
            String total = "Rp" + sum_pt;
            return total;
            }

    }

     public String sum_Perum (ModelProgram modelprogram){
            if (modelprogram.getYear() < 6)
            {
            ModelProgram cac = new Calculation();
            double sum_perum = cac.calculate(modelprogram.getOmzet(), fin);
            String total = "Rp" + sum_perum;
            return total;
            }
            else
            {
            ModelProgram cac = new Calculation();
            double sum_perum = cac.calculate(modelprogram.getOmzet(),1);
            String total = "Rp" + sum_perum;
            return total;
            }

    }
    public String sum_Firma (ModelProgram modelprogram){
            if (modelprogram.getYear() < 7)
            {
            ModelProgram cac = new Calculation();
            double sum_firma = cac.calculate(modelprogram.getOmzet(), fin);
            String total = "Rp" + sum_firma;
            return total;
            }
            else
            {
            ModelProgram cac = new Calculation();
            double sum_firma = cac.calculate(modelprogram.getOmzet(),1);
            String total = "Rp" + sum_firma;
            return total;
            }

    }

}
