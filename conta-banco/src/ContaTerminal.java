import java.util.Scanner;


public class ContaTerminal {
        

    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        
        
                        
            System.out.println("Por favor, digite o número da Agência !");
            int Agencia = scanner.nextInt();
            System.out.println("Usuário:");
            int Numero = scanner.nextInt();
            System.out.println("Nome Cliente: ");
            String  NomeCliente = scanner.next();
            String SobreNome = scanner.next();
            System.out.println("Saldo: ");
            double Saldo = scanner.nextDouble();
            scanner.close();
            System.out.println("Olá " + NomeCliente + " " + SobreNome + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia +  " , conta " + Numero + " e seu saldo "  + Saldo + " já está disponível para saque.");
            

        }

        
    }

