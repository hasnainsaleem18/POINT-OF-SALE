/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POS;

import model.model1;
import controlllor.controllor;
import view.loginView;

public class main {
    public static void main(String[] args) {
        model1 m = new model1();
        loginView v = new loginView();
        controllor c = new controllor(v, m);
        
    }
}
