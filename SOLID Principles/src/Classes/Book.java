// A01654102
// Alejandro Mariacca Santin

package Classes;

// Principio 1: Single Responsibility
public class Book {

    private String name;
    private String author;
    private String text;

    //constructor, getters y setters

    // Hagamos de cuenta que andan por aquí

    //Función relacioanda a las propiedades de la clase libro
    public boolean isWordInText(String word){
        return text.contains(word);
    }
}

// Representa el principio porque separamos las funciones de cada clase
class BookPrinter {
    // Método para imprimir datos del libro
    void printTextToConsole(String text){
        //Aquí va el código de la función
    }
}

