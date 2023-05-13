package Ordenacao;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Alexandre
 */
public class FrmAlgoritmos extends javax.swing.JFrame {

    private int vetor[];
    int vBuble[] = null, vInsertion[] = null, vSelection[] = null, vQuickSort[] = null;

    public FrmAlgoritmos() {
        initComponents();
    }

    public void CalcularTempo() {

        long tempIni, tempFim;

        String result = "Resultado em Milisegundos";
        Algoritmos algo = new Algoritmos();

        // Teste em milisegundos para algoritimo InsertionSort
        if (chechBubleSort.isSelected()) {
            tempIni = System.currentTimeMillis();
            vBuble = algo.BubbleSort(vetor);
            tempFim = System.currentTimeMillis();
            result += "\n1. BubleSort: " + (tempFim - tempIni) + " ms";
        }

        // Teste em milisegundos para algoritimo BubbleSort
        if (checkInsertSort.isSelected()) {
            tempIni = System.currentTimeMillis();
            vInsertion = algo.InsertionSort(vetor);
            tempFim = System.currentTimeMillis();
            result += "\n2. InsertSort: " + (tempFim - tempIni) + " ms";
        }

        // Teste em milisegundos para algoritimo SelectionSort
        if (checkSelectionSort.isSelected()) {
            tempIni = System.currentTimeMillis();
            vSelection = algo.SelectionSort(vetor);
            tempFim = System.currentTimeMillis();
            result += "\n3. SelectionSort: " + (tempFim - tempIni) + " ms";
        }

        // Teste em milisegundos para algoritimo SelectionSort
        if (checkSelectionSort.isSelected()) {
            tempIni = System.currentTimeMillis();
//          algo.QuickSort(vetor, 0, vetor.length);
            tempFim = System.currentTimeMillis();
            result += "\n4. QuickSort: " + (tempFim - tempIni) + " ms";
        }

        txtLogs.setText(result);

    }

    public void habilita(boolean op) {

        chechBubleSort.setEnabled(op);
        checkInsertSort.setEnabled(op);
        checkSelectionSort.setEnabled(op);
        checkQuickSort.setEnabled(op);
        btCalcular.setEnabled(op);
        btLimpar.setEnabled(op);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        checkInsertSort = new javax.swing.JCheckBox();
        checkSelectionSort = new javax.swing.JCheckBox();
        chechBubleSort = new javax.swing.JCheckBox();
        checkQuickSort = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtLogs = new javax.swing.JTextArea();
        jsQuant = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btCalcular = new javax.swing.JButton();
        btPreencherVetor = new javax.swing.JButton();
        cbTipo = new javax.swing.JComboBox<>();
        btLimpar = new javax.swing.JButton();
        tfvOrdenados = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jProgressBar1 = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora de Tempo (Algoritmos de Ordenação)");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        checkInsertSort.setText("2. Insert Sort");
        checkInsertSort.setEnabled(false);

        checkSelectionSort.setText("3. Selection Sort");
        checkSelectionSort.setEnabled(false);

        chechBubleSort.setText("1. Buble Sort");
        chechBubleSort.setEnabled(false);

        checkQuickSort.setText("4. Quick Sort");
        checkQuickSort.setEnabled(false);

        txtLogs.setEditable(false);
        txtLogs.setColumns(20);
        txtLogs.setRows(5);
        txtLogs.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultados", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jScrollPane1.setViewportView(txtLogs);

        jLabel1.setText("Preencher Vetor de");

        jLabel2.setText("com números");

        btCalcular.setText("Calcular Tempo");
        btCalcular.setEnabled(false);
        btCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCalcularActionPerformed(evt);
            }
        });

        btPreencherVetor.setText("Preencher");
        btPreencherVetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPreencherVetorActionPerformed(evt);
            }
        });

        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aleatorios", "Ordenados", "Decrescentes" }));

        btLimpar.setText("Limpar tela");
        btLimpar.setEnabled(false);
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CALCULADORA DE TEMPO P/ ALGORITMOS DE ORDENAÇÃO");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("1º --> Selecione o tamanho Vetor e o tipo de preenchimento");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("2º --> Selecione os tipos de algoritmos que serão utilizados para ordenação ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("3º --> Funções");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(tfvOrdenados)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(btCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(chechBubleSort)
                                .addGap(39, 39, 39)
                                .addComponent(checkInsertSort)
                                .addGap(46, 46, 46)
                                .addComponent(checkSelectionSort)
                                .addGap(26, 26, 26)
                                .addComponent(checkQuickSort))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jsQuant, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btPreencherVetor, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jsQuant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPreencherVetor))
                .addGap(9, 9, 9)
                .addComponent(tfvOrdenados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkInsertSort)
                    .addComponent(checkSelectionSort)
                    .addComponent(checkQuickSort)
                    .addComponent(chechBubleSort))
                .addGap(19, 19, 19)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(btCalcular)
                    .addComponent(btLimpar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        // TODO add your handling code here:
        txtLogs.setText("");
    }//GEN-LAST:event_btLimparActionPerformed

    private void btPreencherVetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPreencherVetorActionPerformed
        // TODO add your handling code here:

        int qnt = (Integer) jsQuant.getValue();

        if (qnt > 0) {
            vetor = new int[qnt];
            switch (cbTipo.getSelectedIndex()) {
                case 0:
                    //Preenche o vetor com sequencia de numeros aleatórios
                    for (int i = 0; i < vetor.length; i++) {
                        vetor[i] = (int) (Math.random() * qnt);
                    }
                    break;
                case 1:
                    //Preenche o vetor com sequencia de numeros ordenados
                    for (int i = 0; i < vetor.length; i++) {
                        vetor[i] = i;
                    }
                    break;
                case 2:
                    //Preenche o vetor com sequencia de numeros decrescente
                    int tam = qnt;
                    for (int i = 0; i < vetor.length; i++) {
                        vetor[i] = tam;
                        tam--;
                    }
                    break;
            }

            JOptionPane.showMessageDialog(null, "Vetor preenchido com " + qnt + "\nnumeros " + cbTipo.getSelectedItem() + "!");
            tfvOrdenados.setText(Arrays.toString(vetor));
            habilita(true);
        }

    }//GEN-LAST:event_btPreencherVetorActionPerformed

    private void btCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCalcularActionPerformed

        if (chechBubleSort.isSelected() || checkInsertSort.isSelected() || checkSelectionSort.isSelected()) {

            CalcularTempo();

            int op = JOptionPane.showConfirmDialog(null, "Mostrar vetores ordenados?", "Mostrar", JOptionPane.YES_NO_OPTION);

            if (op == JOptionPane.YES_OPTION) {

                txtLogs.append("\nVetores Ordenados\n");
                txtLogs.append("1. BubbleSort - " + Arrays.toString(vBuble) + "\n");
                txtLogs.append("2. InsertionSort - " + Arrays.toString(vInsertion) + "\n");
                txtLogs.append("3. SelectionSort - " + Arrays.toString(vSelection) + "\n");
                txtLogs.append("4. QuickSort - " + Arrays.toString(vQuickSort) + "\n");

            }

        } else {
            JOptionPane.showMessageDialog(null, "Selecione pelo menos 1 Algoritmo?");
        }
    }//GEN-LAST:event_btCalcularActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAlgoritmos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FrmAlgoritmos().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCalcular;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btPreencherVetor;
    private javax.swing.JComboBox<String> cbTipo;
    private javax.swing.JCheckBox chechBubleSort;
    private javax.swing.JCheckBox checkInsertSort;
    private javax.swing.JCheckBox checkQuickSort;
    private javax.swing.JCheckBox checkSelectionSort;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSpinner jsQuant;
    private javax.swing.JTextField tfvOrdenados;
    private javax.swing.JTextArea txtLogs;
    // End of variables declaration//GEN-END:variables
}
