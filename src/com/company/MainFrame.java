package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class MainFrame extends JFrame implements MouseWheelListener {
    
    private JButton rotateX = new JButton("rotateX");
    private JButton rotateY = new JButton("rotateY");
    private JButton rotateZ = new JButton("rotateZ");
    private JButton transferX = new JButton("transferX");
    private JButton transferY = new JButton("transferY");
    private JButton transferZ = new JButton("transferZ");
    DrawPanel dp = new DrawPanel();


    public MainFrame() throws HeadlessException {

        dp.setSize(600, 800);
        dp.setLocation(0, 0);
        this.add(dp);
        this.addMouseWheelListener(this);
//        plus.setBounds(20, 30, 50, 30);
//        minus.setBounds(80, 30, 50, 30);
        dp.add(rotateX);
        dp.add(rotateY);
        dp.add(rotateZ);
        dp.add(transferX);
        dp.add(transferY);
        dp.add(transferZ);

        rotateX.addActionListener(ae -> dp.rotateX());

        rotateY.addActionListener(ae -> dp.rotateY());

        rotateZ.addActionListener(ae -> dp.rotateZ());

        transferX.addActionListener(ae -> dp.transferX());

        transferY.addActionListener(ae -> dp.transferY());

        transferZ.addActionListener(ae -> dp.transferZ());
    }

    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {
        if(e.getWheelRotation() > 0) {
            dp.transformMinus();

        }else {
            dp.transformPlus();
        }
    }
}
