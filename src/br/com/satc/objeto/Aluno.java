/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.objeto;


import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ricardo.150317
 */
public class Aluno extends Pessoa {
    private Integer matricula;
    private Date dataMatricula;
 private ArrayList<Disciplina> disciplinas  = new ArrayList<Disciplina> ();

    @Override
    public String toString() {
        return "Aluno{" + "matricula=" + matricula + ", dataMatricula=" + dataMatricula + ", disciplinas=" + disciplinas + '}';
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public Date getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(Date dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public Aluno(Integer matricula, Date dataMatricula, String nome, String rg, String cpf, Date dataNascimento) {
        super(nome, rg, cpf, dataNascimento);
        this.matricula = matricula;
        this.dataMatricula = dataMatricula;
    }

    
}
 
        
    