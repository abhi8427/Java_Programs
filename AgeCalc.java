import java.time.LocalDate;
import java.time.Period;

public class AgeCalc{

public static void main(String args[]){

LocalDate today = LocalDate.now();

LocalDate birthdate = LocalDate.of(1988, 12, 04);

int years = Period.between(birthdate,today).getYears();

System.out.println(years);


}



}