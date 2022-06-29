package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashbackHackerServiceTest {
    @Test
    void showWorkCashback(){
        int boundary = 2000;
        int amount = 10;
        int expected = 1000;

        CashbackHackerService service = new CashbackHackerService();
        int actual = service.remain(boundary);

        assertEquals(expected, actual);

    }
    @Test
    void showWorkCashback2() {
        int boundary = 900;
        int amount = 10;
        int expected = 100;

        CashbackHackerService service = new CashbackHackerService();
        int actual = service.remain(boundary);

        assertEquals(expected, actual);
    }

    @Test
    void showWorkCashback3() {
        int boundary = 1000;
        int amount = 10;
        int expected = 100;

        CashbackHackerService service = new CashbackHackerService();
        int actual = service.remain(boundary);

        assertEquals(expected, actual);
    }



}
