package com.xingkaichun.helloworldblockchain.crypto;

import java.security.MessageDigest;

/**
 * 密码学工具类
 */
public class RipeMD160Util {

    /**
     * RipeMD160消息摘要
     */
    public static byte[] ripeMD160(byte[] data) throws Exception{
        MessageDigest ripeMD160Digest = MessageDigest.getInstance("RipeMD160");
        return ripeMD160Digest.digest(data);
    }
}