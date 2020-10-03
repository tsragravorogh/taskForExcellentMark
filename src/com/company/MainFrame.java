package com.company;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private JButton plus = new JButton("+");
    private JButton minus = new JButton("-");
    private JButton rotateX = new JButton("rotateX");
    private JButton rotateY = new JButton("rotateY");
    private JButton rotateZ = new JButton("rotateZ");
    private JButton transferX = new JButton("transferX");
    private JButton transferY = new JButton("transferY");
    private JButton transferZ = new JButton("transferZ");


    public MainFrame() throws HeadlessException {
        DrawPanel dp = new DrawPanel();
        dp.setSize(600, 800);
        dp.setLocation(0, 0);
        this.add(dp);

        dp.add(plus);
        dp.add(minus);
        dp.add(rotateX);
        dp.add(rotateY);
        dp.add(rotateZ);
        dp.add(transferX);
        dp.add(transferY);
        dp.add(transferZ);


        plus.addActionListener(ae -> dp.transformPlus());

        minus.addActionListener(ae -> dp.transformMinus());

        rotateX.addActionListener(ae -> dp.rotateX());

        rotateY.addActionListener(ae -> dp.rotateY());

        rotateZ.addActionListener(ae -> dp.rotateZ());

        transferX.addActionListener(ae -> dp.transferX());

        transferY.addActionListener(ae -> dp.transferY());

        transferZ.addActionListener(ae -> dp.transferZ());
    }
}
