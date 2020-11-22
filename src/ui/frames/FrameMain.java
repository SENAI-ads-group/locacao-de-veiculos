package ui.frames;

import java.awt.Dimension;
import javafx.embed.swing.JFXPanel;
import javax.swing.JPanel;
import ui.panels.PanelSubMenuCadastro;

/**
 *
 * @author Patrick-Ribeiro
 */
public class FrameMain extends javax.swing.JFrame {

    private boolean showingSubMenu = false;

    public FrameMain() {
        initComponents();
    }

    private void hideSubMenu() {
        panelMenu.setPreferredSize(new Dimension(150, panelSubMenu.getHeight())); //esconde o menu
        showingSubMenu = false;
    }

    private void showSubMenu(JPanel subMenu) {
        
        /*//javax.swing.border.SDropShadowBorder shadow = new DropShadowBorder();
        shadow.setShadowColor(Color.BLACK);
        shadow.setShowLeftShadow(true);
        shadow.setShowRightShadow(true);
        shadow.setShowBottomShadow(true);
        shadow.setShowTopShadow(true);
        this.setBorder(shadow);*/
        
        
        
        panelMenu.setPreferredSize(new Dimension(300, panelSubMenu.getHeight()));
        panelSubMenu.removeAll();
        panelSubMenu.repaint();
        panelSubMenu.revalidate();
        panelSubMenu.add(subMenu);
        panelSubMenu.repaint();
        panelSubMenu.revalidate();
        showingSubMenu = true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMenu = new javax.swing.JPanel();
        panelMenuIcon = new javax.swing.JPanel();
        buttonDashboard = new javax.swing.JButton();
        buttonCadastro = new javax.swing.JButton();
        buttonRelatorios = new javax.swing.JButton();
        buttonConfiguracoes = new javax.swing.JButton();
        panelSubMenu = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Locação de Veículos");
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(800, 600));

        panelMenu.setBackground(new java.awt.Color(240, 240, 240));
        panelMenu.setMinimumSize(new java.awt.Dimension(300, 100));
        panelMenu.setPreferredSize(new java.awt.Dimension(150, 768));
        panelMenu.setLayout(new java.awt.BorderLayout());

        panelMenuIcon.setBorder(null);
        panelMenuIcon.setMinimumSize(new java.awt.Dimension(150, 150));
        panelMenuIcon.setPreferredSize(new java.awt.Dimension(150, 768));
        panelMenuIcon.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonDashboard.setBackground(new java.awt.Color(255, 255, 0));
        buttonDashboard.setText("Dashboard");
        buttonDashboard.setFocusPainted(false);
        buttonDashboard.setFocusable(false);
        buttonDashboard.setMinimumSize(new java.awt.Dimension(125, 35));
        buttonDashboard.setPreferredSize(new java.awt.Dimension(125, 35));
        panelMenuIcon.add(buttonDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 55, 126, -1));

        buttonCadastro.setText("Cadastro");
        buttonCadastro.setFocusPainted(false);
        buttonCadastro.setFocusable(false);
        buttonCadastro.setMinimumSize(new java.awt.Dimension(125, 35));
        buttonCadastro.setPreferredSize(new java.awt.Dimension(125, 35));
        buttonCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadastroActionPerformed(evt);
            }
        });
        panelMenuIcon.add(buttonCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 95, 126, -1));

        buttonRelatorios.setText("Relatórios");
        buttonRelatorios.setFocusPainted(false);
        buttonRelatorios.setFocusable(false);
        buttonRelatorios.setMaximumSize(new java.awt.Dimension(125, 35));
        buttonRelatorios.setMinimumSize(new java.awt.Dimension(125, 35));
        buttonRelatorios.setPreferredSize(new java.awt.Dimension(125, 35));
        panelMenuIcon.add(buttonRelatorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 135, 126, -1));

        buttonConfiguracoes.setText("Configurações");
        buttonConfiguracoes.setFocusPainted(false);
        buttonConfiguracoes.setFocusable(false);
        buttonConfiguracoes.setMaximumSize(new java.awt.Dimension(125, 35));
        buttonConfiguracoes.setMinimumSize(new java.awt.Dimension(125, 35));
        buttonConfiguracoes.setPreferredSize(new java.awt.Dimension(125, 35));
        panelMenuIcon.add(buttonConfiguracoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 175, 126, -1));

        panelMenu.add(panelMenuIcon, java.awt.BorderLayout.LINE_START);

        panelSubMenu.setBackground(new java.awt.Color(250, 250, 250));
        panelSubMenu.setMinimumSize(new java.awt.Dimension(150, 150));
        panelMenu.add(panelSubMenu, java.awt.BorderLayout.CENTER);

        getContentPane().add(panelMenu, java.awt.BorderLayout.LINE_START);

        jScrollPane1.setBorder(null);
        jScrollPane1.setFocusable(false);
        jScrollPane1.setRequestFocusEnabled(false);
        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadastroActionPerformed
        if (showingSubMenu) {
            hideSubMenu();
        } else {
            showSubMenu(new PanelSubMenuCadastro());
        }
    }//GEN-LAST:event_buttonCadastroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCadastro;
    private javax.swing.JButton buttonConfiguracoes;
    private javax.swing.JButton buttonDashboard;
    private javax.swing.JButton buttonRelatorios;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelMenuIcon;
    private javax.swing.JPanel panelSubMenu;
    // End of variables declaration//GEN-END:variables
}