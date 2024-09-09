/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diegodesouzaado1.newpackage;

/**
 *
 * @author YNGBX
 */
public class dugongo {
    
     //atributos
    private String nome;
    private int idade;
    private boolean macho; 
    private boolean femea;
    private boolean nadador; 
    private double velocidadeNado;
    
    //construtor vazio
    public dugongo() {
        this.nome = "Dugongo";
        this.idade = 0;
        this.macho = true;
        this.femea = false;
        this.nadador = false;
        this.velocidadeNado = 0;
    }

    //construtor que recebe parâmetro
    public dugongo(String nome, int idade, boolean macho, boolean femea, boolean nadador, double velocidadeNado) {
        this.nome = nome;
        this.idade = idade;
        this.macho = macho;
        this.femea = femea;
        this.nadador = nadador;
        this.velocidadeNado = velocidadeNado;
    }
  
     // Métodos getter e setter
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isMacho() {
        return macho;
    }

    public void setMacho(boolean macho) {
        this.macho = macho;
        
    }
    
    public boolean isFemea() {
        return femea;
    }

    public void setFemea(boolean femea) {
        this.femea = femea;
        
    }

    public boolean isNadador() {
        return nadador;
    }

    public void setNadador(boolean nadador) {
        this.nadador = nadador;
    }

    public double getVelocidadeNado() {
        return velocidadeNado;
    }

    public void setVelocidadeNado(double velocidadeNado) {
        this.velocidadeNado = velocidadeNado;
    }

    // Métodos
    public void nadar(double rapidez) {
        if (nadador) {
            System.out.println("\n" + nome + " está nadando a uma velocidade de " + rapidez + " km/h.");
        } else {
            System.out.println(nome + " não sabe nadar.");
        }
        
    }

    public void comerAlgas() {
        if (nadador) {
            System.out.println(nome + " enquanto nada ele está comendo algas.");
        } else {
            System.out.println(nome + " ainda está aprendendo a nadar, portanto não consegue comer.\n");
        }
    }
    public void vocalizar() {
        System.out.println(nome + " faz sons para se comunicar com outros Dugongos.");
    }

 }

