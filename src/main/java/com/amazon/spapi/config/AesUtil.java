package com.amazon.spapi.config;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

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
            byte[] raw = key.getBytes(StandardCharsets.US_ASCII);
            SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");  //"算法/模式/补码方式"
            //CBC模式需要配置偏移量，设置这个后，不会出来同一个明文加密为同一个密文的问题，达到密文唯一性
            IvParameterSpec iv = new IvParameterSpec("1234567890123456".getBytes());
            cipher.init(Cipher.DECRYPT_MODE, skeySpec, iv);

            // Using java.util.Base64 instead of sun.misc.BASE64Decoder
            byte[] encrypted1 = Base64.getDecoder().decode(content);

            try {
                byte[] original = cipher.doFinal(encrypted1);
                return new String(original);
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
