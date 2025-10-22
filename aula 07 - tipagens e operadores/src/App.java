import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        TiposPrimitivos();

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Digite um numero: ");
        // int a = sc.nextInt();//a=10

        // System.out.print("Digite um numero: ");
        // int b = sc.nextInt();//b=10

        // OpAritmeticos(a, b); //a=10 b=10
        // OpComparacao();
        OpLogicos();

    }

    public static void TiposPrimitivos() {
        // inteiros
        int i = 55553200;
        short s = 13200;
        byte b = 100;
        long l = 555511000;

        // ponto flutuante
        float f = 3.14f;
        double d = 3.14;

        // texto
        char c = 'A'; // utiliza aspas simples

        // booleano
        boolean tr = true;
        boolean fa = false;
    }

    public static void OpAritmeticos(double a, double b) {
        // O + em numeros realiza a Soma
        // O + em numeros com texto realiza a Junção
        System.out.println("Soma: " + (a + b));
        System.out.println("Subtração: " + (a - b));
        System.out.println("Multiplicação: " + (a * b));
        System.out.println("Divisão: " + (a / b));
        System.out.println("Resto Divisão (Módulo): " + (a % b));

    }

    public static void OpComparacao() {
        // Comparação
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int a = sc.nextInt();// a=10

        System.out.print("Digite um numero: ");
        int b = sc.nextInt();// b=10

        if (a > b) {
            System.out.println("A é maior que B");
        } else if (a == b) {
            System.out.println("A e B são iguais");
        } else {
            System.out.println("B é maior que A");
        }

        if (a >= b) {
            // if encadeado (ou aninhado)
            if (a==b){
               System.out.println("A e B são iguais"); 
            }else{
                System.out.println("A é maior que B");
            }
            
        } else {
            System.out.println("B é maior a A");
        }

    }

    public static void OpLogicos(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma idade: ");
        int a = sc.nextInt();

        // if (a>18){
        //     System.out.println("Maior de idade");
        // }else {
        //      System.out.println("Menor de idade");
        // }

        if (a<=2){
            System.out.println("Bebe");
        }else if (a>2 && a<=12){
            System.out.println("Criança");
        }else if (a>12 && a<=17){
            System.out.println("Adolescente");
        }else if (a>=18 && a<=35){
            System.out.println("Jovem Adulto");
        }else {
            System.out.println("Idoso");
        }

    }
}
