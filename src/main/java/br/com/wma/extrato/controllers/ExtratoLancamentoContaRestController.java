package br.com.wma.extrato.controllers;

import br.com.wma.extrato.dtos.LancamentoContaDTO;
import br.com.wma.extrato.services.LancamentoContaService;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by wabrile on 2/14/17.
 */
@Log4j
@RestController
@RequestMapping("/v1/extrato/lancamentos")
public class ExtratoLancamentoContaRestController {

    @Autowired
    private LancamentoContaService lancamentoContaService;

    @RequestMapping(method = RequestMethod.GET)
    Collection<LancamentoContaDTO> obterLancamentos() {
        Collection<LancamentoContaDTO> lancamentoContaDTOs = Collections.EMPTY_LIST;

        try {
            lancamentoContaDTOs = lancamentoContaService.findAll();
        } catch (IOException e) {
            log.error("Erro ao buscar os lançamentos em conta.", e);
        }

        return lancamentoContaDTOs;
    }

}
