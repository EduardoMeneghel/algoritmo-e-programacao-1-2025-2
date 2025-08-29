import javax.swing.JOptionPane;
public class CaixaOpcoes {
    public static void main(String[] args) {
        Object[] opcoes = {"Opção A"
                ,
                "Opção B"
                ,
                "Opção C"};
        int escolha = JOptionPane.showOptionDialog(null,
                "Escolha uma das opções:"
                ,
                "Caixa de Opções"
                ,
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcoes,
                opcoes[0]);
        JOptionPane.showMessageDialog(null,
                "Você escolheu: " + opcoes[escolha]);
    }
}