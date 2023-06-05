/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;
import java.io.BufferedReader;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
/**
 *
 * @author David Mavares
 */
public class FileUtil {
    /**
     * Escribe los elementos de una lista en un archivo de texto.
     * Cada elemento se escribe en una línea separados por una coma.
     * 
     * @param x La lista de elementos a escribir en el archivo.
     */
    
public void EscribirTxt(List x){
    String usuarios_actuales="";
    if(!x.isEmpty()){
        Nodo temp= x.first();
        for (int i=0;i<x.getSize();i++){
            usuarios_actuales += temp.getElement()+","+temp.getElement()+"\n";
            temp=temp.getNext();
        }
    }
    try{
        PrintWriter pw = new PrintWriter("test\\text.txt");
        pw.print(usuarios_actuales);
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    
}
    
}

/**
     * Lee los datos de un archivo de texto y los guarda en dos listas.
     * La primera lista contiene los usuarios y la segunda lista contiene las relaciones.
     * 
     * @param pat La ruta del archivo a leer.
     * @return Un arreglo de dos listas, donde la primera lista contiene los usuarios y la segunda lista contiene las relaciones.
     */

public List[] leer_txt(String pat){
    List x = new List();
    List p = new List();
    String line="";
    String users_txt="";
    String relations_txt="";
    String path=pat;
    File file = new File(path);
    try{
        if(!file.exists()){
            file.createNewFile();
        }else{
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            while((line = br.readLine())!= null){
                if(!line.isEmpty()){
                    if (line.contains("@")){
                    users_txt+= line + "\n";
                    }else if (line != "Usuarios" || line != "Relaciones"){
                        relations_txt+=line + "\n";
                    }
                }
            }
            
            String relations_txt_valid = relations_txt.substring(20, relations_txt.length());
            
            if (!"".equals(users_txt)){
                String[] users_split= users_txt.split("\n");
                for (int i =0; i<users_split.length; i++){
                    String[] user=users_split[i].split(", ");
                    User u= new User(user[1], Integer.parseInt(user[0]));
                    Nodo n = new Nodo(u);

                    x.addAtTheEnd(n);
                }

            }
            if (!"".equals(relations_txt)){
                String[] relations_split= relations_txt_valid.split("\n");
                for (int i =0; i<relations_split.length; i++){
                    String[] relation=relations_split[i].split(", ");
                    int[] intRelations = new int[relation.length];
                    for (int k = 0; k < intRelations.length; k++) {
                        intRelations[k] = Integer.parseInt(relation[k]);
                    }
                    p.addAtTheEndT(intRelations);


                }

            }
            br.close(); 
            JOptionPane.showMessageDialog(null, "Lectura exitosa");
        }
    }catch(Exception err){
        System.out.println(err);
        JOptionPane.showMessageDialog(null, "Hubo un error");
    }
    List[] q = {x,p};
    return q;
}
}
