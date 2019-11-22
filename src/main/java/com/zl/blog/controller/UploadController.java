package com.zl.blog.controller;

import com.zl.blog.util.StringUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author liu tianyuan
 * @ClassName
 * @Description
 * @Date 2019/11/21
 * @Version 1.0
 **/
@MultipartConfig(maxFileSize = 1024 * 1024 * 100)
@WebServlet(urlPatterns = "/api/upload")
public class UploadController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String fileType = "jpg,mp3,mov,mp4,video,rmvb,pdf,txt,xml,doc,gif,png,bmp,jpeg";
        int i = 0;
        for (Part part : req.getParts()) {

            String name = part.getSubmittedFileName();
            System.out.println(name);

            String path = req.getSession().getServletContext().getRealPath("");
            String secPath = path + StringUtil.createMkdir(path);
            System.out.println(path);
            System.out.println(secPath);
            File file = new File("/Desktop/" + name);
            System.out.println(secPath + name);

            if (name == "") {
                JOptionPane.showMessageDialog(null, "请选择文件");
                req.getRequestDispatcher("/Upload.jsp").forward(req, resp);
            }

            System.out.println(file.isFile());
            long maxFileSize = 1024 * 1024 * 10;
            if (file.length() > maxFileSize) {
                JOptionPane.showMessageDialog(null, "文件大小超过限制！应小于" + maxFileSize
                        / 1024 / 1024 + "M");
                part = null;
                req.getRequestDispatcher("/Upload.jsp").forward(req, resp);
            }

            String nameSuffix = name.substring(name.lastIndexOf(".") + 1).toLowerCase().trim();
            if (name != "") {
                if (!Arrays.<String>asList(fileType.split(",")).contains(nameSuffix)) {
                    JOptionPane.showMessageDialog(null, "文件类型不符合要求，必须为" + fileType
                            + "的文件！");
                    part = null;
                    req.getRequestDispatcher("/Upload.jsp").forward(req, resp);
                }
            }


            part.write(secPath + name);

            StringUtil.rename(secPath + name, secPath + "UUID" + i++);
//        resp.setContentType("image/jpg");
            req.setAttribute("msg", "上传成功");
            req.setAttribute("url", "http://localhost:8080/" + name);
//            req.getRequestDispatcher("/Upload.jsp").forward(req, resp);
        }
    }
}