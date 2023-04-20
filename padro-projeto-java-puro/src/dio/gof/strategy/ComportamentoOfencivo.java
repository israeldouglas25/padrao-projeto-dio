package dio.gof.strategy;

public class ComportamentoOfencivo implements Comportamento{
    @Override
    public void mover() {
        System.out.println("Movendo-se ofencivamente...");
    }
}
