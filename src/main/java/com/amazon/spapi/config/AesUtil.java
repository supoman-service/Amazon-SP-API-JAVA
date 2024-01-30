package com.amazon.spapi.config;

import sun.misc.BASE64Decoder;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/**
 * <Description> <br>
 *
 * @author supoman<br>
 * @version 1.0<br>
 * @date 2024/01/01 <br>
 */

public class AesUtil {
    /*
     * 解密方法
     * content 需要解密的密文
     * key 解密的秘钥
     * return 解密后的内容
     */
    public static String Decrypt(String content, String key) throws Exception {
        try {
            // 判断Key是否正确
            if (key == null) {
                System.out.print("Key为空null");
                return null;
            }
            // 判断Key是否为16位
            if (key.length() != 16) {
                System.out.print("Key长度不是16位");
                return null;
            }
            byte[] raw = key.getBytes("ASCII"); //参数类型
            SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");  //"算法/模式/补码方式"
            //CBC模式需要配置偏移量，设置这个后，不会出来同一个明文加密为同一个密文的问题，达到密文唯一性
            IvParameterSpec iv = new IvParameterSpec("1234567890123456".getBytes());
            cipher.init(Cipher.DECRYPT_MODE, skeySpec, iv);
            byte[] encrypted1 = new BASE64Decoder().decodeBuffer(content);//先用base64解密
            try {
                byte[] original = cipher.doFinal(encrypted1);
                String originalString = new String(original);
                return originalString;
            } catch (Exception e) {
                System.out.println(e.toString());
                return null;
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
            return null;
        }
    }
}
