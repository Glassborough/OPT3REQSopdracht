import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashRegisterTest {

    CashRegister cash = new CashRegister();
    @Test
    public void initTest() {

        assertEquals(0.0, cash.computeTotal(), 0.01);
        assertEquals(0, cash.getCount(), 0.001);
    }

    @org.junit.jupiter.api.Test
    void eersteProductToegevoegd() {
        cash.addItem(3.5);
        assertEquals(1, cash.getCount());
        assertEquals(3.5, cash.computeTotal());
    }

    @org.junit.jupiter.api.Test
    void computeTotal() {
    }

    @org.junit.jupiter.api.Test
    void clear() {
    }

    @org.junit.jupiter.api.Test
    void getCount() {
    }
}