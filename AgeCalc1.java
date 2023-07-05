import java.time.Period;
import java.time.LocalDate;

public class AgeCalc1{

public static void main(String abhi[]){

LocalDate today = LocalDate.now();

LocalDate birthdate = LocalDate.of(1988, 8, 4);

int years = Period.between(birthdate, today).getYears();
System.out.println(years);

}


}