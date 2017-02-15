package br.com.wma.extrato.services;

import br.com.wma.extrato.dao.LancamentoContaLegadoDAO;
import br.com.wma.extrato.model.legacy.LancamentoContaLegado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * Created by wabrile on 2/14/17.
 */
@Service
public class LancamentoContaLegadoService {

    @Autowired
    private LancamentoContaLegadoDAO lancamentoContaLegadoDAO;

    public LancamentoContaLegado obterLancamentosConta() throws IOException {
        return lancamentoContaLegadoDAO.findAll();
    }

}
