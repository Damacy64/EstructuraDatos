package estructurasdatos;

public class Fibonacci {
    public static void main(String[] args) {
        Fibonacci prueba = new Fibonacci();
        System.out.println("La sucesion Fibonacci de 12 mediante recursividad es: " + prueba.Fibonacci(12));
        System.out.println("La sucesion Fibonacci de 12 mediante ciclo es: " + prueba.FibonacciCiclo(12));

    }
    //creando el metodo recursivo para la sucesion Fibonacci
    public int Fibonacci(int numero){
        if(numero==1 || numero==2){
            //caso base
            return 1;
        }else{
            //dominio recursivo (n-1)
            return Fibonacci(numero-1) + Fibonacci(numero-2);
        }
    }
    //creando el metodo con ciclo de Fibonacci
    public int FibonacciCiclo(int numero){
        int resultado=0, num1=1, num2=0;
        while(numero>0){
            resultado = num1 + num2;
            num1 = num2;
            num2 = resultado;
            numero--;
        }
        return resultado;
    }
}
