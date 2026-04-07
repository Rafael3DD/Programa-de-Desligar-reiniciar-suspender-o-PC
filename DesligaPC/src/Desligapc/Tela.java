package Desligapc;

import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import static java.time.LocalDateTime.now;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.SpinnerNumberModel;
import javax.swing.UIManager;



public class Tela extends javax.swing.JFrame implements Runnable{
    Thread t = new Thread(this);
    Thread acao;
    private volatile boolean cancelado = false;
    private static String hora3;
    private static String minutos3;
    private static String segundos3;
    private static Robot robot = null;
    public Tela() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        hora.setModel(new SpinnerNumberModel(0, 0, 24, 1));
        minuto.setModel(new SpinnerNumberModel(0, 0, 59, 1));
        segundos.setModel(new SpinnerNumberModel(0, 0, 59, 1));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        jButton3.setEnabled(false);
        setIcon();     

        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Desligapc/icon.png")).getImage());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        segundos = new javax.swing.JSpinner();
        minuto = new javax.swing.JSpinner();
        hora = new javax.swing.JSpinner();
        jComboFuncao = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        TempHora = new javax.swing.JLabel();
        TempMinuto = new javax.swing.JLabel();
        TempSeg = new javax.swing.JLabel();
        jLabelhora = new javax.swing.JLabel();
        jLabelminuto = new javax.swing.JLabel();
        jLabesegundos = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 255));

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));
        jPanel2.setName(""); // NOI18N

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 204, 0));
        jButton2.setText("Confirmar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Desligar");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Minutos");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Segundos");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Hora");

        segundos.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        segundos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        minuto.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        minuto.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        hora.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        hora.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jComboFuncao.setBackground(new java.awt.Color(0, 153, 255));
        jComboFuncao.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jComboFuncao.setForeground(new java.awt.Color(255, 255, 255));
        jComboFuncao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Desligar", "Reiniciar", "Suspender" }));
        jComboFuncao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboFuncaoActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));

        TempHora.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TempHora.setForeground(new java.awt.Color(255, 255, 255));
        TempHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TempHora.setText("Horas");

        TempMinuto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TempMinuto.setForeground(new java.awt.Color(255, 255, 255));
        TempMinuto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TempMinuto.setText("Minutos");

        TempSeg.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TempSeg.setForeground(new java.awt.Color(255, 255, 255));
        TempSeg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TempSeg.setText("Segundos");

        jLabelhora.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelhora.setForeground(new java.awt.Color(255, 255, 255));
        jLabelhora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelhora.setText("00");

        jLabelminuto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelminuto.setForeground(new java.awt.Color(255, 255, 255));
        jLabelminuto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelminuto.setText("00");

        jLabesegundos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabesegundos.setForeground(new java.awt.Color(255, 255, 255));
        jLabesegundos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabesegundos.setText("00");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText(":");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText(":");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TempHora, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(jLabelhora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelminuto, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TempMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TempSeg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabesegundos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TempHora)
                    .addComponent(TempMinuto)
                    .addComponent(TempSeg))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelhora)
                    .addComponent(jLabesegundos)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabelminuto))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 0, 0));
        jButton3.setText("Cancelar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(hora)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(minuto, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(segundos, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(50, 50, 50))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addGap(11, 11, 11)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(minuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(segundos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hora))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        hora.setEnabled(false);
        minuto.setEnabled(false);
        segundos.setEnabled(false);
        jComboFuncao.setEnabled(false);
        jButton2.setEnabled(false);
        jButton3.setEnabled(true);
        
        int horr = Integer.parseInt(hora.getValue().toString());
        int minn = Integer.parseInt(minuto.getValue().toString());
        int segg = Integer.parseInt(segundos.getValue().toString());
        
        
        if(horr ==0 && segg == 0 && minn == 0){
            jButton2.setEnabled(true);
            return;
        }
            
        cancelado = false;
        
        acao = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                   robot = new Robot();
                } catch (AWTException e) {
                   e.printStackTrace();
                }
                
                TimeZone.setDefault(TimeZone.getTimeZone("GMT-03:00"));
                String hor = (String) hora.getValue().toString();
                String min = (String) minuto.getValue().toString();
                String seg = (String) segundos.getValue().toString();
               
                int horas  = Integer.parseInt(hor);
                int minutos = Integer.parseInt(min);
                int segs   = Integer.parseInt(seg);
              
                long tempoTotalMs = (horas * 3600000L) + (minutos * 60000L) + (segs * 1000L);

                if (tempoTotalMs == 0) {
                    return;
                }
                long tempoRestante = tempoTotalMs;
                
                while (tempoRestante > 0 && !cancelado) {
                    long sleepTime = Math.min(1000, tempoRestante);
                    try {
                        Thread.sleep(sleepTime);
                    } catch (InterruptedException ex) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    tempoRestante -= sleepTime;
                }
                if (cancelado) {
                    System.out.println("Ação cancelada pelo usuário.");
                    return;
                }
                
                try {
                    String comando = "";
                    if(jComboFuncao.getSelectedItem() == "Desligar"){
                        comando = "desligar";
                        Runtime.getRuntime().exec("shutdown -s -f -t 3");
     
                    }else if(jComboFuncao.getSelectedItem() == "Reiniciar"){
                        comando = " Reiniciar";
                        Runtime.getRuntime().exec("shutdown -r -f -t 3");
                        
                    }else if (jComboFuncao.getSelectedItem() == "Suspender"){
                        comando =" Suspender";
                        Runtime.getRuntime().exec("rundll32.exe powrprof.dll,SetSuspendState 0,1,0");
                    }
                    
                    if (!comando.isEmpty()) {
                        Runtime.getRuntime().exec(comando);
                        comando = "Comando executado: " + comando;
                    }
                } catch (IOException ex) {
                    Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
                }

                try{
                    LocalDateTime localDateTime = LocalDateTime.now();
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss dd/MM/yyyy");
                    String dateTime = dtf.format(localDateTime);

                    try(FileWriter fw = new FileWriter("desligado.txt", true);
                        PrintWriter pw = new PrintWriter(fw)) {
                        pw.println("Desligado as: " + dateTime);
                    }
                }catch(Exception e){
                    System.out.println("erro ao escrever log!\n");
                }


            }
        });
        acao.setDaemon(true);
        acao.start();
        t.start();
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboFuncaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboFuncaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboFuncaoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        cancelado = true;
        try {
            Runtime.getRuntime().exec("shutdown -a");
            System.out.println("Shutdown abortado com sucesso");
        } catch (IOException ex) {
            System.out.println("Não foi possível abortar o shutdown");
        }
        
        if (acao != null && acao.isAlive()) {
            acao.interrupt();
        }
        if (t != null && t.isAlive()) {
            t.interrupt();
        }
        
        this.dispose();
        Tela tel = new Tela();
        tel.setVisible(true);

    }//GEN-LAST:event_jButton3ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
  
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TempHora;
    private javax.swing.JLabel TempMinuto;
    private javax.swing.JLabel TempSeg;
    private javax.swing.JSpinner hora;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboFuncao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelhora;
    private javax.swing.JLabel jLabelminuto;
    private javax.swing.JLabel jLabesegundos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSpinner minuto;
    private javax.swing.JSpinner segundos;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the hora3
     */
    public static String getHora3() {
        return hora3;
    }

    /**
     * @param aHora3 the hora3 to set
     */
    public static void setHora3(String aHora3) {
        hora3 = aHora3;
    }

    /**
     * @return the minutos3
     */
    public static String getMinutos3() {
        return minutos3;
    }

    /**
     * @param aMinutos3 the minutos3 to set
     */
    public static void setMinutos3(String aMinutos3) {
        minutos3 = aMinutos3;
    }

    /**
     * @return the segundos3
     */
    public static String getSegundos3() {
        return segundos3;
    }

    /**
     * @param aSegundos3 the segundos3 to set
     */
    public static void setSegundos3(String aSegundos3) {
        segundos3 = aSegundos3;
    }

    @Override
    public void run() {
        int i = 1; //segundos
        int m = 1; // minutos
        int h =1; //hora
        
        
        
        while(true){
          
              try { 
                  Thread.sleep (1000);
              }catch (InterruptedException ex) {
              }  
                if(i<10){
                    jLabesegundos.setText("0"+Integer.toString(i));
                }else
                    jLabesegundos.setText(Integer.toString(i)); // segundos
                    //System.out.println(i);
                    i++;    
                if(i ==60){
                    if(m <10){
                        jLabelminuto.setText("0"+Integer.toString(m));
                    }else
                        jLabelminuto.setText(Integer.toString(m)); //minutos                
                    i=0;
                    m += 1;
                 if(m ==60){
                     jLabelhora.setText(Integer.toString(h)); // hora
                     m =0;
                     h += 1;   
                 }
                 if( h == 24){
                     h=0;
                 }
               }
               
        }
    }

    //insere icone
    private void setIcon() {
    setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
    }

}
