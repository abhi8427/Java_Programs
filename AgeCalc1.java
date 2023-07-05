import java.time.Period;
import java.time.LocalDate;

public class AgeCalc1{

public static void main(String abhi[]){

LocalDate today = LocalDate.now();

LocalDate birthdate = LocalDate.of(1982, 5, 22);

int years = Period.between(birthdate, today).getYears();
System.out.println(years);

}


}