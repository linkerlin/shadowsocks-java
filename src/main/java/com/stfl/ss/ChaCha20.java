package com.stfl.ss;

import org.bouncycastle.crypto.StreamBlockCipher;

import javax.crypto.SecretKey;
import java.io.ByteArrayOutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by linkerlin on 9/7/15.
 */
public class ChaCha20 extends CryptBase {
    private net.clarenceho.util.ChaCha20 cha20;

    public final static String CIPHER_CHACHA_20 = "aes-256-ofb";

    public static Map<String, String> getCiphers() {
        Map<String, String> ciphers = new HashMap<>();
        ciphers.put(CIPHER_CHACHA_20, ChaCha20.class.getName());
        return ciphers;
    }

    public ChaCha20(String name, String password) {
        super(name, password);
    }
//    public ChaCha20(byte[] key, byte[] nonce, int counter) throws net.clarenceho.util.ChaCha20.WrongNonceSizeException, net.clarenceho.util.ChaCha20.WrongKeySizeException {
//        try {
//            cha20 = new net.clarenceho.util.ChaCha20(key, nonce, counter);
//        } catch (net.clarenceho.util.ChaCha20.WrongNonceSizeException wnse) {
//            throw wnse;
//        } catch (net.clarenceho.util.ChaCha20.WrongKeySizeException wkse) {
//            throw wkse;
//        }
//    }




    @Override
    protected StreamBlockCipher getCipher(boolean isEncrypted) throws InvalidAlgorithmParameterException {
        return null;
    }

    @Override
    protected SecretKey getKey() {
        return null;
    }

    @Override
    protected void _encrypt(byte[] data, ByteArrayOutputStream stream) {

    }

    @Override
    protected void _decrypt(byte[] data, ByteArrayOutputStream stream) {

    }

    @Override
    public int getIVLength() {
        return 0;
    }

    @Override
    public int getKeyLength() {
        return 0;
    }
}
