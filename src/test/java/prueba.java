
import com.cajablanca.editor.Editor;
import com.cajablanca.grafo.Arco;
import com.cajablanca.grafo.Grafo;
import com.cajanegra.AbstractSingleLinkedListImpl;
//import org.junit.Test;
import com.cajanegra.EmptyCollectionException;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//import org.junit.jupiter.*;
import static org.junit.Assert.*;
//import static org.junit.jupiter.api.Assertions.assertEquals;

//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.CsvSource;


public class prueba {
    //EDITOR4 Palabra más larga
// Test case 1 Hemos añadido un throw exception que faltaba ya que la funcion debe lanzar una excepcion segun pone en
    // la cabecera
    @Test
    public void pruebasPalabraMasLarga1(){
        Assertions.assertThrows(EmptyCollectionException.class, () -> {
            Editor editor = new Editor();
            editor.palabraMasLarga();
        });
    }
    //Test case 2?? parece que funciona , es duda
//aqui le pasamos un fichero con una linea solo, cuyo string es vacio
    @Test
    public void pruebasPalabraMasLarga2() throws EmptyCollectionException
    {
        Editor editor = new Editor();
        String FICHERO = "src\\test\\java\\f1.txt";
        editor.cargarEditor(FICHERO);
        editor.palabraMasLarga();
    }
    // Test case 3
    @Test
    public void pruebasPalabraMasLarga3() throws EmptyCollectionException
    {
        Editor editor = new Editor();
        String FICHERO = "src\\test\\java\\f1.txt";
        editor.cargarEditor(FICHERO);
        assertEquals("esternocleidomastoideo",editor.palabraMasLarga());
    }
    // Test case 4
    @Test
    public void pruebasPalabraMasLarga4() throws EmptyCollectionException
    {
        Editor editor = new Editor();
        String FICHERO = "src\\test\\java\\f3.txt";
        editor.cargarEditor(FICHERO);
        assertEquals("esternocleidomastoideo",editor.palabraMasLarga());
    }

}
