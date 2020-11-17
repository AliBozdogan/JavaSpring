package com.app.interfaces.carpetPrices;

import com.app.enums.City;

import java.math.BigDecimal;

public interface Carpet {

    BigDecimal getSqFtPrice(City city);
}
