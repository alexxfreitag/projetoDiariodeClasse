/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diariodeclasse;

/**
 *
 * @author alex.freitag
 */
public class Aluno {
   private final String nome; 
   private final int matricula;
   private final String dataNascimento;
   
   public Aluno(String nome, int matricula, String dataNascimento){
     this.nome = nome;
     this.matricula = matricula;
     this.dataNascimento = dataNascimento;
   }  
   
   public String getNome(){
       return nome;
   }
        
   public int getMatricula(){
       return matricula;
   }
      
   public String getdataNascimento(){
       return dataNascimento;
   }
}
