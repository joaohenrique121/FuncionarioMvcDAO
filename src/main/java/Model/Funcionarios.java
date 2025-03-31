/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Objects;

/**
 *
 * @author 9gxbv
 */
public class Funcionarios {
    private int codigo;
    private String nome;

    public Funcionarios(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return codigo + "\n" + nome;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + this.codigo;
        hash = 29 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Funcionarios other = (Funcionarios) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return Objects.equals(this.nome, other.nome);
    }
    
    
}
