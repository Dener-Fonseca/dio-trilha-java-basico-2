import java.util.Scanner;

public class Contador {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Digite o primeiro número: ");
    int num1 = sc.nextInt();
    
    System.out.println("Digite o segundo número: ");
    int num2 = sc.nextInt();

    tratarContagem(num1, num2);
    
    sc.close();
  }

  static void tratarContagem(int num1, int num2) {
    try {
      contar(num1, num2);
    } 
    
    catch (ParametrosInvalidosException e) {
      System.out.println(e.getMessage());
    } 
    
    finally {
      System.out.println("Contagem realizada.");
    }
  }

  static void contar(int num1, int num2) throws ParametrosInvalidosException {
    if (num1 > num2) {
      throw new ParametrosInvalidosException("O primeiro número deve ser menor que o segundo número!");
    } 
    
    else {
      for (int i = num1; i <= num2; i++) {
        System.out.println("Imprimindo o número " + i);
      }
    }
  }
}

class ParametrosInvalidosException extends Exception {
  
  public ParametrosInvalidosException(String message) {
    super(message);
  }
}