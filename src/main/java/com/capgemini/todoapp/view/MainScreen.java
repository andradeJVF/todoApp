/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.capgemini.todoapp.view;

import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author Vitor
 */
public class MainScreen extends javax.swing.JFrame {

    /**
     * Creates new form MainScreen
     */
    public MainScreen() {
        initComponents();
        decorateTableTasks();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EmptyList = new javax.swing.JPanel();
        EmptyListIcon = new javax.swing.JLabel();
        ProjectListTitle = new javax.swing.JLabel();
        ProjectListSubtitle = new javax.swing.JLabel();
        Header = new javax.swing.JPanel();
        HeaderTitle = new javax.swing.JLabel();
        HeaderSubtitle = new javax.swing.JLabel();
        Projects = new javax.swing.JPanel();
        ProjectsTitle = new javax.swing.JLabel();
        ProjectsAdd = new javax.swing.JLabel();
        Tasks = new javax.swing.JPanel();
        TasksTitle = new javax.swing.JLabel();
        TasksAdd = new javax.swing.JLabel();
        ProjectList = new javax.swing.JPanel();
        ProjectsScroll = new javax.swing.JScrollPane();
        ProjectsList = new javax.swing.JList<>();
        jPanel5 = new javax.swing.JPanel();
        jtableTasksScroll = new javax.swing.JScrollPane();
        jTableTasks = new javax.swing.JTable();

        EmptyList.setBackground(new java.awt.Color(255, 255, 255));
        EmptyList.setPreferredSize(new java.awt.Dimension(363, 500));

        EmptyListIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EmptyListIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/list/xxhdpi-lists.png"))); // NOI18N
        EmptyListIcon.setPreferredSize(new java.awt.Dimension(10, 10));

        ProjectListTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ProjectListTitle.setForeground(new java.awt.Color(0, 102, 102));
        ProjectListTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ProjectListTitle.setText("Nenhuma tarefa por aqui!");

        ProjectListSubtitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ProjectListSubtitle.setForeground(new java.awt.Color(153, 153, 153));
        ProjectListSubtitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ProjectListSubtitle.setText("Clique no bot�o \"+\" para adicionar uma nova tarefa");

        javax.swing.GroupLayout EmptyListLayout = new javax.swing.GroupLayout(EmptyList);
        EmptyList.setLayout(EmptyListLayout);
        EmptyListLayout.setHorizontalGroup(
            EmptyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmptyListLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EmptyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EmptyListIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ProjectListTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ProjectListSubtitle, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE))
                .addContainerGap())
        );
        EmptyListLayout.setVerticalGroup(
            EmptyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmptyListLayout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(EmptyListIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ProjectListTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ProjectListSubtitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 700));
        setPreferredSize(new java.awt.Dimension(700, 700));

        Header.setBackground(new java.awt.Color(0, 102, 102));

        HeaderTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        HeaderTitle.setForeground(new java.awt.Color(255, 255, 255));
        HeaderTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/tick/tick (3).png"))); // NOI18N
        HeaderTitle.setText(" TodoApp");

        HeaderSubtitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        HeaderSubtitle.setForeground(new java.awt.Color(255, 255, 255));
        HeaderSubtitle.setText("Anote tudo e n�o esque�a de nada!");

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HeaderSubtitle, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
                    .addComponent(HeaderTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(HeaderTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(HeaderSubtitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Projects.setBackground(new java.awt.Color(255, 255, 255));
        Projects.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Projects.setForeground(new java.awt.Color(255, 255, 255));
        Projects.setPreferredSize(new java.awt.Dimension(180, 0));

        ProjectsTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ProjectsTitle.setForeground(new java.awt.Color(0, 102, 102));
        ProjectsTitle.setText("Projetos");

        ProjectsAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ProjectsAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add/add (4).png"))); // NOI18N

        javax.swing.GroupLayout ProjectsLayout = new javax.swing.GroupLayout(Projects);
        Projects.setLayout(ProjectsLayout);
        ProjectsLayout.setHorizontalGroup(
            ProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProjectsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ProjectsTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(146, Short.MAX_VALUE))
            .addGroup(ProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProjectsLayout.createSequentialGroup()
                    .addContainerGap(192, Short.MAX_VALUE)
                    .addComponent(ProjectsAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(16, 16, 16)))
        );
        ProjectsLayout.setVerticalGroup(
            ProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProjectsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ProjectsTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(ProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ProjectsLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(ProjectsAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        Tasks.setBackground(new java.awt.Color(255, 255, 255));
        Tasks.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Tasks.setForeground(new java.awt.Color(255, 255, 255));
        Tasks.setPreferredSize(new java.awt.Dimension(500, 60));

        TasksTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        TasksTitle.setForeground(new java.awt.Color(0, 102, 102));
        TasksTitle.setText("Tarefas");

        TasksAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TasksAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add/add (4).png"))); // NOI18N

        javax.swing.GroupLayout TasksLayout = new javax.swing.GroupLayout(Tasks);
        Tasks.setLayout(TasksLayout);
        TasksLayout.setHorizontalGroup(
            TasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TasksLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TasksTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TasksAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        TasksLayout.setVerticalGroup(
            TasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TasksLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TasksAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                    .addComponent(TasksTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        ProjectList.setBackground(new java.awt.Color(255, 255, 255));
        ProjectList.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ProjectList.setForeground(new java.awt.Color(255, 255, 255));

        ProjectsList.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        ProjectsList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ProjectsList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        ProjectsList.setFixedCellHeight(50);
        ProjectsList.setSelectionBackground(new java.awt.Color(0, 102, 102));
        ProjectsScroll.setViewportView(ProjectsList);

        javax.swing.GroupLayout ProjectListLayout = new javax.swing.GroupLayout(ProjectList);
        ProjectList.setLayout(ProjectListLayout);
        ProjectListLayout.setHorizontalGroup(
            ProjectListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProjectListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ProjectsScroll)
                .addContainerGap())
        );
        ProjectListLayout.setVerticalGroup(
            ProjectListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProjectListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ProjectsScroll)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));

        jTableTasks.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTableTasks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Descri��o", "Prazo", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableTasks.setGridColor(new java.awt.Color(255, 255, 255));
        jTableTasks.setRowHeight(50);
        jTableTasks.setSelectionBackground(new java.awt.Color(0, 153, 102));
        jTableTasks.setShowHorizontalLines(true);
        jtableTasksScroll.setViewportView(jTableTasks);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtableTasksScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtableTasksScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Projects, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                    .addComponent(ProjectList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Tasks, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Projects, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tasks, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ProjectList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
                if ("Java swing".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel EmptyList;
    private javax.swing.JLabel EmptyListIcon;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel HeaderSubtitle;
    private javax.swing.JLabel HeaderTitle;
    private javax.swing.JPanel ProjectList;
    private javax.swing.JLabel ProjectListSubtitle;
    private javax.swing.JLabel ProjectListTitle;
    private javax.swing.JPanel Projects;
    private javax.swing.JLabel ProjectsAdd;
    private javax.swing.JList<String> ProjectsList;
    private javax.swing.JScrollPane ProjectsScroll;
    private javax.swing.JLabel ProjectsTitle;
    private javax.swing.JPanel Tasks;
    private javax.swing.JLabel TasksAdd;
    private javax.swing.JLabel TasksTitle;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTable jTableTasks;
    private javax.swing.JScrollPane jtableTasksScroll;
    // End of variables declaration//GEN-END:variables

    public void decorateTableTasks(){
        
        //customizando o header do Grid Tasks
        jTableTasks.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 14));
        jTableTasks.getTableHeader().setBackground(new Color(0, 102, 102));
        jTableTasks.getTableHeader().setForeground(new Color(255, 255, 255));
        
        //cria um sort para as colunas
        jTableTasks.setAutoCreateRowSorter(true);
        
    }

}