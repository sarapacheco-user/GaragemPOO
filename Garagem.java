import java.util.Scanner;

public class Garagem {
    private Scanner scanner = new Scanner(System.in);

    public void comecar() {
        while (true) {
            System.out.print("Deseja informar um novo veículo? (s/n): ");
            String resposta = scanner.nextLine();
            if (resposta.equalsIgnoreCase("n")) {
                break;
            }

            Veiculo veiculo = criarVeiculo();
            if (veiculo != null) {
                if (veiculo.podeEstacionar()) {
                    System.out.printf("O valor da hora estacionada é: R$ %.2f%n", veiculo.calcularTarifa());
                } else {
                    System.out.println("Veículo não pode ser aceito na garagem.");
                }
            } else {
                System.out.println("Tipo de veículo inválido.");
            }
        }
    }

    private Veiculo criarVeiculo() {
        System.out.print("Informe o tipo de veículo (motocicleta, carro, caminhonete, furgão): ");
        String tipo = scanner.nextLine().toLowerCase();
        System.out.print("Informe o peso (em kg): ");
        double peso = Double.parseDouble(scanner.nextLine());

        switch (tipo) {
            case "motocicleta":
                return new Motocicleta(peso);
            case "carro":
                System.out.print("Informe o tipo de carro (hatchback, sedan, SUV): ");
                String tipoCarro = scanner.nextLine();
                return new CarroPasseio(peso, tipoCarro);
            case "caminhonete":
                System.out.print("A caminhonete está carregada? (s/n): ");
                boolean carregada = scanner.nextLine().equalsIgnoreCase("s");
                return new Caminhonete(peso, carregada);
            case "furgão":
                System.out.print("Informe o volume (em m³): ");
                double volume = Double.parseDouble(scanner.nextLine());
                return new Furgao(peso, volume);
            default:
                return null;
        }
    }
}
