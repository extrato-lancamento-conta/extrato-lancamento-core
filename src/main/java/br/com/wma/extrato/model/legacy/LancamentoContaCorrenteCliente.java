
package br.com.wma.extrato.model.legacy;

import java.util.Collections;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "numeroRemessaBanco",
    "nomeSituacaoRemessa",
    "dadosDomicilioBancario",
    "nomeTipoOperacao",
    "dadosAnaliticoLancamentoFinanceiroCliente"
})
@Getter
@Setter
@ToString
public class LancamentoContaCorrenteCliente {

    @JsonProperty("numeroRemessaBanco")
    private Long numeroRemessaBanco;
    @JsonProperty("nomeSituacaoRemessa")
    private String nomeSituacaoRemessa;
    @JsonProperty("dadosDomicilioBancario")
    private DadosDomicilioBancario dadosDomicilioBancario;
    @JsonProperty("nomeTipoOperacao")
    private String nomeTipoOperacao;
    @JsonProperty("dadosAnaliticoLancamentoFinanceiroCliente")
    private List<String> dadosAnaliticoLancamentoFinanceiroCliente = Collections.emptyList();

}
