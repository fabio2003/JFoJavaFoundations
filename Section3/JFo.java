/* Nome do Aluno: Fábio Vitório
* RA: 323135349
* Nome do Programa: JFo Section 3
* Data: 28/05/23
*/

import javax.swing.JOptionPane;

public class JFo{
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "Bem-vindo à história interativa!\nVocê está prestes a embarcar em uma aventura emocionante.\nPrepare-se para tomar algumas decisões importantes!");

        JOptionPane.showMessageDialog(null, "Capítulo 1: O Caminho Perigoso\nVocê está em uma floresta escura e ouve um barulho estranho vindo do arbusto.");
        int choice1 = Integer.parseInt(JOptionPane.showInputDialog("O que você faz?\n1. Investigar o barulho.\n2. Ignorar e continuar andando."));

        if (choice1 == 1) {
            JOptionPane.showMessageDialog(null, "Você decide investigar o barulho e encontra um tesouro escondido!");
            double treasureValue = Double.parseDouble(JOptionPane.showInputDialog("Quanto você acha que vale esse tesouro?"));

            JOptionPane.showMessageDialog(null, "Você guarda o tesouro com cuidado e continua sua jornada.");
            JOptionPane.showMessageDialog(null, "Capítulo 2: A Montanha Misteriosa\nVocê se depara com uma montanha alta e íngreme.");
            int mountainHeight = Integer.parseInt(JOptionPane.showInputDialog("Quantos metros você acha que a montanha tem de altura?"));

            int stepsToReachTop = mountainHeight / 10;

            JOptionPane.showMessageDialog(null, "Você começa a escalar a montanha e leva " + stepsToReachTop + " passos para alcançar o topo.");
            JOptionPane.showMessageDialog(null, "Capítulo 3: O Desafio Final\nNo topo da montanha, você encontra um dragão feroz.");
            int damagePoints = Integer.parseInt(JOptionPane.showInputDialog("Você possui uma espada mágica que pode causar dano de 10 a 20 pontos.\nQuantos pontos de dano você deseja causar ao dragão?"));

            double dragonHealth = 100.0;
            dragonHealth -= damagePoints;

            if (dragonHealth <= 0) {
                JOptionPane.showMessageDialog(null, "Você derrota o dragão e salva o reino!");
            } else {
                JOptionPane.showMessageDialog(null, "O dragão contra-ataca e você é derrotado...\nFim da história.");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Você decide ignorar o barulho e continua andando.");
            JOptionPane.showMessageDialog(null, "Capítulo 2: O Encontro Assustador\nVocê se depara com uma figura misteriosa no caminho.");
            double distance = Double.parseDouble(JOptionPane.showInputDialog("Qual é a distância em metros entre você e essa figura?"));

            JOptionPane.showMessageDialog(null, "Você se aproxima da figura e percebe que é um fantasma assustador!");
            JOptionPane.showMessageDialog(null, "Você tenta correr, mas o fantasma te alcança rapidamente.");
            JOptionPane.showMessageDialog(null, "Capítulo 3: O Fim Trágico\nO fantasma te ataca e você perde toda a sua energia.\nFim da história.");
        }

    }
}
