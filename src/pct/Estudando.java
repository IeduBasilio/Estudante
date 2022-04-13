/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;
import java.util.Scanner;
/**
 *
 * @author EtecMorato
 */
public class Estudando {
    
   Scanner entrada = new Scanner(System.in);

    //atributos
    private String nome;
    private int ra;
    private double segundaChamada; 
    private double primeiraChamada;
    private double frequencia;
    private char nota;
    private boolean matriculaTrancada; 
    
    //metodos
    public void exibirEstudando(){
        System.out.println("nome: " + getNome());
        System.out.println("ra: " + getRa());
        System.out.printf("frequencia: %.2f\n", getFrequencia()); 
        System.out.printf("primeiraChamada: %.2f\n", getprimeiraChamada()); 
        System.out.printf("segundaChamada %.2f\n", getsegundaChamada ()); 
        System.out.println("nota: " + getNota());
        System.out.println("matriculaTrancada: " +  isMatriculaTrancada());
         System.out.println("\n\t\t\t  --  Chamada  --  \n");
        System.out.println("Digite 1 para presente, 2 para ausente");
        
    }
    
    public void mostrarnota() {
        this.setFrequencia(this.getFrequencia() * 1.25);
        
                }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the ra
     */
    public int getRa() {
        return ra;
    }

    /**
     * @param ra the ra to set
     */
    public void setRa(int ra) {
        this.ra = ra;
    }

    /**
     * @return the frequencia
     */
    public double getFrequencia() {
        return frequencia;
    } 
    public double getprimeiraChamada() {
        return primeiraChamada; 
    } 
    public double getsegundaChamada() {
        return segundaChamada; 
    }

    /**
     * @param frequencia the frequencia to set
     */
    public void setFrequencia(double frequencia) {
        this.frequencia = frequencia;
    } 
    public void setprimeiraChamada(double primeiraChamada) {
        this.primeiraChamada = primeiraChamada;
    } 
     public void setsegundaChamada(double segundaChamada) {
        this.segundaChamada = segundaChamada;
    }

    /**
     * @return the nota
     */
    public char getNota() {
        return nota;
    }

    /**
     * @param nota the nota to set
     */
    public void setNota(char nota) {
        this.nota = nota;
    }

    /**
     * @return the matriculaTrancada
     */
    public boolean isMatriculaTrancada() {
        return matriculaTrancada;
    }

    /**
     * @param matriculaTrancada the matriculaTrancada to set
     */
    public void setMatriculaTrancada(boolean matriculaTrancada) {
        this.matriculaTrancada = matriculaTrancada;
        
        System.out.println("\n\t\t\t  --  Chamada  --  \n");
        System.out.println("Digite 1 para presente, 2 para ausente");
        if(primeiraChamada == 1){
            frequencia = 50;
                   frequencia = entrada.nextInt();

           // frequencia = .nextInt();

            System.out.println("A sua frequencia na primeira aula é " + frequencia);
        }
        
        else if(segundaChamada == 2){
        
        frequencia = 100;
            System.out.println("A sua frequencia no dia é de: " + frequencia);
    }
    }
}
 

