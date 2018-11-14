package com.newer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.MultipartRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

@Controller
public class UploadController {

    @RequestMapping("upload")
    public String upload(HttpServletRequest request) throws IOException {
        //初始化上下文 CommonsMultipartResolver（解析器）
        CommonsMultipartResolver cmr = new CommonsMultipartResolver(request.getServletContext());
        //判断request中是否存在 multipart/form-data
        if(cmr.isMultipart(request)){
            MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
            //获取所有的上传文件
            Iterator<String> it = multiRequest.getFileNames();
            while(it.hasNext()){
                //获取当前文件
                MultipartFile file = multiRequest.getFile(it.next());
                if(!file.isEmpty()){
                    //打印文件名称
                    System.out.println("---->"+file.getOriginalFilename());
                    //获取当前web项目主目录的路径
                    String path = request.getServletContext().getRealPath("upload");
                    File dir = new  File(path);
                    if(!dir.exists()){
                        dir.mkdir();
                    }
                    //file.transferTo(new File(dir,file.getOriginalFilename()));
                    String fileName=file.getOriginalFilename();
                    //文件本来的名称_date
                     int ret=fileName.lastIndexOf(".");
                     String file1=fileName.substring(0,ret);
                     String file2=fileName.substring(ret);
                    System.out.println(file1+file2);
                     fileName=file1+"_"+System.currentTimeMillis()+file2;
                     file.transferTo(new File(dir,fileName));

                }
            }
        }
        return "index";
    }

}
