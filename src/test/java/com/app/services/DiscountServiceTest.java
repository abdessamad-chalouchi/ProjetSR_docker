package com.app.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;

import java.time.Year;

@SpringBootTest
public class DiscountServiceTest {
    @SpyBean
    private DiscountService discountService;
    @Test
    public void testCalculateDiscount_validPromoCode(){
        var discount = discountService.calculateDiscount(10,"THANKSGIVING");
        Assertions.assertEquals(1f,discount);
    }
    @Test
    public void testCalculateDiscount_validPromoCodeForYear2026(){
        Mockito.when(discountService.getCurrentYear()).thenReturn(Year.of(2026));
        var discount = discountService.calculateDiscount(10,"XMAS");
        Assertions.assertEquals(0f,discount);
    }
    @Test
    public void testCalculateDiscount_NullPromoCode(){
        var discount = discountService.calculateDiscount(10,null);
        Assertions.assertEquals(0f,discount);
    }
}
