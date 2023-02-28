// A01654102
// Alejandro Mariacca Santin

package Classes;

// Principio 4: Interface Segregation

// El principio de segregación dice que las interfaces grandes
// deben estar separadas en otras más pequeñas

// Este ejemplo no cumple, pues hace varias cosas a la vez
interface BearKeeper {
    void washTheBear();
    void feedTheBear();
    void petTheBear();
}

interface BearCleaner {
    void washTheBear();
}

interface BearFeeder {
    void feedTheBear();
}

interface BearPetter {
    void petTheBear();
}

