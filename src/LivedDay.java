import java.util.*;
public class LivedDay {
    public static void main(String[] args) {
        int year, month, day;
        Scanner sc=new Scanner(System.in);

        //the time from user
        System.out.println(" Which year were you born ?");
        do
        {
            year=sc.nextInt();
        }while(year<=0);

        System.out.println("Which month were you born ?");
        do
        {
            month=sc.nextInt();
        }while(month<=0 || month>13);

        System.out.println("Which day were you born ?");
        do
        {
            day=sc.nextInt();
        }while(day<=0 || day >30);

        //the time now
        int yearNow, monthNow, dayNow;
        System.out.println("Which year is this year ?");
        do
        {
            yearNow=sc.nextInt();
        }while(yearNow<=0);
        System.out.println("Which month is this month");
        do
        {
            monthNow=sc.nextInt();
        }while(monthNow<=0 || monthNow>13);
        System.out.println("Which day is today");
        do
        {
            dayNow=sc.nextInt();
        }while(dayNow<=0 || dayNow >30);

        final int dateOfYear=365;
        final int dateOfMonth=30;

        int livedDay=0;
        if (yearNow> year)
        {
            livedDay=(yearNow-year-1)*dateOfYear;
        }
        else
        {
            if (dayNow>day)
            {
                livedDay +=(dayNow-day);

                if(monthNow>month)
                {
                    livedDay += (monthNow-month)*dateOfMonth;
                }
                else
                {
                    livedDay +=((12-month)+monthNow)*dateOfMonth;
                }
            }
            else
            {
                livedDay +=(30-dayNow+day);

                if(monthNow>month)
                {
                    livedDay += (monthNow-month)*dateOfMonth;
                }
                else
                {
                    livedDay +=((12-month)+monthNow)*dateOfMonth;
                }
            }
        }

        System.out.printf("You have lived about %d days", livedDay);
    }
}
