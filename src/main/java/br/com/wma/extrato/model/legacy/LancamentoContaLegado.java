
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
    "totalControleLancamento",
    "listaControleLancamento"
})
@Getter
@Setter
@ToString
public class LancamentoContaLegado {

    @JsonProperty("totalControleLancamento")
    private TotalControleLancamento totalControleLancamento;
    @JsonProperty("listaControleLancamento")
    private List<ControleLancamento> listaControleLancamento = Collections.emptyList();

}
