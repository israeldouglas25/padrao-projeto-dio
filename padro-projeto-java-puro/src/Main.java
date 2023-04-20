import dio.gof.facade.Facade;
import dio.gof.strategy.*;

public class Main {
    public static void main(String[] args) {

//        Testes relacionados ao Design Pattern Singleton
//        SingletonLazy lazy = SingletonLazy.getInstance();
//        System.out.println(lazy);
//        lazy = SingletonLazy.getInstance();
//        System.out.println(lazy);
//
//        SingletonEager eager = SingletonEager.getInstance();
//        System.out.println(eager);
//        eager = SingletonEager.getInstance();
//        System.out.println(eager);
//
//        SingletonLazyHolder holder = SingletonLazyHolder.getInstance();
//        System.out.println(holder);
//        holder = SingletonLazyHolder.getInstance();
//        System.out.println(holder);


//        Testes relacionados ao Design Pattern Strategy

//        Comportamento normal = new ComportamentoNormal();
//        Comportamento ofencivo = new ComportamentoOfencivo();
//        Comportamento defensivo = new ComportamentoDefensivo();
//
//        Robo robo = new Robo();
//        robo.setComportamento(normal);
//        robo.mover();
//        robo.mover();
//        robo.mover();
//
//        robo.setComportamento(defensivo);
//        robo.mover();
//
//        robo.setComportamento(ofencivo);
//        robo.mover();
//        robo.mover();
//        robo.mover();
//        robo.mover();


//        Testes relacionados ao Design Pattern Facade
        Facade facade = new Facade();
        facade.migrarCliente("Israel Douglas", "53,437-280");

    }
}