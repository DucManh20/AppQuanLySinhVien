/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class MessageDialog {

    // hộp thoại hiện thị thông báo
    public static void showMessageDialog(Component parent, String title, String content) {
        JOptionPane.showMessageDialog(parent, title, content, JOptionPane.INFORMATION_MESSAGE);
    }

    // hộp thoại hiển thị thông báo lỗi
    public static void showErrorDialog(Component parent, String title, String content) {
        JOptionPane.showMessageDialog(parent, title, content, JOptionPane.ERROR_MESSAGE);
    }

    // hộp thoại xác thực thông tin
    public static int showConfirmDialog(Component parent, String title, String content) {
        int choose = JOptionPane.showConfirmDialog(parent, title, content, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        return choose;

    }
}
