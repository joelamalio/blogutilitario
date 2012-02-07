package br.com.joelamalio.blogutilitario.segundopost;

/**
 *
 * @author joelamalio
 */
public class Util {

    public static boolean isNullOrEmpty(String valor) {
        if (valor == null) {
            return true;
        } else if (valor.isEmpty()) {
            return true;
        }
        return false;
    }
}
