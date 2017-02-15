
package br.com.wma.extrato.model.legacy;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "quantidadeLancamentos",
    "quantidadeRemessas",
    "valorLancamentos"
})
@Getter
@Setter
public class TotalControleLancamento {

    @JsonProperty("quantidadeLancamentos")
    private Integer quantidadeLancamentos;
    @JsonProperty("quantidadeRemessas")
    private Integer quantidadeRemessas;
    @JsonProperty("valorLancamentos")
    private BigDecimal valorLancamentos;

}
