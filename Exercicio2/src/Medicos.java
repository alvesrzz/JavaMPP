/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class Medicos {
    private String nome;
    private double valorConsulta;
    private int qtdeConsulta;
    private double salario;
    
    public Medicos(String nome, double valorConsulta, int qtdeConsulta, double salario){
        nome = "";
        valorConsulta = 0;
        qtdeConsulta = 0;
        salario = 0;
    }
    //Get/Set nome
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    //Get/Set Valor Consulta
    public double getValorConsulta(){
        return this.valorConsulta;
    }
    public void setSexo(double valorConsulta){
        this.valorConsulta = valorConsulta;
    }
     //Get/Set Qtde Consulta
    public Integer getQtdeConsulta(){
        return this.qtdeConsulta;
    }
    public void setIdade(Integer qtdeConsulta){
        this.qtdeConsulta = qtdeConsulta;
    }
    //Get/Set salario
    public double getSalario(){
        return this.salario;
    }
    public void setMeses(double salario){
        this.salario = salario;
    }
}
