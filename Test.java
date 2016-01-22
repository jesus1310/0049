import java.util.ArrayList;

/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
    // Declaramos un objeto de la clase Calculadora
    private Calculadora calcula;
    // Atributo que muestra si la prueba devuelve lo esperado
    private String estaBien;
    // Atributo que muestra si funciona correctamente o no
    private String funciona;
    // ArrayList de tipo String que guarda los valores del atributo estaBien
    private ArrayList<String> lista;
    
    /**
     * Constructor de objetos de la clase Test
     */
    public Test(){
        calcula = new Calculadora();
        estaBien = "ERROR";
        funciona = "SI";
        lista = new ArrayList<String>();
    }

    /**
     * Método para comprobar la funcionalidad del método sumValuesInterval
     */
    public void testSumValuesInterval(){
        // Este ejemplo debe devolver 55
        int correcto = 55;
        if (correcto == calcula.sumValuesInterval(1,10)){
            estaBien = "OK";
        }
        else {
            estaBien = "ERROR";
        }
        lista.add(estaBien);
        System.out.println("Comprobando testSumValueInterval... Parametros 1 y 10... ");
        System.out.println("Resultado correcto: " + correcto + " // Resultado método: " + calcula.sumValuesInterval(1,10) + " -------------> " +  estaBien);
        System.out.println("---------------------------------------------------------");
        // Este ejemplo debe devolver 55
        correcto = 55;
        if (correcto == calcula.sumValuesInterval(10,1)){
            estaBien = "OK";
        }
        else {
            estaBien = "ERROR";
        }
        lista.add(estaBien);
        System.out.println("Comprobando testSumValueInterval... Parametros 10 y 1...");
        System.out.println("Resultado correcto: " + correcto + " // Resultado método: " + calcula.sumValuesInterval(10,1) + " -------------> " +  estaBien);
        System.out.println("---------------------------------------------------------");
        // Este ejemplo debe devolver 1
        correcto = 1;
        if (correcto == calcula.sumValuesInterval(1,1)){
            estaBien = "OK";
        }
        else {
            estaBien = "ERROR";
        }
        lista.add(estaBien);
        System.out.println("Comprobando testSumValueInterval... Parametros 1 y 1...");
        System.out.println("Resultado correcto: " + correcto + " // Resultado método: " + calcula.sumValuesInterval(1,1) + " -------------> " +  estaBien);
        System.out.println("---------------------------------------------------------");
        // Este ejemplo debe devolver -1
        correcto = -1;
        if (correcto == calcula.sumValuesInterval(1,-5)){
            estaBien = "OK";
        }
        else {
            estaBien = "ERROR";
        }
        lista.add(estaBien);
        System.out.println("Comprobando testSumValueInterval... Parametros 1 y -5...");
        System.out.println("Resultado correcto: " + correcto + " // Resultado método: " + calcula.sumValuesInterval(1,-5) + " -------------> " +  estaBien);
        System.out.println("---------------------------------------------------------");
        // Este ejemplo debe devolver -1
        correcto = -1;
        if (correcto == calcula.sumValuesInterval(-5,1)){
            estaBien = "OK";
        }
        else {
            estaBien = "ERROR";
        }
        lista.add(estaBien);
        System.out.println("Comprobando testSumValueInterval... Parametros -5 y 1...");
        System.out.println("Resultado correcto: " + correcto + " // Resultado método: " + calcula.sumValuesInterval(-5,1) + " -------------> " + estaBien);
        System.out.println("---------------------------------------------------------");
        // Este ejemplo debe devolver -1
        correcto = -1;
        if (correcto == calcula.sumValuesInterval(-5,-5)){
            estaBien = "OK";
        }
        else {
            estaBien = "ERROR";
        }
        lista.add(estaBien);
        System.out.println("Comprobando testSumValueInterval... Parametros -5 y -5...");
        System.out.println("Resultado correcto: " + correcto + " // Resultado método: " + calcula.sumValuesInterval(-5,-5) + " -------------> " +  estaBien);
        System.out.println("---------------------------------------------------------");
        // Recorremos el ArrayList para comprobar si todos son OK o hay algún ERROR
        int contador = 0;
        for (String func : lista){
            func = lista.get(contador);
            if (!func.equals("OK")){
                funciona = "NO";
            }
            contador = contador + 1;
        }
        System.out.println("El método " + funciona + " funciona correctamente");
        lista.clear();
        funciona = "SI";
    }
    
    public void testIsPrime(){
        // Este ejemplo debe devolver true 
        boolean primo = true;
        if (primo == calcula.isPrime(5)){
            estaBien = "OK";
        }
        else {
            estaBien = "ERROR";
        }
        lista.add(estaBien);
        System.out.println("Comprobando testIsPrime... Parametro 5... ");
        System.out.println("Resultado correcto: " + primo + " // Resultado método: " + calcula.isPrime(5) + " -------------> " +  estaBien);
        System.out.println("---------------------------------------------------------");
        // Este ejemplo debe devolver false 
        primo = false;
        if (primo == calcula.isPrime(40)){
            estaBien = "OK";
        }
        else {
            estaBien = "ERROR";
        }
        lista.add(estaBien);
        System.out.println("Comprobando testIsPrime... Parametro 40... ");
        System.out.println("Resultado correcto: " + primo + " // Resultado método: " + calcula.isPrime(40) + " -------------> " +  estaBien);
        System.out.println("---------------------------------------------------------");
        // Este ejemplo debe devolver true 
        primo = true;
        if (primo == calcula.isPrime(11)){
            estaBien = "OK";
        }
        else {
            estaBien = "ERROR";
        }
        lista.add(estaBien);
        System.out.println("Comprobando testIsPrime... Parametro 11... ");
        System.out.println("Resultado correcto: " + primo + " // Resultado método: " + calcula.isPrime(11) + " -------------> " +  estaBien);
        System.out.println("---------------------------------------------------------");
        // Este ejemplo debe devolver false 
        primo = false;
        if (primo == calcula.isPrime(25)){
            estaBien = "OK";
        }
        else {
            estaBien = "ERROR";
        }
        lista.add(estaBien);
        System.out.println("Comprobando testIsPrime... Parametro 25... ");
        System.out.println("Resultado correcto: " + primo + " // Resultado método: " + calcula.isPrime(25) + " -------------> " +  estaBien);
        System.out.println("---------------------------------------------------------");
        // Este ejemplo debe devolver true 
        primo = true;
        if (primo == calcula.isPrime(47)){
            estaBien = "OK";
        }
        else {
            estaBien = "ERROR";
        }
        lista.add(estaBien);
        System.out.println("Comprobando testIsPrime... Parametro 47... ");
        System.out.println("Resultado correcto: " + primo + " // Resultado método: " + calcula.isPrime(47) + " -------------> " +  estaBien);
        System.out.println("---------------------------------------------------------");
        // Este ejemplo debe devolver false 
        primo = false;
        if (primo == calcula.isPrime(1)){
            estaBien = "OK";
        }
        else {
            estaBien = "ERROR";
        }
        lista.add(estaBien);
        System.out.println("Comprobando testIsPrime... Parametro 1...");
        System.out.println("Resultado correcto: " + primo + " // Resultado método: " + calcula.isPrime(1) + " -------------> " +  estaBien);
        System.out.println("---------------------------------------------------------");
        // Recorremos el ArrayList para comprobar si todos son OK o hay algún ERROR
        int contador = 0;
        for (String func : lista){
            func = lista.get(contador);
            if (!func.equals("OK")){
                funciona = "NO";
            }
            contador = contador + 1;
        }
        System.out.println("El método " + funciona + " funciona correctamente");
        lista.clear();
        funciona = "SI";
    }
}
