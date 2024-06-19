package dados;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

public class CadastroCliente implements ActionListener {
    private JPanel panel;
    private JTextArea textArea1;
    private JTextField textCodigo;
    private JTextField textNome;
    private JRadioButton individualRadioButton;
    private JRadioButton empresarialRadioButton;
    private JButton confirmarButton;
    private JButton mostrarDadosButton;
    private JButton limparButton;
    private JButton finalizarButton;
    private ButtonGroup tipo;
    ArrayList<Cliente>clientes = new ArrayList<>();

    public CadastroCliente(){

        confirmarButton.addActionListener(this);
        mostrarDadosButton.addActionListener(this);
        limparButton.addActionListener(this);
        finalizarButton.addActionListener(this);

        tipo=new ButtonGroup();
        tipo.add(individualRadioButton);
        tipo.add(empresarialRadioButton);

        JFrame frame = new JFrame();
        frame.setContentPane(getPanel());
        frame.setSize(600,400);
        frame.setTitle("ACMERescue");
        ImageIcon imageIcon = new ImageIcon("icon.png");
        frame.setLocationRelativeTo(null);
        frame.setIconImage(imageIcon.getImage());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public JPanel getPanel() {
        return panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==confirmarButton){
            }
        else if (e.getSource()==limparButton){

        }
        else if (e.getSource()==mostrarDadosButton){

        }
        else if (e.getSource()==finalizarButton){
            System.exit(0);
        }
    }
    private void cadastarCliente(){
        try {
            int codigo = Integer.parseInt(textCodigo.getText());
            String nome= textNome.getText();
            if (existeCodigo(codigo)){
                textArea1.append("Erro! Já existe um evento com esse código."+"\n");
            }

        } catch (Exception e) {

        }

    }
    private boolean existeCodigo(int codigo){
        for(Cliente cliente: clientes){
            if (cliente.getCodigo()==codigo){
                return true;
            }
        }
        return false;
    }
}

