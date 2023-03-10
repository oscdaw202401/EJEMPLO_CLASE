import java.util.Scanner;

public class EJERCICIO6 {
    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Introduzca número");
            numero = sc.nextInt();
            valida(numero);
            operacion(numero);
        } while (!valida(numero));
        sc.close();

    }
    public static boolean valida(int a) {
        return (a <= 0);
    }
    public static int operacion(int num){
        int suma=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                suma=suma+i;
            }
        }
        if(suma==num){
            System.out.println("Número perfecto");
        }else{
            System.out.println("Número no perfecto");
        }
        return num;
    }
}
