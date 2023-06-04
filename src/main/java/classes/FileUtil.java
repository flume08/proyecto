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
    
public void EscribirTxt(UserList x){
    String usuarios_actuales="";
    if(!x.isEmpty()){
        NodoUser temp= x.first();
        for (int i=0;i<x.size;i++){
            usuarios_actuales += temp.getElement().getUsername()+","+temp.getElement().getNumberOfRelation()+"\n";
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

public void leer_txt(){
    UserList x = new UserList();
    String line="";
    String users_txt="";
    String relations_txt="";
    String path="test\\text.txt";
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
                }else{
                        relations_txt=line +"\n";
                    }
                }
            }
            if (!"".equals(users_txt)){
                String[] users_split= users_txt.split("\n");
                for (int i =0; i<users_split.length; i++){
                    String[] user=users_split[i].split(",");
                    User u= new User(user[0], Integer.parseInt(user[i]));
                    NodoUser n = new NodoUser(u);
                    
                    x.addAtTheEnd(n);
                }
                
            }
            if (!"".equals(relations_txt)){
                String[] relations_split= relations_txt.split("\n");
                for (int i =0; i<relations_split.length; i++){
                    String[] relation=relations_split[i].split(",");
                    
                    
                }
                
            }
            br.close(); 
            JOptionPane.showMessageDialog(null, "Lectura exitosa");
        }
    }catch(Exception err){
        JOptionPane.showMessageDialog(null, "Hubo un error");
    }
}
}
