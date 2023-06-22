package dik.rentfare.feign;

import dik.rentfare.model.CurrencyConversionVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "currency-conversion")
//@FeignClient(name = "zuul-service-gateway")
//@RequestMapping(value = "/currency")
public interface CurrencyConversionServiceProxy {

    @GetMapping(value = "/currency/from/{from}/to/{to}")
    CurrencyConversionVO convertCurrency(@PathVariable String from, @PathVariable String to);
}
