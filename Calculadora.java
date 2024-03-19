import java.util.Scanner;

public class Calculadora {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int opt = 0;
        double a = 0, b = 0;
        do {
            System.out.print("\nBienvenido a la calculadora\n");
            System.out.println("Que desea realizar? \n");
            System.out.print("1. Suma \n");
            System.out.print("2. Resta \n");
            System.out.print("3. Multiplicacion \n");
            System.out.print("4. Division \n");
            System.out.print("5. Salir \n");
            opt = sc.nextInt();
            switch(opt) {
                case 1:
                    System.out.print("Ingrese el primer numero:");
                    a = sc.nextDouble();
                    System.out.print("Ingrese el segundo numero");
                    b = sc.nextDouble();
                    suma(a, b);
                    System.out.print("El resultado es: " + suma(a, b));
                break;
                case 2:
                    System.out.print("Ingrese el primer numero:");
                    a = sc.nextDouble();
                    System.out.print("Ingrese el segundo numero");
                    b = sc.nextDouble();
                    resta(a, b);
                    System.out.print("El resultado es: " + resta(a, b));
                break;
                case 3:
                    System.out.print("Ingrese el primer numero:");
                    a = sc.nextDouble();
                    System.out.print("Ingrese el segundo numero");
                    b = sc.nextDouble();
                    multiplicacion(a, b);
                    System.out.print("El resultado es: " + multiplicacion(a, b));
                break;
                case 4:
                    System.out.print("Ingrese el primer numero:");
                    a = sc.nextDouble();
                    System.out.print("Ingrese el segundo numero");
                    b = sc.nextDouble();
                    division(a, b);
                    System.out.print("El resultado es: " + division(a, b));
                break;
                case 5:
                    System.out.print("Gracias por utilizar el programa");
                break;
            }
        } while (opt<4);
       
        
        
    }
    public static double suma(double a, double b){
    return a + b;
    }
    public static double resta(double a, double b){
        return a - b;
    }
    public static double multiplicacion(double a, double b){
    return a * b;
    }
    public static double division(double a, double b){
        return a / b;
    } 
}