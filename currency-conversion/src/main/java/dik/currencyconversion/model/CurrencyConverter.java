package dik.currencyconversion.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "currencyconverter")
public class CurrencyConverter {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name="currencyfrom")
	private String currencyFrom;

	@Column(name="currencyto")
	private String currencyTo;

	@Column(name="conversionrate")
	private BigDecimal conversionRate;

}
