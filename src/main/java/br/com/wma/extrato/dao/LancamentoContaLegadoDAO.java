package br.com.wma.extrato.dao;

import br.com.wma.extrato.model.legacy.LancamentoContaLegado;
import com.google.gson.Gson;
import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * Created by wabrile on 2/15/17.
 */
@Component
public class LancamentoContaLegadoDAO {

    private final Gson gson = new Gson();

    public LancamentoContaLegado findAll() throws IOException {
        ClassLoader classLoader = getClass().getClassLoader();

        String json = IOUtils.toString(classLoader.getResourceAsStream("lancamento-conta-legado.json"), "utf-8");

        return gson.fromJson(json, LancamentoContaLegado.class);
    }

}
