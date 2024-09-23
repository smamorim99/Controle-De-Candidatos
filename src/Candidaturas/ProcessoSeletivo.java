package Candidaturas;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
      String [] candidatos = {"Felipe", "ANA", "MARCELO", "PEDRO", "DANIELA",};
        for (String candidato: candidatos){
            entrandoEmContato(candidato);
        }
    }
    static void entrandoEmContato (String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
                 atendeu= atender();
                 continuarTentando = !atendeu; 
                 if (continuarTentando)
                    tentativasRealizadas++;
                else
                    System.out.println("Contato realizado com sucesso");
            }while (continuarTentando && tentativasRealizadas <3);
            if (atendeu)
                System.out.println("Conseguimos contado com " + candidato + " na" + tentativasRealizadas + " btentativa");
            else 
                System.out.println("Não conseguimos contato" + candidato + ", numero de tantativas: " + tentativasRealizadas + " tentativa");    

    }
    static boolean atender (){
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados (){
        String [] candidatos = {"Felipe", "ANA", "MARCELO", "PEDRO", "DANIELA",};
        for (String candidato : candidatos){
            System.out.println("Os candidatos selecionados foram:"+ " " + candidato);
        }
    }
    static void selecaoDeCandidatos (){
        String [] candidatos = {"Felipe", "ANA", "MARCELO", "PEDRO", "DANIELA", "RAFAEL", "CARLA", "ISADORA", "VIVIANE", "WILIAN", "CAROLINA", "BERNARDO", "BENICIO", "MARINA"};
        int candidatoSelecionados = 0;
        int candidatoAtual = 0;
        while (candidatoSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos [candidatoAtual];
            double salarioPretendido = valorPretendido();
            double salarioBase = 2000.0;
            
            System.out.println("O candidato" + " " + candidato + " " + "Solicitou este valor:"+ "" + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato"+ " " + candidato + " " + "foi selecionado para a vaga!");
                candidatoSelecionados ++;
            }
            candidatoAtual++;
        }
    }
    static double valorPretendido (){
        return ThreadLocalRandom.current().nextDouble(1800.0, 2200.0);
    }    
    static void analisarCandidato (double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == salarioPretendido)
            System.out.println("Ligar para o candidato com contra proposta");
        else {
            System.out.println("Aguardar resultado dos demais candidatos");
        }
    }

}
