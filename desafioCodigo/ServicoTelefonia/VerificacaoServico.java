import java.util.Scanner;

public class VerificacaoServico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada do serviço a ser verificado
        System.out.println("Digite o nome do serviço a ser verificado (ex: movel, fixa, banda larga, tv): ");
        String servico = scanner.nextLine().trim();
        
        // Entrada do nome do cliente e os serviços contratados
        System.out.println("Digite o nome do cliente seguido pelos serviços contratados, separados por vírgulas (ex: Alice,movel,fixa): ");
        String entradaCliente = scanner.nextLine().trim();
        
        // Separando o nome do cliente e os serviços contratados
        String[] partes = entradaCliente.split(",");
        String nomeCliente = dados[0];
        boolean contratado = false;
        
        // TODO: Verifique se o serviço está na lista de serviços contratados
        if servico {
          System.out.println(entradaCliente + " contratou o serviço: " + servico)
        } else {
          System.out.println(entradaCliente + "NÃO contratou o serviço" + servico)
        }
        
        scanner.close();
    }
}