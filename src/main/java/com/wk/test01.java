package com.wk;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.io.FileSystemUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.ArrayUtils;
//import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
//import java.io.InputStream;
import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author shkstart
 * @create 2021-05-23 11:14
 */
public class test01 {
    private static Log log = LogFactory.getLog(test01.class);
    public static void main(String[] args) throws Exception {

//        InputStream in = new URL("https://commons.apache.org").openStream();
////        try {
//            System.out.println(IOUtils.toString(in));
////        } finally {
//            IOUtils.closeQuietly(in);
//
////        }
//        File file = new File("/commons/io/project.properties");
//        List lines = FileUtils.readLines(file, "UTF-8");

        //********************************ArrayUtils***************************************
        // 将两个数组合并为一个数组
        // 构造HttpClient的实例
        HttpClient httpClient = new HttpClient();
        // 创建POST方法的实例
        String url = "http://www.oracle.com/";
        PostMethod postMethod = new PostMethod(url);
        Socket s= new Socket();
    }
}
