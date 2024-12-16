package scrennmeth.modelos.calculos;

public class filtrorecomendação {


    public void filtro(classificavel classificavel) {
        if (classificavel.getclassificacao() >= 4) {
            System.out.println("esta entre os preferidos no momento ");
        } else if (classificavel.getclassificacao() >= 2) {
            System.out.println("esta bem avaliado no momento ");
        }else{
            System.out.println("coloque na lista para assistir depois");
        }

    }
}