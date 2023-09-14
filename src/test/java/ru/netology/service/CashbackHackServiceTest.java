package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;



public class CashbackHackServiceTest {
    @Test
    public void test1() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1500);
        int expected = 500;

        Assert.assertEquals(actual, expected);
    }
    @Test
    public void test2() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }
}
