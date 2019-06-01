/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VeV;

/**
 *
 * @author gabrielsbu
 */
public class Veri {
    public static void main (String args[]){
        
        
    }
    
    public boolean verificarNomeDoFuncionario(String nome) {
          String g;
          g = "([@%!$%]{1}[A-Z[a-z]{10}[0-9])";
          return nome.matches(g);

    }
    
   

    public boolean validarSenhaGeral(String nome) {
          String g;
          g = "([A-Z]{1}[a-z][0-9][!@#$]{1})";
          return nome.matches(g);

    }
    public boolean validarCPFComNumero(String nome) {
          String g;
          g = "([0-9]{11})";
          return nome.matches(g);

    }
    public boolean validarRGComNumero(String nome) {
          String g;
          g = "([0-9]{13})";
          return nome.matches(g);

    }
    
    
}
