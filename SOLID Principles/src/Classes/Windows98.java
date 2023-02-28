// A01654102
// Alejandro Mariacca Santin

package Classes;

// Principio 5: Dependency Inversion

// Este principio indica que se deberían
// desacoplar los módulos de software

// Si tuvieramos una máquina con un teclado en específico, la clase dependería del objeto
class Windows98Machine {

    /* Comentado porque lanza error y me flojera crear las clases necesarias
    private final StandardKeyboard keyboard;
    private final Monitor monitor;

    public Windows98Machine() {
        monitor = new Monitor();
        keyboard = new StandardKeyboard();
    }
    */
}

// En cambio, un concepto abstracto como teclado es mucho más confiable y seguro
interface Keyboard { }
class Windows98MachineBetter{

    //private final Keyboard keyboard;
    //private final Monitor monitor;

    /*
    public Windows98Machine(Keyboard keyboard, Monitor monitor) {

        this.keyboard = keyboard;
        this.monitor = monitor;
    }
    */
}

class StandardKeyboard implements Keyboard { }
