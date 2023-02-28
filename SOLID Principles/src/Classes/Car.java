// A01654102
// Alejandro Mariacca Santin

package Classes;

// Principio 3: Liskov Substitution
public interface Car {

    void turnOnEngine();
    void accelerate();
}


//Esto está bien porque usamos la interfaz para crear un nuevo objeto
class MotorCar implements Car {

    private Engine engine;

    //Constructores, getters y setters

    public void turnOnEngine() {
        //Prender el motor
        engine.on();
    }

    public void accelerate() {
        //Avanzar
        engine.powerOn(1000);
    }
}

//Sin embargo, si usáramos la misma interfaz para hacer un objeto distinto,
//estaríamos rompiendo la regla
class ElectricCar implements Car {

    public void turnOnEngine() {
        throw new AssertionError("¡No tengo un motor!");
    }

    public void accelerate() {
    }
}

//Esto es para que no salga error en Motorcar
class Engine {
    public String name = "";
    void on(){

    };

    void powerOn(int x) {

    }
}
