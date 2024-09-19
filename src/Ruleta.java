import java.util.Scanner;

public class Ruleta {
public static void main(String[]args) {
	int Saldo = 500;
	Scanner Scan = new Scanner(System.in);
	int SaldoA = 0;
	int Numero = 0;
	System.out.println("tienes "+ Saldo + " de saldo");
	System.out.println();
	do {
	System.out.println("¿cuanto saldo deseas apostar?");
	SaldoA = Scan.nextInt();
	}while (SaldoA>Saldo);
	do {System.out.println("¿porque numero deseas apostar?");
	Numero = Scan.nextInt();
	}while(Numero>36); while(Numero<1);
    
    
  }
}

