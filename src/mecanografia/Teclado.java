/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mecanografia;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.Timer;

/**
 *
 * @author HP
 */
public class Teclado extends javax.swing.JFrame {

    private Timer colorTimer;
    private JButton btnPresionado;
    private String oracion = "";

    public Teclado() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setFocusable(true);
        colorTimer = new Timer(80, e -> resetearColor()); // Timer para controlar el parpadeo

    }

    private void cambiarColorTemporizado() {
        btnPresionado.setBackground(Color.RED);
        colorTimer.start();
    }

    private void resetearColor() {
        btnPresionado.setBackground(null);
        colorTimer.stop();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnEnter = new javax.swing.JButton();
        btnTab = new javax.swing.JButton();
        btnW = new javax.swing.JButton();
        btnQ = new javax.swing.JButton();
        btnA = new javax.swing.JButton();
        btnD = new javax.swing.JButton();
        btnS = new javax.swing.JButton();
        btnK = new javax.swing.JButton();
        btnP = new javax.swing.JButton();
        btnO = new javax.swing.JButton();
        btnI = new javax.swing.JButton();
        btnU = new javax.swing.JButton();
        btnY = new javax.swing.JButton();
        btnT = new javax.swing.JButton();
        btnR = new javax.swing.JButton();
        btnX = new javax.swing.JButton();
        btnÑ = new javax.swing.JButton();
        btnZ = new javax.swing.JButton();
        btnL = new javax.swing.JButton();
        btnH = new javax.swing.JButton();
        btnF = new javax.swing.JButton();
        btnJ = new javax.swing.JButton();
        btnE = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnV = new javax.swing.JButton();
        btnG = new javax.swing.JButton();
        btnB = new javax.swing.JButton();
        btnN = new javax.swing.JButton();
        btnEspacio = new javax.swing.JButton();
        btnM = new javax.swing.JButton();
        btn40 = new javax.swing.JButton();
        btnBorrar1 = new javax.swing.JButton();
        btnMayus = new javax.swing.JButton();
        btnControl = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtOracion = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btn1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn1.setText("1");

        btn2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn2.setText("2");

        btn3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn3.setText("3");

        btn4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn4.setText("4");

        btn5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn5.setText("5");

        btn6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn6.setText("6");

        btn7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn7.setText("7");

        btn8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn9.setText("9");

        btn0.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn0.setText("0");

        btnEnter.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEnter.setText("Intro");

        btnTab.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnTab.setText("Tab");

        btnW.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnW.setText("W");

        btnQ.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnQ.setText("Q");

        btnA.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnA.setText("A");

        btnD.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnD.setText("D");

        btnS.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnS.setText("S");

        btnK.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnK.setText("K");

        btnP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnP.setText("P");

        btnO.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnO.setText("O");

        btnI.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnI.setText("I");

        btnU.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnU.setText("U");

        btnY.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnY.setText("Y");

        btnT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnT.setText("T");

        btnR.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnR.setText("R");

        btnX.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnX.setText("X");

        btnÑ.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnÑ.setText("Ñ");

        btnZ.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnZ.setText("Z");

        btnL.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnL.setText("L");

        btnH.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnH.setText("H");

        btnF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnF.setText("F");

        btnJ.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnJ.setText("J");

        btnE.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnE.setText("E");

        btnC.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnC.setText("C");

        btnV.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnV.setText("V");
        btnV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVActionPerformed(evt);
            }
        });

        btnG.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnG.setText("G");

        btnB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnB.setText("B");

        btnN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnN.setText("N");

        btnEspacio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEspacio.setText("ESPACIO");

        btnM.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnM.setText("M");

        btn40.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn40.setText("Mayus");

        btnBorrar1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBorrar1.setText("Delete");

        btnMayus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnMayus.setText("Shift");

        btnControl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnControl.setText("Ctrl");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnControl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEspacio, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn40)
                                    .addComponent(btnTab, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnA)
                                    .addComponent(btnQ)))
                            .addComponent(btnMayus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnS)
                                    .addComponent(btnW))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnD)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnF)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnG)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnH)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnJ)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnK)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnL)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnÑ))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnR)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnT)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnY)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnU)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnI)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnO)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnP))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btnZ)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnX)
                                .addGap(18, 18, 18)
                                .addComponent(btnC)
                                .addGap(18, 18, 18)
                                .addComponent(btnV)
                                .addGap(18, 18, 18)
                                .addComponent(btnB)
                                .addGap(18, 18, 18)
                                .addComponent(btnN)
                                .addGap(18, 18, 18)
                                .addComponent(btnM)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnEnter)
                            .addComponent(btnBorrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTab, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnW, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnQ, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnR, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnT, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnY, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnU, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnI, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnO, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnP, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnE, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnA, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnS, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnD, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnF, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnH, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnJ, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnK, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnL, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnÑ, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnG, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn40, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEnter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnZ, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnX, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnC, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnV, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnB, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnN, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnM, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMayus, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEspacio, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnControl, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        txtOracion.setColumns(20);
        txtOracion.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        txtOracion.setLineWrap(true);
        txtOracion.setRows(5);
        txtOracion.setFocusable(false);
        jScrollPane1.setViewportView(txtOracion);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed

        char letra = evt.getKeyChar();

        if (Character.isLetter(letra) || letra == ' ') {

            if (Character.isSpaceChar(letra)) {
                btnPresionado = this.btnEspacio;
                cambiarColorTemporizado();
            }

            if (letra == 'A' || letra == 'a') {
                btnPresionado = this.btnA;
                cambiarColorTemporizado();
            }
            if (letra == 'B' || letra == 'b') {
                btnPresionado = this.btnB;
                cambiarColorTemporizado();
            }
            if (letra == 'C' || letra == 'c') {
                btnPresionado = this.btnC;
                cambiarColorTemporizado();
            }
            if (letra == 'D' || letra == 'd') {
                btnPresionado = this.btnD;
                cambiarColorTemporizado();
            }
            if (letra == 'E' || letra == 'e') {
                btnPresionado = this.btnE;
                cambiarColorTemporizado();
            }
            if (letra == 'F' || letra == 'f') {
                btnPresionado = this.btnF;
                cambiarColorTemporizado();
            }
            if (letra == 'G' || letra == 'g') {
                btnPresionado = this.btnG;
                cambiarColorTemporizado();
            }
            if (letra == 'H' || letra == 'h') {
                btnPresionado = this.btnH;
                cambiarColorTemporizado();
            }
            if (letra == 'I' || letra == 'i') {
                btnPresionado = this.btnI;
                cambiarColorTemporizado();
            }
            if (letra == 'J' || letra == 'j') {
                btnPresionado = this.btnJ;
                cambiarColorTemporizado();
            }
            if (letra == 'K' || letra == 'k') {
                btnPresionado = this.btnK;
                cambiarColorTemporizado();
            }
            if (letra == 'L' || letra == 'l') {
                btnPresionado = this.btnL;
                cambiarColorTemporizado();
            }
            if (letra == 'M' || letra == 'm') {
                btnPresionado = this.btnM;
                cambiarColorTemporizado();
            }
            if (letra == 'N' || letra == 'n') {
                btnPresionado = this.btnN;
                cambiarColorTemporizado();
            }
            if (letra == 'Ñ' || letra == 'ñ') {
                btnPresionado = this.btnÑ;
                cambiarColorTemporizado();
            }
            if (letra == 'O' || letra == 'o') {
                btnPresionado = this.btnO;
                cambiarColorTemporizado();
            }
            if (letra == 'P' || letra == 'p') {
                btnPresionado = this.btnP;
                cambiarColorTemporizado();
            }
            if (letra == 'Q' || letra == 'q') {
                btnPresionado = this.btnQ;
                cambiarColorTemporizado();
            }
            if (letra == 'R' || letra == 'r') {
                btnPresionado = this.btnR;
                cambiarColorTemporizado();
            }
            if (letra == 'S' || letra == 's') {
                btnPresionado = this.btnS;
                cambiarColorTemporizado();
            }
            if (letra == 'T' || letra == 't') {
                btnPresionado = this.btnT;
                cambiarColorTemporizado();
            }
            if (letra == 'U' || letra == 'U') {
                btnPresionado = this.btnU;
                cambiarColorTemporizado();
            }
            if (letra == 'V' || letra == 'v') {
                btnPresionado = this.btnV;
                cambiarColorTemporizado();
            }
            if (letra == 'W' || letra == 'w') {
                btnPresionado = this.btnW;
                cambiarColorTemporizado();
            }
            if (letra == 'X' || letra == 'x') {
                btnPresionado = this.btnX;
                cambiarColorTemporizado();
            }
            if (letra == 'Y' || letra == 'y') {
                btnPresionado = this.btnY;
                cambiarColorTemporizado();
            }
            if (letra == 'Z' || letra == 'z') {
                btnPresionado = this.btnZ;
                cambiarColorTemporizado();
            }

            oracion = oracion + letra;

            this.txtOracion.setText(oracion.toUpperCase());
        }


    }//GEN-LAST:event_formKeyPressed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn8ActionPerformed

    private void btnVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVActionPerformed

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
            java.util.logging.Logger.getLogger(Teclado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Teclado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Teclado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Teclado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Teclado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn40;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnA;
    private javax.swing.JButton btnB;
    private javax.swing.JButton btnBorrar1;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnControl;
    private javax.swing.JButton btnD;
    private javax.swing.JButton btnE;
    private javax.swing.JButton btnEnter;
    private javax.swing.JButton btnEspacio;
    private javax.swing.JButton btnF;
    private javax.swing.JButton btnG;
    private javax.swing.JButton btnH;
    private javax.swing.JButton btnI;
    private javax.swing.JButton btnJ;
    private javax.swing.JButton btnK;
    private javax.swing.JButton btnL;
    private javax.swing.JButton btnM;
    private javax.swing.JButton btnMayus;
    private javax.swing.JButton btnN;
    private javax.swing.JButton btnO;
    private javax.swing.JButton btnP;
    private javax.swing.JButton btnQ;
    private javax.swing.JButton btnR;
    private javax.swing.JButton btnS;
    private javax.swing.JButton btnT;
    private javax.swing.JButton btnTab;
    private javax.swing.JButton btnU;
    private javax.swing.JButton btnV;
    private javax.swing.JButton btnW;
    private javax.swing.JButton btnX;
    private javax.swing.JButton btnY;
    private javax.swing.JButton btnZ;
    private javax.swing.JButton btnÑ;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtOracion;
    // End of variables declaration//GEN-END:variables
}
