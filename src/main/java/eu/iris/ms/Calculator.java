package eu.iris.ms;

/**
 * Classe Calculator pour les premiers tests avec JUnit.
 *
 * Cette classe contient des méthodes mathématiques simples pour apprendre
 * les concepts de base des tests unitaires :
 * - Comportement prévisible
 * - Cas normaux et cas d'erreur
 * - Gestion des exceptions
 */
public class Calculator {

    Calculator(){

    }

    /**
     * Addition de deux entiers
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Soustraction de deux entiers
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Multiplication de deux entiers
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Division de deux nombres décimaux
     * @throws ArithmeticException si le diviseur est zéro
     */
    public double divide(double a, double b) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Calcul de la factorielle d'un nombre
     * @throws IllegalArgumentException si n est négatif
     */
    public int factorial(int n) throws IllegalArgumentException {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Vérifie si un nombre est pair
     */
    public boolean isEven(int number) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Calcule une puissance (exposant positif uniquement)
     * @throws IllegalArgumentException si l'exposant est négatif
     */
    public double power(double base, int exponent) throws IllegalArgumentException {
            throw new UnsupportedOperationException("Not implemented yet");
  //      int res = 1;
//        for (int i =0; i < N; i++ {
//                res *= i;
//        }
    }
}