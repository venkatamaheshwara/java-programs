import java.util.Scanner;

// Given two dates print the number of  days between those given dates

// input date format is  YYYY-MM-DD Format 

// input = 2000-05-01
// 2020-01-01
// output= 7184

// input=2000-01-01
// 2000-12-31
// output=365
import java.util.*;
import java.time.*;
import java.time.temporal.ChronoUnit;
public class fs_A_day13_prgm2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String date1=sc.nextLine();
        String date2=sc.nextLine();
        LocalDate dte=LocalDate.parse(date1);
        LocalDate dte2=LocalDate.parse(date2);
        //long total=ChronoUnit.DAYS.between(dte, dte2);
        long total=DAYS.between(dte,dte2);
        System.out.print(total);
    }
    
}
