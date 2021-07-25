package com.rdc.utils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

/**
 * @Description: 采用Md5结合Base64对密码进行加密
 * @author: myrdc
 * @date: 0:01 2021/7/26
 */
public class Md5Utils {

    private static final String ENCODING = "UTF-8";

    private Md5Utils() {
    }

    public static String getDigest(String originText) {
            MessageDigest md = null;
            byte[] digest = null;
            try {
                md = MessageDigest.getInstance("md5");
                digest = md.digest(originText.getBytes(ENCODING));
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException("无法支持md5加密", e);
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException("无法支持UTF-8编码格式", e);
            }
            return Base64.getEncoder().encodeToString(digest);
        }
    }


