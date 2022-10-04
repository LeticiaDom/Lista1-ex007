import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    double lado, area; 
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite o lado do quadrado: ");
    lado = sc.nextDouble(); 
    sc.close();

    area = (Math.pow(lado, 2)) * 2; 
    
    System.out.println("O dobro da área do quadrado é: " + area);


    }
}
