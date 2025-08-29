import javax.swing.JOptionPane;
public class CaixaMensagem {
    public static void main(String[] args) {
// Mostra uma mensagem informativa
        JOptionPane.showMessageDialog(null,
                "Operação realizada com sucesso!"
                ,
                "Mensagem"
                ,
                JOptionPane.INFORMATION_MESSAGE);
    }
}