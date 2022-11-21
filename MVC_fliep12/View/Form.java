
package View;
public class Form extends javax.swing.JFrame {

    public Form() {
        initComponents();
    }

    public javax.swing.JButton getButton() {
        return Button;
    }

    public javax.swing.JTextField getTxtNum() {
        return TxtNum;
    }

    public javax.swing.JTextField getTxtResult() {
        return TxtResult;
    }

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        TxtNum = new javax.swing.JTextField();
        TxtResult = new javax.swing.JTextField();
        Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Digite Número");

        TxtNum.setToolTipText("");

        Button.setText("Mostrar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(TxtResult, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel1)
                        .addGap(29, 29, 29)
                        .addComponent(TxtNum, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(Button)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TxtNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(TxtResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );

        pack();
    }                                       
    private javax.swing.JButton Button;
    private javax.swing.JTextField TxtNum;
    private javax.swing.JTextField TxtResult;
    private javax.swing.JLabel jLabel1;
}
