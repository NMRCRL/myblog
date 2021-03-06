package com.zl.blog.controller;


import com.zl.blog.util.ImageUtil;
import com.zl.blog.util.StringUtil;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @author zhengliang
 * @ClassName
 * @Description
 * @Date
 * @Version 1.0
 **/
@WebServlet(urlPatterns = "/code")
public class CodeController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String code = StringUtil.getRandomString(6);
        HttpSession session=req.getSession();
        session.setAttribute("code",code);
        BufferedImage img = ImageUtil.getImage(code,200,100);
        resp.setContentType("image/jpg");
        OutputStream out = resp.getOutputStream();
        ImageIO.write(img,"jpg",out);
        out.close();
    }
}