import java.util.Scanner;

public class Metodos {
    public static void main(String[]arg){
Scanner scanner = new Scanner(System.in);
System.out.print("Dame un nuemro menor a 100");
int z = scanner.nextInt();
System.out.print("Dame otro nuemro porfavor");
int n = scanner.nextInt();
int cach = operacion (z,n);
int cach2 = operacion (z);
System.out.print(cach);
System.out.print(cach2);
if (z>100){
    System.out.println("Que paso?, no dice menor que 100?");
}

    }

    public static int operacion  (int x, int y){
        int res = (x*y)/2;
        return res;


    }
    public static int operacion  (int x){
        int res = (x)^2;
        return res;
    }
    public static void ImpError  (int x){
        System.out.println("ERROR");
    }
    public static boolean error2 (int x){

        return true;
    }
    public static void aquisolo (int x){
System.out.println("solo solin solito");

    }

}
