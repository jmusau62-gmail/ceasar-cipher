import org.junit.Test;

import static org.junit.Assert.*;

public class CaesarTest {

    @Test
    public void runCipher_returnStringPlainWord_String(){
        Ceasar testCipher = new Ceasar("josh",2);
        testCipher.getPlainWord();
        assertEquals("josh", testCipher.getPlainWord());
    }

    @Test
    public void runCipher_returnIntShift_Integer(){
        Ceasar testCipher2 = new Ceasar("nevamindit", 2);
        testCipher2.getShift();
        assertEquals(2, testCipher2.getShift());

    }

    @Test
    public void encrypt_returnEncryptedText_String(){
        Ceasar testCipher3 = new Ceasar("josh", 2);
        testCipher3.encrypt("josh", 2);
        assertEquals("lquj", testCipher3.encrypt("josh", 2));
    }

    @Test
    public void decrypt_returnDecryptedText_String(){
        Ceasar testCipher4 = new Ceasar("rko", 2);
        testCipher4.decrypt("rko", 2);
        assertEquals("josh", testCipher4.decrypt("lquj",2));
    }

    }