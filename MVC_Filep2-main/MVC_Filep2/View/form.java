package View;

public class form extends javax.swing.JFrame{

    public form() {
        initComponents();
    }
    
    public javax.swing.JTextField getTxtnum1() {
        return Txtnum1;
    }

    public javax.swing.JTextField getTxtnum2() {
        return Txtnum2;
    }

    public javax.swing.JTextField getTxtMulti() {
        return TxtMulti;
    }

    public javax.swing.JButton getButton() {
        return Button;
    }

    public void initComponents(){
        Label1 = new javax.swing.JLabel();
        Label2 = new javax.swing.JLabel();
        Label3 = new javax.swing.JLabel();
        Txtnum1 = new javax.swing.JTextField();
        Txtnum2 = new javax.swing.JTextField();
        TxtMulti = new javax.swing.JTextField();
        Button = new javax.swing.JButton();

        Label1.setText("Digite primer número:");
        Label2.setText("Digite segundo número:");
        Label3.setText("Resultado:");
        Button.setText("Procesar");

        setLayout(null);
        Label1.setBounds(10,-30,200,150);
        add(Label1);
        Label2.setBounds(10,20,200,150);
        add(Label2);
        Button.setBounds(125,150,100,25);
        add(Button);
        Label3.setBounds(10,140,200,150);
        add(Label3);
        Txtnum1.setBounds(160,30,150,25);
        add(Txtnum1);
        Txtnum2.setBounds(160,85,150,25);
        add(Txtnum2);
        TxtMulti.setBounds(90,205,260,25);
        add(TxtMulti);
    }

    private javax.swing.JLabel Label1;
    private javax.swing.JLabel Label2;
    private javax.swing.JLabel Label3;
    private javax.swing.JTextField Txtnum1;
    private javax.swing.JTextField Txtnum2;
    private javax.swing.JTextField TxtMulti;
    private javax.swing.JButton Button;
}