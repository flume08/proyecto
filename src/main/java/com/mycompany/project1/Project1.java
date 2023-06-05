/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.project1;
import classes.*;
import GUI.Principal;
/**
 *
 * @author carre
 */
public class Project1 {

    public static void main(String[] args) {
        
        
        Principal startingWindow = new Principal();
        startingWindow.setVisible(true);
        List x = new List();
        
        x.addAtTheEndT(Principal.globalUsersList);
        x.addAtTheEndT(Principal.globalRelationsList);
        FileUtil fileUtil = new FileUtil();
        fileUtil.EscribirTxt(x);
    }
}
