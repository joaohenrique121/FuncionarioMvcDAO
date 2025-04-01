/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Funcionarios;
import Model.FuncionariosDAO;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author 9gxbv
 */
public class FuncionariosController {
    
    
    public ArrayList<Funcionarios> readFile() throws IOException{
        FuncionariosDAO fd = new FuncionariosDAO();
        ArrayList<Funcionarios> funcionarios = fd.ler();
        return funcionarios;
    }
    
    public Funcionarios getFuncionario(int codigo) throws IOException{
        FuncionariosDAO fd = new FuncionariosDAO();
        return fd.buscar(codigo);
    }
    
    public boolean cadastrar(int codigo, String nome, double salario){
        FuncionariosDAO fd = new FuncionariosDAO();
        if(fd.grava(codigo, nome, salario)){
            return true;
        }
        return false;
    }
    
    public ArrayList<Funcionarios> list(){
        FuncionariosDAO fd = new FuncionariosDAO();
        ArrayList<Funcionarios> listaFuncionarios = fd.list();
        return listaFuncionarios;
    }
    
    public boolean salvar() throws IOException{
        FuncionariosDAO fd = new FuncionariosDAO();
        fd.salvarRegistro();
        return true;
    }
}
