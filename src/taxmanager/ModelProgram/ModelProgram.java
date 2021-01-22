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
