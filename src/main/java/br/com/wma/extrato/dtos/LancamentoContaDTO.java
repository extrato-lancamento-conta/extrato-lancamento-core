package br.com.wma.extrato.dtos;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * Created by wabrile on 2/14/17.
 */
@Getter
@Setter
public class LancamentoContaDTO {

    private String dataEfetivaLancamento;
    private String lancamentoNomeTipoOperacao;
    private Long lancamentoNumeroRemessaBanco;
    private String lancamentoNomeSituacaoRemessa;
    private String dataLancamentoContaCorrenteCliente;
    private String nomeBanco;
    private String lancamentoDadosNumeroAgencia;
    private String lancamentoDadosNumeroContaCorrente;
    private BigDecimal valorLancamentoRemessa;

}
