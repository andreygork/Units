package ru.netology.service;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.*;


public class CashBackHackerServiceTest {
    @Test
    public void amountLessThanBoundary() {
        CashBackHackerService service = new CashBackHackerService();

        int expected = 200;
        int actual = service.remain(800);

        assertEquals(expected, actual);
    }

    @Test
    public void amountEqualsBoundary() {
        CashBackHackerService service = new CashBackHackerService();

        int expected = 0;
        int actual = service.remain(1000);

        assertEquals(expected, actual);
    }

    @Test
    public void amountMoreThanBoundary() {
        CashBackHackerService service = new CashBackHackerService();

        int expected = 800;
        int actual = service.remain(1200);

        assertEquals(expected, actual);
    }

    @Test
    public void amountLessThanBoundary2() {
        CashBackHackerService service = new CashBackHackerService();

        int expected = 200;
        int actual = service.remain(800);

        assertEquals(expected, actual);
    }

    @Test
    public void amountEqualsBoundary2() {
        CashBackHackerService service = new CashBackHackerService();

        int expected = 0;
        int actual = service.remain(1000);

        assertEquals(expected, actual);
    }

    @Test
    public void amountMoreThanBoundary2() {
        CashBackHackerService service = new CashBackHackerService();

        int expected = 800;
        int actual = service.remain(1200);
        assertEquals(expected, actual);
    }
}