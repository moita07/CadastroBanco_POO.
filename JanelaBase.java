import javax.swing.*;
import java.awt.event.*;

public class JanelaBase extends JFrame {

    // declaracao dos componentes
    JLabel jlAgencia, jlConta, jlNome, jlEndereco, jlTelefone, jlCpf;
    JTextField jtfAgencia, jtfConta, jtfNome, jtfEndereco, jtfTelefone, jtfCpf;
    JSeparator jSeparator01, jSeparator02;
    JRadioButton jrbCorrente, jrbPoupanca;
    ButtonGroup bgContas;
    JButton jbConsultar, jbAtualizar, jbFechar;

    public JanelaBase() {

        // define o titulo da janela
        setTitle("Java Swing - Desenvolvimento de Sistemas");

        // define o tamanho da janela
        setSize(400, 255);

        // impede que o usuario redimensione a janela
        setResizable(false);

        // define o layout como nulo para posicionamento absoluto
        getContentPane().setLayout(null);

        // define a operacao de fechamento
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // centraliza a janela na tela
        centralizar();

        // rotulo agencia
        jlAgencia = new JLabel("Código da Agência:");
        jlAgencia.setBounds(10, 10, 110, 18);
        getContentPane().add(jlAgencia);

        // campo agencia
        jtfAgencia = new JTextField();
        jtfAgencia.setBounds(125, 10, 50, 20);
        getContentPane().add(jtfAgencia);

        // rotulo conta
        jlConta = new JLabel("Número da Conta:");
        jlConta.setBounds(205, 10, 105, 18);
        getContentPane().add(jlConta);

        // campo conta
        jtfConta = new JTextField();
        jtfConta.setBounds(315, 10, 60, 20);
        getContentPane().add(jtfConta);

        // separador superior
        jSeparator01 = new JSeparator();
        jSeparator01.setBounds(10, 40, 365, 10);
        getContentPane().add(jSeparator01);

        // rotulo nome
        jlNome = new JLabel("Nome:");
        jlNome.setBounds(10, 50, 60, 18);
        jlNome.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(jlNome);

        // campo nome
        jtfNome = new JTextField();
        jtfNome.setBounds(75, 50, 300, 20);
        getContentPane().add(jtfNome);

        // rotulo endereco
        jlEndereco = new JLabel("Endereço:");
        jlEndereco.setBounds(10, 75, 60, 18);
        jlEndereco.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(jlEndereco);

        // campo endereco
        jtfEndereco = new JTextField();
        jtfEndereco.setBounds(75, 75, 300, 20);
        getContentPane().add(jtfEndereco);

        // rotulo telefone
        jlTelefone = new JLabel("Telefone:");
        jlTelefone.setBounds(10, 100, 60, 18);
        jlTelefone.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(jlTelefone);

        // campo telefone
        jtfTelefone = new JTextField();
        jtfTelefone.setBounds(75, 100, 300, 20);
        getContentPane().add(jtfTelefone);

        // rotulo cpf
        jlCpf = new JLabel("CPF:");
        jlCpf.setBounds(10, 125, 60, 18);
        jlCpf.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(jlCpf);

        // campo cpf
        jtfCpf = new JTextField();
        jtfCpf.setBounds(75, 125, 300, 20);
        getContentPane().add(jtfCpf);

        // botao radio conta corrente
        jrbCorrente = new JRadioButton("Conta Corrente");
        jrbCorrente.setBounds(100, 150, 111, 20);
        jrbCorrente.setMnemonic(KeyEvent.VK_C);
        jrbCorrente.setSelected(true);
        getContentPane().add(jrbCorrente);

        // botao radio conta poupanca
        jrbPoupanca = new JRadioButton("Conta Poupança");
        jrbPoupanca.setBounds(225, 150, 118, 20);
        jrbPoupanca.setMnemonic(KeyEvent.VK_P);
        getContentPane().add(jrbPoupanca);

        // grupo dos botoes de conta
        bgContas = new ButtonGroup();
        bgContas.add(jrbCorrente);
        bgContas.add(jrbPoupanca);

        // separador inferior
        jSeparator02 = new JSeparator();
        jSeparator02.setBounds(10, 180, 365, 10);
        getContentPane().add(jSeparator02);

        // botao consultar
        jbConsultar = new JButton("Consultar");
        jbConsultar.setBounds(35, 190, 100, 23);
        jbConsultar.setMnemonic(KeyEvent.VK_S);
        getContentPane().add(jbConsultar);

        // botao atualizar
        jbAtualizar = new JButton("Atualizar");
        jbAtualizar.setBounds(145, 190, 100, 23);
        jbAtualizar.setMnemonic(KeyEvent.VK_A);
        jbAtualizar.setEnabled(false);
        getContentPane().add(jbAtualizar);

        // botao fechar
        jbFechar = new JButton("Fechar");
        jbFechar.setBounds(255, 190, 100, 23);
        jbFechar.setMnemonic(KeyEvent.VK_F);
        jbFechar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        getContentPane().add(jbFechar);

        // acao do botao consultar
        jbConsultar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jbAtualizar.setEnabled(true);
                JOptionPane.showMessageDialog(null, "dados carregados para consulta", "consulta", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // acao do botao atualizar
        jbAtualizar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "dados atualizados com sucesso", "atualizacao", JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }

    // metodo que centraliza a janela
    private void centralizar() {
        setLocationRelativeTo(null);
    }

    // metodo principal para executar o programa
    public static void main(String[] args) {
        JanelaBase janela = new JanelaBase();
        janela.setVisible(true);
    }
}
