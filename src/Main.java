public class Main {
    public static void main(String[] args) {

        /*
        *
        *  Cuando se declara e inicializa una variable con "var",
        *  el compilador decide el tipo de dato.
        *
        *  Hay que tener cuidado orque a veces puede fallar.
        *
        *
        */

        // PASO POR VALOR: Copia los valores e invoco a la función (Duplica el consumo de memoria).
        int param1 = 10;
        int param2 = 30;

        var valor = suma(param1, param2);
        System.out.println(valor);
        System.out.println(suma(4, 2));

        //PASO POR REFERENCIA: Pasar una dirección de memoria como párametro
        // La función modifica lo que hay en la dirección de memoria.

        // Instanciamos la clase para crear un objeto.
        Potato miPotato = new Potato();

        // Los objetos trabajan con punteros (una referencia del area de la memoria).

        // No ha habido necesidad de pasarle un parametro.
        // Estamos modificando esa referencia de memoria.
        miPotato.QuitarBrazos();
        System.out.println(miPotato.brazos);
    }

    /*
     1º Visibilidad.
     2º Método forma parte de la clase, se llama al método sin una instancia.
     3º El tipo de valor que retorna la función.
     4º Parámetros
    */
    public static String suma(int a, int b) {
        return "Resultado -> " + String.format("%d", (a + b));
    }
}

class Potato {
    public int brazos = 0;

    public void QuitarBrazos(){
        this.brazos--;
    }
}