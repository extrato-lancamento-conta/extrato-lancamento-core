
package br.com.wma.extrato.model.legacy;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "lancamentoContaCorrenteCliente",
    "dataEfetivaLancamento",
    "dataLancamentoContaCorrenteCliente",
    "numeroEvento",
    "descricaoGrupoPagamento",
    "codigoIdentificadorUnico",
    "nomeBanco",
    "quantidadeLancamentoRemessa",
    "numeroRaizCNPJ",
    "numeroSufixoCNPJ",
    "valorLancamentoRemessa",
    "dateLancamentoContaCorrenteCliente",
    "dateEfetivaLancamento"
})
@Getter
@Setter
@ToString
public class ControleLancamento {

    @JsonProperty("lancamentoContaCorrenteCliente")
    private LancamentoContaCorrenteCliente lancamentoContaCorrenteCliente;
    @JsonProperty("dataEfetivaLancamento")
    private String dataEfetivaLancamento;
    @JsonProperty("dataLancamentoContaCorrenteCliente")
    private String dataLancamentoContaCorrenteCliente;
    @JsonProperty("numeroEvento")
    private Integer numeroEvento;
    @JsonProperty("descricaoGrupoPagamento")
    private String descricaoGrupoPagamento;
    @JsonProperty("codigoIdentificadorUnico")
    private String codigoIdentificadorUnico;
    @JsonProperty("nomeBanco")
    private String nomeBanco;
    @JsonProperty("quantidadeLancamentoRemessa")
    private Integer quantidadeLancamentoRemessa;
    @JsonProperty("numeroRaizCNPJ")
    private String numeroRaizCNPJ;
    @JsonProperty("numeroSufixoCNPJ")
    private String numeroSufixoCNPJ;
    @JsonProperty("valorLancamentoRemessa")
    private BigDecimal valorLancamentoRemessa;
    @JsonProperty("dateLancamentoContaCorrenteCliente")
    private Long dateLancamentoContaCorrenteCliente;
    @JsonProperty("dateEfetivaLancamento")
    private Long dateEfetivaLancamento;

}
