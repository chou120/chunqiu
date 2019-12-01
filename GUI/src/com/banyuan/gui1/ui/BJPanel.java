package com.banyuan.gui1.ui;

import javax.swing.*;
import java.awt.*;

public class BJPanel extends JPanel {

    Image   image;

    public BJPanel(Image   image) {
        this.image=image;
        this.setOpaque(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, this.getWidth(), this.getHeight(), this);
    }
}
