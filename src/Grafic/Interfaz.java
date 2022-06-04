package Grafic;

import Principal.Lexer;
import Principal.parser;
import java.awt.Color;
import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;
import java_cup.runtime.Scanner;
import javax.crypto.AEADBadTagException;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Interfaz extends javax.swing.JFrame {

    public static String Dato = "";
    public static String NomArch = "";
    Boolean Editable = true;
    Scanner obj = null;
    File archivo = new File("");
    DefaultListModel Salida = new DefaultListModel();
    DefaultListModel Sintactico = new DefaultListModel();
    DefaultListModel Lexico = new DefaultListModel();
    DefaultListModel Semantico = new DefaultListModel();

    public Interfaz() {
        initComponents();
        memoria();
        jTextArea1.setBackground(Color.white);
        jTextArea1.setEditable(true);

        lista();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListSemantico = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListLexico = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jListSintactico = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        jListSalida = new javax.swing.JList<>();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Compiladores");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(756, 513));
        setMinimumSize(new java.awt.Dimension(756, 513));
        setResizable(false);
        setSize(new java.awt.Dimension(756, 513));
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(756, 533));
        jPanel1.setMinimumSize(new java.awt.Dimension(756, 533));
        jPanel1.setPreferredSize(new java.awt.Dimension(756, 533));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/editar.png"))); // NOI18N
        jButton2.setText("Editar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 90, 30));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/programacion-web.png"))); // NOI18N
        jButton1.setText("Compilar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 110, 30));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 430, 490));

        jListSemantico.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jListSemantico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListSemanticoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jListSemantico);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 300, 130, 160));

        jLabel1.setText("Errores Lexicos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, -1, -1));

        jLabel2.setText("Errores Semanticos");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 280, -1, -1));

        jLabel3.setText("Errores Sintacticos");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 90, -1, -1));

        jLabel4.setText("HTML de Salida");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, -1, -1));

        jListLexico.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jListLexico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListLexicoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jListLexico);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, 130, 160));

        jListSintactico.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jListSintactico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListSintacticoMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jListSintactico);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 110, 130, 140));

        jListSalida.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jListSalida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListSalidaMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jListSalida);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 130, 140));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/guardar-el-archivo.png"))); // NOI18N
        jButton3.setText("Guardar .txt");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, -1, 30));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/limpiar.png"))); // NOI18N
        jButton4.setText("Limpiar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 50, -1, 30));

        getContentPane().add(jPanel1);

        jMenu2.setText("Archivo");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/carpeta-abierta.png"))); // NOI18N
        jMenuItem1.setText("Abrir Archivo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Resultados");

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/html.png"))); // NOI18N
        jMenuItem2.setText("Abrir HTML");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Ayuda");

        jMenuItem4.setText("Manual de Usuario");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem4);

        jMenuItem5.setText("Manual Tecnico");
        jMenu4.add(jMenuItem5);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/acerca-de.png"))); // NOI18N
        jMenuItem3.setText("Acerca de");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem3);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        File file1 = new File("C:\\memory\\Salida\\" + NomArch + "-lexicos.html");
        if (file1.exists() && !file1.isDirectory()) {
            if (Editable) {
                int input = JOptionPane.showConfirmDialog(null, "Desea Guardar los doc html con un nombre diferente?");

                if (input == 0) {
                    Dato = jTextArea1.getText();
                    Guardar guardar = new Guardar();
                    guardar.setVisible(true);
                } else if (input == 1) {
                    try {
                        guarda();
                        parser p = new parser(new Lexer(new FileReader("C:\\memory\\Entrada\\temporal.txt")));

                        Object result = p.parse().value;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                } else if (input == 3) {
                }

            } else {
                try {
                    parser p = new parser(new Lexer(new FileReader(archivo)));

                    Object result = p.parse().value;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        } else {
            Dato = jTextArea1.getText();
            Guardar guardar = new Guardar();
            guardar.setVisible(true);
        }

        lista();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        jTextArea1.setText("");
        JFileChooser selectorArchivos = new JFileChooser();

        String currentPath = Paths.get("c:/memory/Entrada").toAbsolutePath().normalize().toString();
        selectorArchivos.setCurrentDirectory(new File(currentPath));

        selectorArchivos.setFileSelectionMode(JFileChooser.FILES_ONLY);

        int resultado = selectorArchivos.showOpenDialog(this);

        if (resultado == JFileChooser.APPROVE_OPTION) {
            archivo = selectorArchivos.getSelectedFile();

            String[] Sp = String.valueOf(archivo).split("\\\\");
            String Nom = Sp[3];
            String[] sp1 = Nom.split("\\.");
            NomArch = sp1[0];

            if ((archivo == null) || (archivo.getName().equals(""))) {
                JOptionPane.showMessageDialog(this, "Error al cargar fichero", "Nombre de archivo inválido", JOptionPane.ERROR_MESSAGE);
            }

            try {
                BufferedReader obj = new BufferedReader(new FileReader(archivo));

                String strng;
                while ((strng = obj.readLine()) != null) {
                    jTextArea1.setText(jTextArea1.getText() + strng + "\n");
                    jTextArea1.setBackground(new Color(178, 255, 255));
                    jTextArea1.setEditable(false);
                    Editable = false;
                }
            } catch (Exception e) {
            }
            jTextArea1.setEditable(false);
            Editable = false;
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        archivo = new File("");
        jTextArea1.setEditable(true);
        Editable = true;
        jTextArea1.setBackground(Color.white);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jListSemanticoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListSemanticoMouseClicked
        System.out.println(jListSemantico.getSelectedValue());

        String url = "file:///C:/memory/Salida/" + jListSemantico.getSelectedValue() + "-semanticos.html";
        String osName = System.getProperty("os.name");
        try {
            if (osName.startsWith("Windows")) {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + url);
            }
        } catch (Exception e) {
        }

    }//GEN-LAST:event_jListSemanticoMouseClicked

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        JFileChooser selectorArchivos = new JFileChooser();
        File arch = new File("");
        String currentPath = Paths.get("Desktop").toAbsolutePath().normalize().toString();
        selectorArchivos.setCurrentDirectory(new File(currentPath));

        selectorArchivos.setFileSelectionMode(JFileChooser.FILES_ONLY);

        int resultado = selectorArchivos.showOpenDialog(this);

        if (resultado == JFileChooser.APPROVE_OPTION) {
            arch = selectorArchivos.getSelectedFile();

            if ((arch == null) || (arch.getName().equals(""))) {
                JOptionPane.showMessageDialog(this, "Error al cargar fichero", "Nombre de archivo inválido", JOptionPane.ERROR_MESSAGE);
            }

            String url = String.valueOf(arch);
            String osName = System.getProperty("os.name");
            try {
                if (osName.startsWith("Windows")) {
                    Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + url);
                }
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        String url = "https://drive.google.com/file/d/1AaWicvM5jBn9pUo2GOs4CZMYoPC8HtPJ/view?usp=sharing" + jListSintactico.getSelectedValue() + "-sintacticos.html";
        String osName = System.getProperty("os.name");
        try {
            if (osName.startsWith("Windows")) {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + url);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jListLexicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListLexicoMouseClicked
        String url = "file:///C:/memory/Salida/" + jListLexico.getSelectedValue() + "-lexicos.html";
        String osName = System.getProperty("os.name");
        try {
            if (osName.startsWith("Windows")) {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + url);
            }
        } catch (Exception e) {
        }

    }//GEN-LAST:event_jListLexicoMouseClicked

    private void jListSintacticoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListSintacticoMouseClicked
        String url = "file:///C:/memory/Salida/" + jListSintactico.getSelectedValue() + "-sintacticos.html";
        String osName = System.getProperty("os.name");
        try {
            if (osName.startsWith("Windows")) {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + url);
            }
        } catch (Exception e) {
        }

    }//GEN-LAST:event_jListSintacticoMouseClicked

    private void jListSalidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListSalidaMouseClicked
        String url = "file:///C:/memory/Salida/" + jListSalida.getSelectedValue() + "-Salida.html";
        String osName = System.getProperty("os.name");
        try {
            if (osName.startsWith("Windows")) {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + url);
            }
        } catch (Exception e) {
        }

    }//GEN-LAST:event_jListSalidaMouseClicked

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        AcercaD Acerca = new AcercaD();
        Acerca.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        String m = JOptionPane.showInputDialog(null, "Escribe el nombre del .txt",
                "Guardar", JOptionPane.INFORMATION_MESSAGE);

        if (!m.equals("")) {
            try {
                File ar = new File("C:\\memory\\Entrada\\" + m + ".txt");
                FileWriter fw = new FileWriter(ar, true);

                String linea = jTextArea1.getText();
                fw.write(linea);
                fw.close();
                //Llama a los metodos que generan el html
                parser p = new parser(new Lexer(new FileReader(ar)));
                Object result = p.parse().value;

            } catch (Exception e) {
            }

        }


    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "¿Estas seguro de que desea limpiar?", "Alerta!", JOptionPane.YES_NO_OPTION);
        if (resp == 0) {
            jTextArea1.setText("");
        }

    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jListLexico;
    private javax.swing.JList<String> jListSalida;
    private javax.swing.JList<String> jListSemantico;
    private javax.swing.JList<String> jListSintactico;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

    private void memoria() {
        File memory = new File("c:/memory");
        File entrada = new File("c:/memory/Entrada");
        File salida = new File("c:/memory/Salida");
        //C:\memory
        if (!memory.exists()) {
            memory.mkdirs();
        }
        if (!entrada.exists()) {
            entrada.mkdirs();
        }
        if (!salida.exists()) {
            salida.mkdirs();
        }
    }

    public String lista() {
        LimpiarModelos();
        File carpeta = new File("C:\\memory\\Salida");
        File[] archivos;
        if (carpeta.exists()) {
            if (carpeta.isDirectory()) {
                archivos = carpeta.listFiles();
                for (int i = 0; i < archivos.length; i++) {
                    String[] Sepa = String.valueOf(archivos[i].getName()).split("\\-");

                    if (archivos[i].getName().endsWith("lexicos.html")) {
                        Lexico.addElement(Sepa[0]);
                    } else if (archivos[i].getName().endsWith("Salida.html")) {
                        Salida.addElement(Sepa[0]);
                    } else if (archivos[i].getName().endsWith("semanticos.html")) {
                        Semantico.addElement(Sepa[0]);
                    } else if (archivos[i].getName().endsWith("sintacticos.html")) {
                        Sintactico.addElement(Sepa[0]);
                    }
                }
                jListSemantico.setModel(Semantico);
                jListSintactico.setModel(Sintactico);
                jListSalida.setModel(Salida);
                jListLexico.setModel(Lexico);
            }

        }
        return "yes";
    }

    private void LimpiarModelos() {
        Semantico.clear();
        Lexico.clear();
        Salida.clear();
        Sintactico.clear();
    }

    private void guarda() {
        try {

            File ar = new File("C:\\memory\\Entrada\\temporal.txt");
            FileWriter fw = new FileWriter(ar, true);

            String linea = jTextArea1.getText();
            fw.write(linea);
            fw.close();
            //Llama a los metodos que generan el html
            parser p = new parser(new Lexer(new FileReader(ar)));
            Object result = p.parse().value;

        } catch (Exception e) {
        }

    }

}
