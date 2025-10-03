package belajar_spring_restful_api.restful.util;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

@Component
public class ConvertNumberToString {

    public static String convertToRupiah(BigDecimal value){
        if (value == null)return "Rp. 0";
        NumberFormat format = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        return format.format(value);
    }
}
