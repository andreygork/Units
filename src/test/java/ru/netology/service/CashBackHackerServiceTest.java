package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashBackHackerServiceTest {
    @Test
    public void amountLessThanBoundary() {
        CashBackHackerService service = new CashBackHackerService();

        int actual = service.remain(800);
        int expected = 200;
        assertEquals(actual, expected);
    }

    @Test
    public void amountEqualsBoudary() {
        CashBackHackerService service = new CashBackHackerService();

        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void amountMoreThanBoundary() {
        CashBackHackerService service = new CashBackHackerService();

        int actual = service.remain(1200);
        int expected = 800;
        assertEquals(actual, expected);
    }
}