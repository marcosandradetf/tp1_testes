package br.edu.infnet;

import br.edu.infnet.testes.model.Esporte;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<Esporte> craques = new ArrayList<>();
    public static List<Esporte> comuns = new ArrayList<>();

    public static void main(String[] args) {
        criarJogadorCraque();
        criarJogadorComum();

        for (Esporte craque : craques) {
            System.out.println(craque.toString());
        }

        for (Esporte comum : comuns) {
            System.out.println(comum.toString());
        }


    }

    public static void criarJogadorCraque() {
        Esporte neymar = jogadorCraque("Neymar Júnior","Atacante",true,10,2500);
        Esporte bellingham = jogadorCraque("Bellingham","Meio-campo",true,5,2000);
        craques.add(neymar);
        craques.add(bellingham);
    }

    public static void criarJogadorComum() {
        Esporte richarlison = jogadorComum("Richarlison","Atacante", 9, 1000);
        Esporte maguire = jogadorComum("Maguire","Zagueiro", 4, 2200);
        comuns.add(richarlison);
        comuns.add(maguire);
    }



    public static Esporte jogadorCraque(String nome, String posicao, boolean craque, int camisa, float salario) {
        return new Esporte(nome, posicao, craque, camisa, salario);
    }

    public static Esporte jogadorComum(String nome, String posicao, int camisa, float salario) {
        return new Esporte(nome, posicao, camisa, salario);
    }
}