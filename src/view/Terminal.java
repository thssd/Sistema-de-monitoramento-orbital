package view;

import entities.*;

import java.util.Scanner;

public class Terminal {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        //Criacao dos objetos

        //Satelite
        Satelite satelite1 = new Satelite("SentinelBR-1", 650, true);
        Satelite satelite2 = new Satelite("SentinelBR-2", 700, true);

        Area area1 = new Area("Floresta Amazonica", "AM", "Amazônia", 15000);
        Area area2 = new Area("Serra do Mar", "SP", "Mata Atlântica", 8500);

        //Leituras orbitais
        LeituraOrbital leitura1 = new LeituraOrbital(satelite1.getNome(), area1.getNome(), 40, 0.1, 31);
        LeituraOrbital leitura2 = new LeituraOrbital(satelite2.getNome(), area2.getNome(), 85, 0.7, 22);

        //Ocorrencias
        Ocorrencia ocorrencia1 = new Ocorrencia("Desmatamento ilegal", "ALTA", area1.getNome());
        Ocorrencia ocorrencia2 = new Ocorrencia("Ocupação irregular", "MÉDIA", area2.getNome());
        Ocorrencia ocorrencia3 = new Ocorrencia("Mineração ilegal", "ALTA", area1.getNome());

        //Alertas
        Alerta alerta1 = new Alerta("Nível de água crítico detetcado", "CRÍTICO", area1.getNome());
        Alerta alerta2 = new Alerta("Vegetação muito baixa, possível queimada", "ALTO", area1.getNome());

        //Menu
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n====== MENU ======");
            System.out.println("\n[1] Ver satélites");
            System.out.println("[2] Ver áreas monitoradas");
            System.out.println("[3] Ver leituras orbitais");
            System.out.println("[4] Ver ocorrências");
            System.out.println("[5] Ver alertas");
            System.out.println("[6] Resolver uma ocorrência");
            System.out.println("[7] Enviar um alerta");
            System.out.println("[0] Sair");
            System.out.println("\n==================");
            System.out.print("Escolha: ");

            opcao = leitor.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("\n===SATÉLITES===");
                    System.out.println(satelite1);
                    System.out.println(satelite2);
                    break;
                case  2:
                    System.out.println("\n===AREAS MONITORADAS===");
                    System.out.println(area1);
                    System.out.println(area2);
                    break;
                case 3:
                    System.out.println("\n===LEITURAS ORBITAIS===");
                    System.out.println(leitura1);
                    System.out.println(leitura1.verificarRiscoEnchente());
                    System.out.println(leitura1.verificarDesmatamento());
                    System.out.println("\n" + leitura2);
                    System.out.println(leitura2.verificarRiscoEnchente());
                    System.out.println(leitura2.verificarDesmatamento());
                    break;
                case 4:
                    System.out.println("\n===OCORRÊNCIAS===");
                    System.out.println(ocorrencia1);
                    System.out.println(ocorrencia2);
                    System.out.println(ocorrencia3);
                    break;
                case 5:
                    System.out.println("\n===ALERTAS===");
                    System.out.println(alerta1);
                    System.out.println(alerta2);
                    break;
                case 6:
                    System.out.println("\n===RESOLVER OCORRENCIA===");
                    System.out.println("\nQual ocorrência deseja resolver?");
                    System.out.println("[1] " + ocorrencia1.getTipo());
                    System.out.println("[2] " + ocorrencia2.getTipo());
                    System.out.println("[3] " + ocorrencia3.getTipo());
                    System.out.print("Escolha: ");

                    int escolha1 = leitor.nextInt();

                    if (escolha1 == 1) {
                        ocorrencia1.resolver();
                        System.out.println("Urgente? " + ocorrencia1.urgencia());
                    } else if (escolha1 == 2) {
                        ocorrencia2.resolver();
                        System.out.println("Urgente? " + ocorrencia2.urgencia());
                    } else if (escolha1 == 3) {
                        ocorrencia3.resolver();
                        System.out.println("Urgente? " + ocorrencia3.urgencia());
                    } else {
                        System.out.println("Opcao inválida.");
                    }
                    break;
                case 7:
                    System.out.println("\n===ENVIAR ALERTA===");
                    System.out.println("\nQual alerta deseja enviar?");
                    System.out.println("[1] " + alerta1.getDescricao());
                    System.out.println("[2] " + alerta2.getDescricao());
                    System.out.print("Escolha: ");

                    int escolha2 = leitor.nextInt();

                    if (escolha2 == 1) {
                        alerta1.enviarAlerta();
                    } else if (escolha2 == 2) {
                        alerta2.enviarAlerta();
                    } else {
                        System.out.println("Opcao inválida.");
                    }
                    break;
                case 0:
                    System.out.println("\nEncerrando o sistema.");
                    break;
                default:
                    System.out.println("Opcao inválida. Tente novamente.");
                    break;
            }
        }
    }
}
