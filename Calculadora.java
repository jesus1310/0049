/**
 * Write a description of class Calculadora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Calculadora
{
    /**
     * Método que imprime por pantalla todos los múltiplos de 5 entre 10 y 95 (ambos no incluidos)
     */
    public void multiplesOfFive(){
        int numero = 5;
        int contador = 0;
        int producto = 0;
        while (producto < 95){
            if (producto > 10){
                System.out.println(producto);                
            }
            contador = contador + 1;
            producto = numero * contador;
        }
    }

    /**
     * Método que imprime por pantalla la suma de todos los números comprendidos entre 0 y 10 (ambos incluidos)
     */
    public void sumValues(){
        int suma = 0;
        int contador = 0;
        while(contador <= 10){
            suma = contador + suma;
            contador = contador + 1;
        }
        System.out.println("La suma de todos los números comprendidos entre 0 y 10 (ambos incluidos) es " + suma);
    }

    /**
     * Método que imprime por pantalla la suma de todos los números comprendidos entre los valores pasados por parámetro (ambos incluidos)
     */
    public int sumValuesInterval(int a, int b){
        int suma = 0;
        int contador = 0;
        if (a >= 0 && b >= 0){
            if (a > b){
                int aux = a;
                a = b;
                b = aux;
            }
            while (contador + a <= b){
                suma = (contador + a) + suma;
                contador = contador + 1;
            }
            if (a == b){
                return a;
            }
            else{
                return suma;
            }
        }
        else{
            return -1;
        }
    }

    /**
     * Método que nos dice si un número pasado por parámetro es primo o no
     */
    public boolean isPrime(int n){
        boolean esPrimo = true;
        int contador = 2;
        if (n > 1){
            while(esPrimo && contador <= (n - 1)){
                if (n % contador == 0){
                    esPrimo = false;
                }
                contador = contador + 1;
            }
        }
        else{
            System.out.println("El número dado no es válido. El primer número primo es el 2");
            esPrimo = false;
        }
        return esPrimo;
    }
}
