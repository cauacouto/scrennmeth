package scrennmeth.modelos;

import scrennmeth.modelos.calculos.classificavel;

public class filme extends titulo implements classificavel {

    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getclassificacao() {
        return (int) pegaMedia()/2;
    }
}

