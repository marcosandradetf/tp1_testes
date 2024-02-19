package br.edu.infnet.testes;

import br.edu.infnet.Main;
import br.edu.infnet.testes.model.Esporte;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Testes {
    @Test
    void testCriarJogadorCraque() {
        // Chama o método de criação
        Main.criarJogadorCraque();

        // Verifica se a lista craques foi preenchida corretamente
        assertEquals(2, Main.craques.size()); // Ajuste conforme necessário
    }

    @Test
    void testCriarJogadorComum() {
        // Chama o método de criação
        Main.criarJogadorComum();

        // Verifica se a lista comuns foi preenchida corretamente
        assertEquals(2, Main.comuns.size()); // Ajuste conforme necessário
    }



    @Test
    void jogadorCraque(){
        for (Esporte craque : Main.craques) {
            assertTrue(craque.isCraque());
            assertNotNull(craque.getNome());
            assertNotEquals(0, craque.getCamisa());
            assertNotNull(craque.getPosicao());
            assertNotEquals(0, craque.getSalario());
            // salario craque
            assertEquals(craque.getSalario() + 1000, craque.calcularSalario());
        }
    }

    @Test
    void jogadorComum() {
        for(Esporte comum : Main.comuns) {
            assertFalse(comum.isCraque());
            assertNotNull(comum.getNome());
            assertNotEquals(0, comum.getCamisa());
            assertNotNull(comum.getPosicao());
            assertNotEquals(0, comum.getSalario());
            // salario comum
            assertEquals(comum.getSalario(), comum.calcularSalario());
        }
    }
}
