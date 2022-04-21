// HDFC Credit card system generates bill on 1st day of a given month and gives 60 days period for repayment of the bill.
// The manager of the bank wants to send an alert message to the customer every 'k' days ,  just to remind the bill payment. 
// Kindly help the bank manager to send the customer a alert message every 'k' days of the bill start. 

// The first line of input contains the date separated by the dd-MM-yyyy followed by the number of days 


// input=01-05-2022
// 10
// output= 
// May 1, 2022 Bill Payment Due  on Thursday, June 30, 2022
// May 11, 2022 Bill Payment Due  on Thursday, June 30, 2022
// May 21, 2022 Bill Payment Due  on Thursday, June 30, 2022
// May 31, 2022 Bill Payment Due  on Thursday, June 30, 2022
// June 10, 2022 Bill Payment Due  on Thursday, June 30, 2022
// June 20, 2022 Bill Payment Due  on Thursday, June 30, 2022


// input=01-09-2021
// 15
// output=
// September 1, 2021 Bill Payment Due  on Sunday, October 31, 2021
// September 16, 2021 Bill Payment Due  on Sunday, October 31, 2021
// October 1, 2021 Bill Payment Due  on Sunday, October 31, 2021
// October 16, 2021 Bill Payment Due  on Sunday, October 31, 2021
import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
class fs_A_day13_prgm1
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String date=sc.next();
        int k=sc.nextInt();
        DateTimeFormatter format1=DateTimeFormatter.ofPattern("dd-MM-yyyy");

        // LocalDate curr_date=LocalDate.parse(date);
        // int day=curr_date.getDayOfMonth();
        // Month month=curr_date.getMonth();
        // int year=curr_date.getYear();
        LocalDate start=LocalDate.parse(date,format1);
        LocalDate end=start.plusDays(60);
        Period period=Period.ofDays(k);
       bill_payment(start,end,period);
        DateTimeFormatter shortDateTime =DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        DateTimeFormatter shortDateTime2 =DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        System.out.print(start.format(shortDateTime)+" billing "+end.format(shortDateTime2));

    }
    public static void bill_payment(LocalDate s,LocalDate e,Period p)
    {
        while(s.isBefore(e))
        {
            DateTimeFormatter shortDateTime =DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        DateTimeFormatter shortDateTime2 =DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
            System.out.println(s.format(shortDateTime)+" "+"Bill Payment Due  on"+" "+e.format(shortDateTime2));
        }
    }

}

