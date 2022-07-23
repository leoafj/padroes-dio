package dio_gof;

import dio_gof.facade.Facade;
import dio_gof.singleton.SingletonEager;
import dio_gof.singleton.SingletonLazy;
import dio_gof.singleton.SingletonLazyHolder;
import dio_gof.strategy.Comportamento;
import dio_gof.strategy.ComportamentoAgressivo;
import dio_gof.strategy.ComportamentoDefensivo;
import dio_gof.strategy.ComportamentoNormal;
import dio_gof.strategy.Robo;

public class Test {
    public static void main(String[] args) throws Exception {

        // Testes relacionados ao Design Pattern Singleton:

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        // Strategy

        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        // Facade

        Facade facade = new Facade();
        facade.migrarCliente("Flávio", "12345678900");
    }
}
