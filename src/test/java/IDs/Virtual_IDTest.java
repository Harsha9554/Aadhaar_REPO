package IDs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Virtual_IDTest {

   @Test
   void test1() {
       Virtual_ID vID = new Virtual_ID();
       assertEquals("Ngxyn38228",vID.encryptAadharID("Harsha","8247372662"));
   }
   @Test
   void test2() {
       Virtual_ID vID = new Virtual_ID();
       assertEquals("Eheq332698",vID.encryptAadharID("Adam","9898998254"));
   }
    @Test
    void test3() {
        Virtual_ID vID = new Virtual_ID();
        assertEquals("Eheq332698",vID.encryptAadharID("Adam","9898998255"));
    }
}