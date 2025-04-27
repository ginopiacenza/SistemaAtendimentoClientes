import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pilha historicoSolicitacoes = new Pilha();
        Fila filaAtendimento = new Fila();
        Scanner scanner = new Scanner(System.in);

        preencherHistorico(historicoSolicitacoes);
        preencherFila(filaAtendimento);

        int opcao = 0;

        do {
            System.out.println("\n--- Sistema de Atendimento ---");
            System.out.println("1. Exibir fila de atendimento");
            System.out.println("2. Atender próximo cliente");
            System.out.println("3. Exibir histórico de solicitações");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Entrada inválida!");
                opcao = 0;
            }

            switch (opcao) {
                case 1:
                    System.out.println("\nFila de Atendimento:");
                    filaAtendimento.exibirFila();
                    break;
                case 2:
                    try {
                        Elemento atendido = filaAtendimento.desenfileirar();
                        System.out.println("Cliente atendido: " + atendido.nomeCliente);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("\nHistórico de Solicitações:");
                    historicoSolicitacoes.exibirPilha();
                    break;
                case 4:
                    System.out.println("Encerrando o sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 4);

        scanner.close();
    }

    public static void preencherHistorico(Pilha pilha) {
        pilha.empilhar(new Elemento("REQ001", "Instalação de software", "2024-08-20 10:30", ""));
        pilha.empilhar(new Elemento("REQ002", "Manutenção preventiva", "2024-08-20 11:00", ""));
        pilha.empilhar(new Elemento("REQ003", "Atualização de sistema", "2024-08-20 11:30", ""));
        pilha.empilhar(new Elemento("REQ004", "Suporte técnico", "2024-08-20 12:00", ""));
        pilha.empilhar(new Elemento("REQ005", "Troca de equipamento", "2024-08-20 12:30", ""));
        pilha.empilhar(new Elemento("REQ006", "Consulta de garantia", "2024-08-20 13:00", ""));
        pilha.empilhar(new Elemento("REQ007", "Reparo de impressora", "2024-08-20 13:30", ""));
        pilha.empilhar(new Elemento("REQ008", "Configuração de rede", "2024-08-20 14:00", ""));
        pilha.empilhar(new Elemento("REQ009", "Restauração de dados", "2024-08-20 14:30", ""));
        pilha.empilhar(new Elemento("REQ010", "Consulta técnica", "2024-08-20 15:00", ""));
    }

    public static void preencherFila(Fila fila) {
        fila.enfileirar(new Elemento("CLI001", "Dúvida sobre produto", "", "Maria Silva"));
        fila.enfileirar(new Elemento("CLI002", "Reclamação de serviço", "", "João Souza"));
        fila.enfileirar(new Elemento("CLI003", "Solicitação de reembolso", "", "Ana Costa"));
        fila.enfileirar(new Elemento("CLI004", "Informações de entrega", "", "Pedro Alves"));
        fila.enfileirar(new Elemento("CLI005", "Agendamento de visita", "", "Carla Dias"));
        fila.enfileirar(new Elemento("CLI006", "Alteração de pedido", "", "Lucas Martins"));
        fila.enfileirar(new Elemento("CLI007", "Cancelamento de contrato", "", "Patrícia Rocha"));
        fila.enfileirar(new Elemento("CLI008", "Renovação de assinatura", "", "Rafael Lima"));
        fila.enfileirar(new Elemento("CLI009", "Suporte para instalação", "", "Fernanda Gomes"));
        fila.enfileirar(new Elemento("CLI010", "Pedido de orçamento", "", "Carlos Eduardo"));
    }
}
