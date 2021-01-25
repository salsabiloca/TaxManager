/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taxmanager.ModelProgram;

/**
 *
 * @author IQBAL NOTEBOOK
 */
public class ModelProgram {

     
       
   int omzet;
    int year;
    public String output = "0";
    double sum_person;
    double sum_koperasi;
    double sum_pt;
    double sum_firma;
    double sum_perum;
    public void setOmzet(int omzet) {
        this.omzet = omzet;
    }

    public int getOmzet() {
        return omzet;
    }

    public void setYear(int year) {
        this.year = year;
    } 
    
    public int getYear() {
        return year;
    }


    public void sum_Person(double fin) {

        double sum_person = (int) (fin / 100 * omzet);
        String total = "Rp" + sum_person;
        setOutput(total);

    }

    public void sum_Koperasi(double fin) {

        double sum_koperasi = (int) (fin / 100 * omzet);
        String total = "Rp" + sum_koperasi;
        setOutput(total);

    }

    public void sum_Pt(double fin) {

        double sum_pt = (int) (fin / 100 * omzet);
        String total = "Rp" + sum_pt;
        setOutput(total);

    }
    
    public void sum_Perum(double fin){
        double sum_perum = (int) (fin / 100 * omzet);
        String total = "Rp" + sum_perum;
        setOutput(total);
    }

    public void sum_Firma(double fin){
        double sum_firma = (int) (fin / 100 * omzet);
        String total = "Rp" + sum_firma;
        setOutput(total);
    }
    public void sum_Person(int fin) {

        int sum_person = (int) (fin / 100 * omzet);
        String total = "Rp" + sum_person;
        setOutput(total);

    }

    public void sum_Koperasi(int fin) {

        int sum_koperasi = (int) (fin / 100 * omzet);
        String total = "Rp" + sum_koperasi;
        setOutput(total);

    }

    public void sum_Pt(int fin) {

        int sum_pt = (int) (fin / 100 * omzet);
        String total = "Rp" + sum_pt;
        setOutput(total);

    }
    public void sum_Perum(int fin) {

        int sum_perum = (int) (fin / 100 * omzet);
        String total = "Rp" + sum_perum;
        setOutput(total);

    }
    public void sum_Firma(int fin) {

        int sum_firma = (int) (fin / 100 * omzet);
        String total = "Rp" + sum_firma;
        setOutput(total);

    }

    public void setOutput(String output) {
        this.output = output;
    }

    public String getOutput() {
        return output;
    }

    public double calculate (double omzet){
        return omzet*1/100;
    }
    
    public double calculate (double omzet, double fin){
        return omzet*fin/100;
    }
}
