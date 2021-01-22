/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taxmanager.Logic;
import taxmanager.ModelProgram.ModelProgram;
/**
 *
 * @author IQBAL NOTEBOOK
 */
public class Calculation extends ModelProgram {
    ModelProgram modelprogram = new ModelProgram();

            public double calculate (double omzet){
                return omzet*1/100;
            }
            public double calculate (double omzet, double fin){
                return omzet*fin/100;
            }
    
}
