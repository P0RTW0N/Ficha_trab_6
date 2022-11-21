package org.example;

import java.util.ArrayList;

public class Uc
{
    String nomeUC;
    ArrayList <Nota> notas ;
    int totalAlunos;

    public Uc(String nomeUC)
    {
        this.nomeUC = nomeUC;
        notas = new ArrayList<>();

    }

    public String getNomeUC() {
        return nomeUC;
    }

    public ArrayList<Nota> getNotas() {
        return notas;
    }

    public int getTotalAlunos() {
        return totalAlunos;
    }


    /**
     * Método utilizado para adicionar valores no ArrayList
     */
    public void adicionarTeste()
    {
        Nota a = new Nota(1,20);
        Nota b = new Nota(2,18);
        Nota c = new Nota(4,2);
        Nota d = new Nota(5,20);

        notas.add(a);
        notas.add(b);
        notas.add(c);
        notas.add(d);
    }

    /**
     *
     * @param numAluno
     * @param nota
     *
     */
    public boolean insereNotaUC(int numAluno, double nota) //Assumindo que o aluno só pode ter 1 nota
    {
        adicionarTeste();
        Nota n = new Nota(numAluno,nota);
        for(int i=0;i<notas.size();i++)
        {
            if(notas.get(i).getNumAluno() == numAluno) //Se o aluno ja foi adicionado
            {
                System.out.println("Aluno ja existente");
                return false;
            }
        }
        if(nota <0 || nota>20)
        {
            System.out.println("Valor não possivel para a nota");
            return false;
        }
        notas.add(n);
        System.out.println("Nota inserida");
        return true;
    }

    /**
     *
     * @param numAluno
     * @return
     */
    public double pesquisaAluno(int numAluno)
    {
        adicionarTeste();
        for(int i=0;i<notas.size();i++)
        {
            if(numAluno == notas.get(i).getNumAluno())
            {
                System.out.println(numAluno + " encontrado com nota: "+ notas.get(i).getNota());
                return notas.get(i).getNota();
            }

        }
        System.out.println(numAluno + " não encontrado");
        return -1;
    }

    /**
     *
     * @return
     */
    public double media()
    {
        adicionarTeste();
        double soma = 0;
        double media = 0;
        if(notas.size() == 0)
        {
            System.out.println("Media = 0");
            return 0;
        }else
        {
            for(int i=0;i<notas.size();i++)
            {
                soma = soma + notas.get(i).getNota();
            }
            media = soma / notas.size();
        }
        return media;
    }

    /**
     *
     * @param numAluno
     * @return
     */
    public boolean aprovado(int numAluno)
    {
        adicionarTeste();
        double nota = 0;
        for(int i=0;i<notas.size();i++)
        {
            if(numAluno == notas.get(i).getNumAluno())
            {
                nota = notas.get(i).getNota();
                if(nota >= 9.5)
                {
                    System.out.println("Aprovado");
                    return true;
                }
                System.out.println("Não Aprovado");
                return false;
            }
        }
        System.out.println("Aluno não encontrado no sistema");
        return false;
    }



}
