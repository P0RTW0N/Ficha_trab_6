package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UcTest {
    Uc u;

    /**
     * Metodo realizado antes de cada teste para evitar repetições
     */
    @BeforeEach
    public void before()
    {
        u = new Uc("QualidadeSoftware");
    }


    /**
     *Teste para verificar se a inserçao de alunos com a respetiva nota funciona corretamente
     * @param num
     * @param nota
     */
    @ParameterizedTest
    @CsvSource(value = {"1,20", "222,10", "333,150", "444,-16","4,20"})
    void testInsereNotaUC(int num,double nota)
    {
        boolean metodo = u.insereNotaUC(num,nota);
        assertEquals(true,metodo,"erro!");
    }

    /**
     *Teste para verificar se os alunos pesquisados retornam a respetiva nota
     * @param alunos
     * @param values
     */
    @ParameterizedTest
    @CsvSource(value = {"1,20","2,18","3,15","4,2","5,20"})
    public void testPesquisaAluno(int alunos,int values) //perguntar stora como obter nota
    {
        double metodo = u.pesquisaAluno(alunos);
        assertEquals(values,metodo,"erro!");
    }

    /**
     *Teste para verificar se o metodo media() funciona corretamente
     */
    @Test
    void testMedia() //falta fzr
    {
        double media = (20+18+2+20)/4;
        double metodo = u.media();
        assertEquals(media,metodo,"erro!");
    }

    /**
     *Teste para verificar se um aluno foi aprovado ou não corretamente
     * @param values
     */
    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4,5,6})
    void testAprovado(int values)
    {
        boolean metodo = u.aprovado(values);
        assertEquals(true,metodo,"erro!");
    }
}