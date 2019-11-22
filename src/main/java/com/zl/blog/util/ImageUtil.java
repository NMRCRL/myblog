package com.zl.blog.util;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * @author liu tianyuan
 * @ClassName
 * @Description
 * @Date 2019/11/20
 * @Version 1.0
 **/


public class ImageUtil {
    public static BufferedImage getImage(String content,int width,int height){
        BufferedImage img=new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
        Graphics2D g=(Graphics2D) img.getGraphics();
        Color forcolor=new Color(255, 206, 68);
        Color bgcolor=new Color(60, 63, 65);
        g.setColor(bgcolor);
        g.fillRect(0,0,width,height);
        g.setPaint(forcolor);
        Font font= new Font("微软雅黑",Font.BOLD,30);
        g.drawString(content,100,50);
        return img;
    }

    public static void main(String[] args) throws IOException {
//        String code= StringUtil.getRandomString(4);
//        BufferedImage img=ImageUtil.getImage(code,200,100);
//        File file= new File("D:/code.jpg");
//        ImageIO.write(img,"jpg",file);
    }
}
