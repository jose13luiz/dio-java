import java.util.Scanner;


public class ContaTerminal {
    private int Numero;
    private String Agencia;
    private String NomeCliente;
    private double Saldo;
    

    public int  getNumero(){
        return this.Numero;
    }
    public void setNumero(int Numero){
        this.Numero = Numero;
    }
    public String  getAgencia(){
        return this.Agencia;
    }
    public void setAgencia(String Agencia){
        this.Agencia = Agencia;
    }
    public String  getNomeCliente(){
        return this.NomeCliente;
    }
    public void setNomeCliente(String NomeCliente){
        this.NomeCliente = NomeCliente;
    }
    public double  getSaldo(){
        return this.Saldo;
    }
    public void setSaldo(double Saldo){
        this.Saldo = Saldo;
    }
    

    public ContaTerminal(int Numero, String Agencia, String NomeCliente, double Saldo ){
        this.Numero = Numero;
        this.Agencia = Agencia;
        this.NomeCliente = NomeCliente;
        this.Saldo = Saldo;
        
    }

    
    

    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
            String Agencia;
            int Numero;
            String NomeCliente;
            double Saldo;
            



            
            System.out.println("Por favor, digite o número da Agência !");
            Agencia = scanner.next();
            System.out.println("Usuário:");
            Numero = scanner.nextInt();
            System.out.println("NomeCliente: ");
            NomeCliente = scanner.next();
            System.out.println("Saldo: ");
            Saldo = scanner.nextDouble();
            scanner.close();
            System.out.printf("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é" + Agencia +  " , conta " + Numero + "e seu saldo %.2f" , + Saldo + " já está disponível para saque.");
            

        }

        
    }

