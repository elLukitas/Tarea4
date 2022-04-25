import static org.junit.jupiter.api.Assertions.*;

class PrimosTest {

    @org.junit.jupiter.api.Test

    void generarPrimosTest() {
        int max=10;
        int [] primosTest=new int[]{2,3,5,7};
        int [] primos=Primos.generarPrimos(max);
        for (int i=0;i<primosTest.length;i++) {
            assertEquals(primosTest[i], primos[i]);
        }
    }
}