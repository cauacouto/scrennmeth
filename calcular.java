package scrennmeth.modelos.calculos;

import scrennmeth.modelos.titulo;

public class calcular {

    private int tempoTotal=0;


    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(titulo titulo){
       this. tempoTotal+=titulo.getDuracaoEmMinutos();
    }
}
