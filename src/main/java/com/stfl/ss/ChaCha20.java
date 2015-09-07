package com.stfl.ss;

import java.io.ByteArrayOutputStream;

/**
 * Created by linkerlin on 9/7/15.
 */
public class ChaCha20 implements ICrypt {
    private net.clarenceho.util.ChaCha20 cha20;

    public ChaCha20(byte[] key, byte[] nonce, int counter) {
        try {
            cha20 = new net.clarenceho.util.ChaCha20(key, nonce, counter);
        } catch (net.clarenceho.util.ChaCha20.WrongNonceSizeException wnse) {

        } catch (net.clarenceho.util.ChaCha20.WrongKeySizeException wkse) {
        }
    }

    @Override
    public void encrypt(byte[] data, ByteArrayOutputStream stream) {

    }

    @Override
    public void encrypt(byte[] data, int length, ByteArrayOutputStream stream) {

    }

    @Override
    public void decrypt(byte[] data, ByteArrayOutputStream stream) {

    }

    @Override
    public void decrypt(byte[] data, int length, ByteArrayOutputStream stream) {

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
