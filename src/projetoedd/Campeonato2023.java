package projetoedd;

import java.util.ArrayList;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author victo
 */
public class Campeonato2023 extends javax.swing.JFrame {

    ArrayList<Atleta> listaAtletas = new ArrayList<>();
    Pilha pilhaAtletasMulheres = new Pilha();
    Queue filaAtletasHomens = new Queue();
    String msg = "";
    int qtd = 0;
    int qtdbra = 0;
    double acu = 0;
    double acubra = 0;

    /**
     * Creates new form Campeonato2023
     */
    public Campeonato2023() {
        initComponents();
    }

    public String arrumarTexto(String texto) {
        //Arumando nome pais
        String primeiraLetra = texto.substring(0, 1);
        String restoDaString = texto.substring(1).toLowerCase();
        String primeiraLetraMaiuscula = primeiraLetra.toUpperCase();
        texto = primeiraLetraMaiuscula + restoDaString;
        return texto;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtPais = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        rbFeminino = new javax.swing.JRadioButton();
        rbMasculino = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        txtAltura = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        btnListarCadastro = new javax.swing.JButton();
        btnMedia = new javax.swing.JButton();
        btnMaiorMulher = new javax.swing.JButton();
        mediaHomemBra = new javax.swing.JButton();
        btnMostrarPilha = new javax.swing.JButton();
        btnMostrarFila = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        btnAutores = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuAutores = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Campeonato 2023");
        setResizable(false);

        jLabel1.setText("Nome do atleta:");

        jLabel2.setText("País:");

        jLabel3.setText("Sexo:");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        txtPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaisActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        buttonGroup1.add(rbFeminino);
        rbFeminino.setText("Feminino");

        buttonGroup1.add(rbMasculino);
        rbMasculino.setText("Masculino");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbFeminino)
                    .addComponent(rbMasculino))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbFeminino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbMasculino)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jLabel4.setText("Altura:");

        txtAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlturaActionPerformed(evt);
            }
        });

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnListarCadastro.setText("Listar cadastro");
        btnListarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarCadastroActionPerformed(evt);
            }
        });

        btnMedia.setText("Média geral");
        btnMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMediaActionPerformed(evt);
            }
        });

        btnMaiorMulher.setText("Mulher maior altura");
        btnMaiorMulher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaiorMulherActionPerformed(evt);
            }
        });

        mediaHomemBra.setText("Média homens brasileiros");
        mediaHomemBra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mediaHomemBraActionPerformed(evt);
            }
        });

        btnMostrarPilha.setText("Mostrar pilha");
        btnMostrarPilha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarPilhaActionPerformed(evt);
            }
        });

        btnMostrarFila.setText("Mostrar fila");
        btnMostrarFila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarFilaActionPerformed(evt);
            }
        });

        jButton9.setText("Retirar da pilha");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("Retirar da fila");

        txtResultado.setColumns(20);
        txtResultado.setRows(5);
        jScrollPane1.setViewportView(txtResultado);

        jLabel5.setText("cm");

        btnAutores.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAutores.setText("Ver autores");
        btnAutores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutoresActionPerformed(evt);
            }
        });

        jMenu1.setText("Ver");

        menuAutores.setText("Autores");
        menuAutores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAutoresActionPerformed(evt);
            }
        });
        jMenu1.add(menuAutores);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMostrarPilha)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(btnCadastrar))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(btnMostrarFila)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton9))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnListarCadastro)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnMedia)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnMaiorMulher)
                                        .addGap(18, 18, 18)
                                        .addComponent(mediaHomemBra))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 241, Short.MAX_VALUE)
                                        .addComponent(btnAutores))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)))))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnListarCadastro)
                    .addComponent(btnMedia)
                    .addComponent(btnMaiorMulher)
                    .addComponent(mediaHomemBra))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMostrarPilha)
                    .addComponent(btnMostrarFila)
                    .addComponent(jButton9)
                    .addComponent(jButton10)
                    .addComponent(btnAutores))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("");

        setSize(new java.awt.Dimension(870, 627));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaisActionPerformed

    private void txtAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlturaActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed

        String nome = txtNome.getText();
        String pais = txtPais.getText();

        nome = arrumarTexto(nome);
        pais = arrumarTexto(pais);

        Double altura = Double.parseDouble(txtAltura.getText());
        Atleta atleta = new Atleta(nome, pais, altura);
        listaAtletas.add(atleta);
        qtd++;
        acu += atleta.altura;
        if (rbFeminino.isSelected()) {
            pilhaAtletasMulheres.push(atleta);
            atleta.sexo = 'F';

        } else {
            filaAtletasHomens.enqueue(atleta);
            atleta.sexo = 'M';
            if (pais.toLowerCase().equalsIgnoreCase("Brasil")) {
                acubra += atleta.altura;
                qtdbra++;
            }
        }

        txtResultado.setText("Trabalhador cadastrado na fila!");
        LimparCampos();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnMostrarPilhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarPilhaActionPerformed
        msg = "Lista de atletas mulheres\n";
        msg += pilhaAtletasMulheres.toString();
        txtResultado.setText(msg);


    }//GEN-LAST:event_btnMostrarPilhaActionPerformed

    private void btnMostrarFilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarFilaActionPerformed
        //txtResultado.setText(q.toString());
        msg = "Lista de atletas homens\n";
        msg += filaAtletasHomens.toString();
        txtResultado.setText(msg);

    }//GEN-LAST:event_btnMostrarFilaActionPerformed

    private void btnListarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarCadastroActionPerformed
        msg = "Lista de atletas cadastrados \n";
        for (Atleta a : listaAtletas) {
            msg += a + "\n";
        }
        txtResultado.setText(msg);

    }//GEN-LAST:event_btnListarCadastroActionPerformed

    private void btnMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMediaActionPerformed
        double media = (acu / qtd) / 100;
        txtResultado.setText("Média geral: \n " + media + " m");
    }//GEN-LAST:event_btnMediaActionPerformed

    private void btnMaiorMulherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaiorMulherActionPerformed
        double maiorAlturaMulher = 0;
        String NomeMaiorMulher = "";
        for (Atleta atleta : listaAtletas) {
            if (atleta.getSexo() == 'F') {
                if (atleta.getAltura() > maiorAlturaMulher) {
                    maiorAlturaMulher = atleta.getAltura();
                    NomeMaiorMulher = atleta.getNome();
                }
            }
        }
        msg = "Mulher com maior altura: \n";
        msg += NomeMaiorMulher + " é a mulher mais alta com " + (maiorAlturaMulher) / 100 + "cm";
        txtResultado.setText(msg);

    }//GEN-LAST:event_btnMaiorMulherActionPerformed

    private void btnAutoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutoresActionPerformed
        Autores autores = new Autores();
        autores.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAutoresActionPerformed

    private void menuAutoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAutoresActionPerformed
        Autores autores = new Autores();
        autores.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuAutoresActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void mediaHomemBraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mediaHomemBraActionPerformed
        double mediabra = (acubra / qtdbra) / 100;
        txtResultado.setText("Média de altura entre homens brasileiros: \n " + mediabra + " m");
    }//GEN-LAST:event_mediaHomemBraActionPerformed

    public void LimparCampos() {
        txtNome.setText("");
        txtPais.setText("");
        txtAltura.setText("");
        rbFeminino.setSelected(true);
        rbMasculino.setSelected(false);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Campeonato2023.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Campeonato2023.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Campeonato2023.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Campeonato2023.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Campeonato2023().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAutores;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnListarCadastro;
    private javax.swing.JButton btnMaiorMulher;
    private javax.swing.JButton btnMedia;
    private javax.swing.JButton btnMostrarFila;
    private javax.swing.JButton btnMostrarPilha;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mediaHomemBra;
    private javax.swing.JMenuItem menuAutores;
    private javax.swing.JRadioButton rbFeminino;
    private javax.swing.JRadioButton rbMasculino;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPais;
    private javax.swing.JTextArea txtResultado;
    // End of variables declaration//GEN-END:variables
}