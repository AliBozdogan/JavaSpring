package com.orm2.entity;

import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
public class CreditAccount extends Account{
    BigDecimal creditLimit;
}
