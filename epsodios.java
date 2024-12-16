package scrennmeth.modelos.calculos;


import scrennmeth.modelos.series;

public class epsodios  implements classificavel{

    private int mumerosDeEpsodios;
    private String nome;
    private int totalDeVisualizaçao;
      private series Series;
    public int getTotalDeVisualizaçao() {
        return totalDeVisualizaçao;
    }

    public void setTotalDeVisualizaçao(int totalDeVisualizaçao) {
        this.totalDeVisualizaçao = totalDeVisualizaçao;
    }

    public int getMumerosDeEpsodios() {
        return mumerosDeEpsodios;
    }

    public void setMumerosDeEpsodios(int mumerosDeEpsodios) {
        this.mumerosDeEpsodios = mumerosDeEpsodios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public series getSeries() {
        return Series;
    }

    public void setSeries(series series) {
        Series = series;
    }

    @Override
    public int getclassificacao() {
        if (totalDeVisualizaçao>100){
            return 4;
        }else{
            return 2;
        }

    }


}

