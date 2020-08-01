package com.company;

import java.awt.*;
import java.security.SecureRandom;

public class DrawPanel extends Panel {
    private SecureRandom randomNumbers = new SecureRandom();
    private MyLine[] lines;

    public DrawPanel() {
        setBackground(Color.white);
        lines = new MyLine[5 + randomNumbers.nextInt(5)];

        for (int count = 0; count < lines.length; count++) {
            // generate random coordinates
            int x1 = randomNumbers.nextInt(300);
            int y1 = randomNumbers.nextInt(300);
            int x2 = randomNumbers.nextInt(300);
            int y2 = randomNumbers.nextInt(300);

            //generate random colors
           Color color = new Color(randomNumbers.nextInt(256),
                   randomNumbers.nextInt(256), randomNumbers.nextInt(256));

           lines[count] = new MyLine(x1, y1, x2, y2, color);
        }
    }

    public void paintComponent(Graphics graphics){
        super.paintComponents(graphics);

        //draw line
        for (MyLine line :lines)
            line.Draw(graphics);
    }

}
