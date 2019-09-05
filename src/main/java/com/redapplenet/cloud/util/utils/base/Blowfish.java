package com.redapplenet.cloud.util.utils.base;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.security.crypto.codec.Hex;
import org.springframework.util.StringUtils;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.NoSuchAlgorithmException;
import java.security.spec.AlgorithmParameterSpec;

public class Blowfish {
    // 密钥
    //public static final String ENCRYPT_KEY = "1ecaf820";
    // 初始化向量
    public static final String INITIALIZATION_VECTOR = "cnBHdE9F";
    // 转换模式
    public static final String TRANSFORMATION = "Blowfish/CBC/PKCS5Padding";
    // 密钥算法名称
    public static final String BLOWFISH = "Blowfish";
    public static AlgorithmParameterSpec iv;
    public static Cipher cipher;

    static {
        // 使用 initializationVector 中的字节作为 IV 来构造一个 IvParameterSpec 对象
        iv = new IvParameterSpec(INITIALIZATION_VECTOR.getBytes());
        try {
            // 返回实现指定转换的 Cipher 对象
            cipher = Cipher.getInstance(TRANSFORMATION);
        } catch (NoSuchAlgorithmException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * 加密
     *
     * @param key  密钥
     * @param text 加密文本
     */
    public static String encrypt(String key, String text) throws Exception {
        // 根据给定的字节数组构造一个密钥 Blowfish-与给定的密钥内容相关联的密钥算法的名称
        SecretKeySpec sksSpec = new SecretKeySpec(key.getBytes(), BLOWFISH);
        // 用密钥和随机源初始化此 Cipher
        cipher.init(Cipher.ENCRYPT_MODE, sksSpec, iv);
        // 加密文本
        byte[] encrypted = cipher.doFinal(text.getBytes());
        return new String(Hex.encode(encrypted));
    }

    /**
     * 解密
     *
     * @param key  密钥
     * @param text 加密文本
     */
    public static String decrypt(String key, String text) throws Exception {
        byte[] encrypted = null;
        try {
            encrypted = Hex.decode(text);
        } catch (Exception e) {
            e.printStackTrace();
        }
        SecretKeySpec skeSpect = new SecretKeySpec(key.getBytes(), BLOWFISH);
        cipher.init(Cipher.DECRYPT_MODE, skeSpect, iv);
        byte[] decrypted = cipher.doFinal(encrypted);
        return new String(decrypted);
    }

    /**
     * Base64字符解码
     *
     * @param base64String 被解码字符
     * @return 解码后字符
     */
    public static String base64Decoder(String base64String) {
        if (StringUtils.isEmpty(base64String)) {
            return base64String;
        } else {
            return new String(Base64.decodeBase64(base64String));
        }
    }

    /**
     * Base64字符编码
     *
     * @param sourceString 字符
     * @return 编码后字符
     */
    public static String base64Encoder(String sourceString) {
        if (StringUtils.isEmpty(sourceString)) {
            return sourceString;
        } else {
            return Base64.encodeBase64String(sourceString.getBytes());
        }
    }

}
