package scrennmeth.modelos;

import scrennmeth.modelos.calculos.calcular;
import scrennmeth.modelos.calculos.epsodios;
import scrennmeth.modelos.calculos.filtrorecomendação;

public class pricipal {
    public static void main(String[] args) {

        filme filme1=new filme();

        filme1.setNome("avatar");
        filme1.setAnoDeLancamento(2023);
        filme1.setDuracaoEmMinutos(180);
        filme1.exibeFichaTecnica();

        filme filme2=new filme();

        filme2.setNome("aventuras de pi");
        filme2.setAnoDeLancamento(2018);
        filme2.setDuracaoEmMinutos(180);
        filme2.exibeFichaTecnica();


        series lost =new series();

        lost.setNome("outher bancks");
        lost.setAnoDeLancamento(2023);
        lost.setEpisodiosPorTemporadas(5);
        lost.setTemporada(5);
        lost.setMinutosPorEpsodios(45);
        lost.exibeFichaTecnica();


        calcular calcular1 =new calcular();

        calcular1.inclui(filme1);
        calcular1.inclui(filme2);
        System.out.println(calcular1.getTempoTotal());





        filtrorecomendação filtro=new filtrorecomendação();

        filtro.filtro(filme1);




        epsodios epsodio1 =new epsodios();

        epsodio1.setMumerosDeEpsodios(4);
        epsodio1.setTotalDeVisualizaçao(100);
        epsodio1.setSeries(lost);
        filtro.filtro(epsodio1);
    }





}



