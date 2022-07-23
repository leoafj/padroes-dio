package dio_gof.facade;

import dio_gof.subsistema1_crm.CrmService;
import dio_gof.subsistema2_cep.CepApi;

public class Facade {
    
    public void migrarCliente(String nome, String cep) {
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);
        
        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
