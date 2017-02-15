
package br.com.wma.extrato.model.legacy;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "codigoBanco",
    "numeroAgencia",
    "numeroContaCorrente"
})
@Getter
@Setter
@ToString
public class DadosDomicilioBancario {

    @JsonProperty("codigoBanco")
    private Integer codigoBanco;
    @JsonProperty("numeroAgencia")
    private Integer numeroAgencia;
    @JsonProperty("numeroContaCorrente")
    private String numeroContaCorrente;

}
