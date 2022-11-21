package org.example;

public class Nota
{
    int numAluno;
    double nota;

    public Nota(int numAluno, double nota) {
        this.numAluno = numAluno;
        this.nota = nota;
    }

    public int getNumAluno() {
        return numAluno;
    }

    public double getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return "Nota{" +
                "numAluno=" + numAluno +
                ", nota=" + nota +
                '}';
    }
}
