/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class Pessoas {
    private String nome;
    private String sexo;
    private int idade;
    private int meses;
    
    public Pessoas(String nome, String sexo, int idade, int meses){
        nome = "";
        sexo = "";
        idade = 0;
        meses = 0;
    }
     //Get/Set nome
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    //Get/Set sexo
    public String getSexo(){
        return this.sexo;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
     //Get/Set idade
    public Integer getIdade(){
        return this.idade;
    }
    public void setIdade(Integer idade){
        this.idade = idade;
    }
    //Get/Set meses
    public Integer getMeses(){
        return this.meses;
    }
    public void setMeses(Integer meses){
        this.meses = meses;
    }
    
    public int calcularMeses(){
        meses = idade *12;
        return meses;
    }
}
