package br.com.wma.extrato.services;

import br.com.wma.extrato.dtos.LancamentoContaDTO;
import br.com.wma.extrato.model.legacy.LancamentoContaLegado;
import lombok.extern.log4j.Log4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by wabrile on 2/14/17.
 */
@Log4j
@Service
public class LancamentoContaService {

    private final ModelMapper modelMapper = new ModelMapper();

    @Autowired
    private LancamentoContaLegadoService lancamentoContaLegadoService;

    public Collection<LancamentoContaDTO> findAll() throws IOException {
        Collection<LancamentoContaDTO> lancamentoContaDTOs = new ArrayList<>();

        final LancamentoContaLegado lancamentoContaLegado = lancamentoContaLegadoService.obterLancamentosConta();

        log.debug("lancamentoContaLegado: " + lancamentoContaLegado.toString());

        lancamentoContaLegado.getListaControleLancamento().forEach(
                c -> lancamentoContaDTOs.add(modelMapper.map(c, LancamentoContaDTO.class)));

        return lancamentoContaDTOs;
    }

}
