/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 9gxbv
 */
public class FuncionariosDAO {
    
    private static ArrayList<Funcionarios> listaFuncionarios = new ArrayList<>();
    
    public ArrayList<Funcionarios> ler() throws IOException{
        FileReader arquivoSaida = new FileReader("src/funcionarios.txt");
        Scanner scan =  new Scanner(arquivoSaida);
        while(scan.hasNext()){
            String code = scan.nextLine();
            String nome = scan.nextLine();
            
            this.listaFuncionarios.add(new Funcionarios(Integer.parseInt(code), nome));
            
            
        }
        
    return listaFuncionarios;   
    }
    
    public Funcionarios buscar(int codigo) throws IOException{
        for(int i =0; i<listaFuncionarios.size(); i++){
            if(listaFuncionarios.get(i).getCodigo() == codigo){
                return listaFuncionarios.get(i);
            }
        }
        System.out.println("Nao encotrado");
        return null;
     
    }
    
    public boolean grava (int code, String nome){
        return listaFuncionarios.add(new Funcionarios(code, nome));
    }
    
    public ArrayList<Funcionarios> list(){
        return listaFuncionarios;
    }
    
    public boolean salvarRegistro() throws IOException{
        FileWriter archive;
        PrintWriter outPut;
        archive = new FileWriter("src/funcionarios.txt");
        outPut = new PrintWriter(archive);
        for(int i = 0; i < listaFuncionarios.size(); i++){
            outPut.println(listaFuncionarios.get(i).toString());
        }
        outPut.close();
        return true;
    }

    
    
}
