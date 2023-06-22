package dik.currencyconversion.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "currencyconverter")
public class CurrencyConverter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "currencyfrom")
    private String currencyFrom;

    @Column(name = "currencyto")
    private String currencyTo;

    @Column(name = "conversionrate", precision = 5, scale = 3)
    // Количество цифр после разделителя (scale) не должно быть больше общего количества цифр (precision)
    private BigDecimal conversionRate;
}
