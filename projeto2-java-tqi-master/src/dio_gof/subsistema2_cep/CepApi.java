package dio_gof.subsistema2_cep;

public class CepApi {
    
    private static CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstancia() {
        return instancia;
    }

    public String recuperarCidade(String cep) {
        return "Uberlândia";
    }

    public String recuperarEstado(String cep) {
        return "MG";
    }
}
