package View;

public class form extends javax.swing.JFrame{
    public form() {
        initComponents();
    }
    

    public javax.swing.JTextField getTxtResult() {
        return TxtResult;
    }


    public javax.swing.JTextField getTxtStr() {
        return TxtStr;
    }


    public javax.swing.JButton getButton() {
        return Button;
    }

    public javax.swing.JButton getButtonDele() {
        return ButtonDele;
    }


    public void initComponents(){
        Label1 = new javax.swing.JLabel();
        Label2 = new javax.swing.JLabel();
        TxtStr = new javax.swing.JTextField();
        TxtResult = new javax.swing.JTextField();
        Button = new javax.swing.JButton();
        ButtonDele = new javax.swing.JButton();

        Label1.setText("Digite la cadena de texto: ");
        Label2.setText("Cadena con espacios: ");
        Button.setText("Procesar");
        ButtonDele.setText("Borrar");

        setLayout(null);
        Label1.setBounds(10,-30,200,150);
        add(Label1);
        Label2.setBounds(10,100,200,150);
        add(Label2);
        Button.setBounds(100,100,100,25);
        add(Button);
        ButtonDele.setBounds(250,100,100,25);
        add(ButtonDele);
        TxtStr.setBounds(160,30,300,25);
        add(TxtStr);
        TxtResult.setBounds(160,160,300,25);
        add(TxtResult);
    }

    private javax.swing.JLabel Label1;
    private javax.swing.JLabel Label2;
    private javax.swing.JTextField TxtResult;
    private javax.swing.JTextField TxtStr;
    private javax.swing.JButton Button;
    private javax.swing.JButton ButtonDele;
}