package br.com.joelamalio.blogutilitario.segundopost;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author joelamalio
 */
public class UtilTest {

    @Test
    public void testarSeAStringValorEhNulaEORetornoEhTrue() {
        String valor = null;
        boolean retorno = Util.isNullOrEmpty(valor);
        Assert.assertTrue(retorno);
    }

    @Test
    public void testarSeAStringValorEhVaziaEORetornoEhTrue() {
        String valor = "";
        boolean retorno = Util.isNullOrEmpty(valor);
        Assert.assertTrue(retorno);
    }

    @Test
    public void testarSeAStringValorNaoEhVaziaEORetornoEhFalse() {
        String valor = "@joelamalio";
        boolean retorno = Util.isNullOrEmpty(valor);
        Assert.assertFalse(retorno);
    }
}
