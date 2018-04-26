/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.david.modulogithub;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JOptionPane;
import org.kohsuke.github.GHCreateRepositoryBuilder;
import org.kohsuke.github.GitHub;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.Exceptions;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "File",
        id = "com.david.modulogithub.IconGitActionListener"
)
@ActionRegistration(
        iconBase = "iconGitHub.png",
        displayName = "#CTL_IconGitActionListener"
)
@ActionReference(path = "Toolbars/File", position = 0)
@Messages("CTL_IconGitActionListener=Git")
public final class IconGitActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        /**
         * @param nombreRepo Pide un nombre para el repositorio, a través de un JOptionPane.
         * @param nombreUser Pide el nombre de usuario de GitHub.
         * @param pass Pide la contraseña del usuario.
         * 
         * A continuación se creará un repositorio en GitHub.
         */
        
        String nombreUser=JOptionPane.showInputDialog("Nombre usuario: ");
        String pass=JOptionPane.showInputDialog("Contraseña: ");
        String nombreRepo=JOptionPane.showInputDialog("Insetar nombre del repositorio: ");
        try {
            GitHub obxGitHub=GitHub.connectUsingPassword(nombreUser, pass);
            GHCreateRepositoryBuilder obxBuilder=obxGitHub.createRepository(nombreRepo);
            obxBuilder.create();
        } catch (IOException ex) {
            System.out.println("ERROR: "+ex);
        }
        
    }
}
