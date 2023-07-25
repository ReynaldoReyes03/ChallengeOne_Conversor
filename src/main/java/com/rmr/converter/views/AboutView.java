package com.rmr.converter.views;

import javax.swing.JPanel;

/**
 *
 * @author Reynaldo Martínez Reyes
 */
public class AboutView extends JPanel {

    public AboutView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPane = new javax.swing.JScrollPane();
        panel_container = new javax.swing.JPanel();
        button_discord = new com.rmr.converter.swing.buttons.GradientRoundedButton();
        button_email = new com.rmr.converter.swing.buttons.GradientRoundedButton();
        button_linkedin = new com.rmr.converter.swing.buttons.GradientRoundedButton();
        button_github = new com.rmr.converter.swing.buttons.GradientRoundedButton();
        button_youtube = new com.rmr.converter.swing.buttons.GradientRoundedButton();
        button_website = new com.rmr.converter.swing.buttons.GradientRoundedButton();
        label_copyright = new javax.swing.JLabel();
        textPane_text = new javax.swing.JTextPane();

        setOpaque(false);

        scrollPane.setBackground(new java.awt.Color(245, 245, 245));
        scrollPane.setBorder(null);
        scrollPane.setOpaque(true);

        panel_container.setBackground(new java.awt.Color(245, 245, 245));

        button_discord.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/social/discord.png"))); // NOI18N
        button_discord.setText("Discord");
        button_discord.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        button_discord.setIconTextGap(10);

        button_email.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/social/email.png"))); // NOI18N
        button_email.setText("Email");
        button_email.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        button_email.setIconTextGap(10);

        button_linkedin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/social/linkedin.png"))); // NOI18N
        button_linkedin.setText("LinkedIn");
        button_linkedin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        button_linkedin.setIconTextGap(10);

        button_github.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/social/github.png"))); // NOI18N
        button_github.setText("GitHub");
        button_github.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        button_github.setIconTextGap(10);

        button_youtube.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/social/youtube.png"))); // NOI18N
        button_youtube.setText("YouTube");
        button_youtube.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        button_youtube.setIconTextGap(10);

        button_website.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/social/website.png"))); // NOI18N
        button_website.setText("Website");
        button_website.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        button_website.setIconTextGap(10);

        label_copyright.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_copyright.setText("© Copyright 2023 Reynaldo Martínez Reyes - All rights reserved ");

        textPane_text.setEditable(false);
        textPane_text.setBackground(new java.awt.Color(245, 245, 245));
        textPane_text.setBorder(null);
        textPane_text.setFont(new java.awt.Font("Sitka Subheading", 0, 14)); // NOI18N
        textPane_text.setForeground(new java.awt.Color(30, 30, 30));
        textPane_text.setFocusCycleRoot(false);
        textPane_text.setFocusable(false);
        textPane_text.setOpaque(false);
        textPane_text.setRequestFocusEnabled(false);

        javax.swing.GroupLayout panel_containerLayout = new javax.swing.GroupLayout(panel_container);
        panel_container.setLayout(panel_containerLayout);
        panel_containerLayout.setHorizontalGroup(
            panel_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_containerLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(panel_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textPane_text, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_containerLayout.createSequentialGroup()
                        .addComponent(button_linkedin, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(button_youtube, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_containerLayout.createSequentialGroup()
                        .addComponent(button_email, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(button_website, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_containerLayout.createSequentialGroup()
                        .addComponent(button_discord, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(button_github, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(label_copyright, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        panel_containerLayout.setVerticalGroup(
            panel_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_containerLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(textPane_text, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(panel_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_discord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_github, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(panel_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_website, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(panel_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_linkedin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_youtube, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(label_copyright)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        scrollPane.setViewportView(panel_container);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public com.rmr.converter.swing.buttons.GradientRoundedButton button_discord;
    public com.rmr.converter.swing.buttons.GradientRoundedButton button_email;
    public com.rmr.converter.swing.buttons.GradientRoundedButton button_github;
    public com.rmr.converter.swing.buttons.GradientRoundedButton button_linkedin;
    public com.rmr.converter.swing.buttons.GradientRoundedButton button_website;
    public com.rmr.converter.swing.buttons.GradientRoundedButton button_youtube;
    public javax.swing.JLabel label_copyright;
    public javax.swing.JPanel panel_container;
    public javax.swing.JScrollPane scrollPane;
    public javax.swing.JTextPane textPane_text;
    // End of variables declaration//GEN-END:variables
}
