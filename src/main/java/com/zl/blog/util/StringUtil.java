package com.zl.blog.util;

import java.io.File;
import java.time.LocalDate;
import java.util.Random;

/**
 * @author liu tianyuan
 * @ClassName
 * @Description
 * @Date 2019/11/20
 * @Version 1.0
 **/


public class StringUtil {
    //    public static void main(String[] args) {
//        String str="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
//        StringBuilder sb=new StringBuilder(6);
//        for(int i=0;i<6;i++)
//        {
//            char ch=str.charAt(new Random().nextInt(str.length()));
//            sb.append(ch);
//        }
//        System.out.println(sb.toString());
//
//
//    }
//    public static void main(String[] args) {
//        String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
//        StringBuilder sb=new StringBuilder(4);
//        for(int i=0;i<4;i++)
//        {
//            char ch=str.charAt(new Random().nextInt(str.length()));
//            sb.append(ch);
//        }
//        System.out.println(sb.toString());
//
//
//
//        //随机生成六位数字
//        System.out.println((int)((Math.random()*9+1)*100000));
//        //随机生成五位数字
//        System.out.println((int)((Math.random()*9+1)*10000));
//
//
//    }
//
    public static String getRandomString(int length) {
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(3);
            long result = 0;
            switch (number) {
                case 0:
                    result = Math.round(Math.random() * 25 + 65);
                    sb.append(String.valueOf((char) result));
                    break;
                case 1:
                    result = Math.round(Math.random() * 25 + 97);
                    sb.append(String.valueOf((char) result));
                    break;
                case 2:
                    sb.append(String.valueOf(new Random().nextInt(10)));
                    break;
            }

        }
        return sb.toString();
    }
//
//    public static void main(String[] args) {
//        System.out.println(StringUtil.getRandomString(6));
//    }
    public static String createMkdir(String path) {
        LocalDate date = LocalDate.now();
        File file = null;
        try {
            file = new File(path + date.toString());
            if (!file.exists()) {
                file.mkdirs();
                return date.toString() + "/";
            } else {

                return date.toString() + "/";
            }
        } catch (Exception e) {

        } finally {
            file = null;
        }
        return null;

    }

    public static void rename(String path1, String path2) {
        if (path1.indexOf(".") >= 0) {

            String pathSuffix = path1.substring(path1.lastIndexOf(".") + 1);
            new File(path1).renameTo(new File(path2 + "." + pathSuffix));
        } else {

        }

    }
}
