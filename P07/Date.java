import java.util.*;

public class Date
{
    private int day;
    private int month;
    private int year;

    private final int MAX_MONTH = 11;
    private final int LEAP_YEAR = 4;
    private final int APRIL = 3;
    private final int JUNE = 5;
    private final int SEPT = 8;
    private final int NOV = 10;
    private final int FEB = 1;
    private final int THIRTY = 30;
    private final int THIRTY_ONE = 30;
    private final int FEB_LEAP_DAYS = 29;
    private final int FEB_NON_LEAP_DAYS = 28;

    public Date( int day, int month, int year )
    {
        if( validateMonth( month ) )
        {
            this.month = month;
        }
        if( validateDay( day ) )
        {
            this.day = day;
        }
        this.year = year;
    }




    public Date( Date date )
    {
        day = date.getDay();
        month = date.getMonth();
        year = date.getYear();
    }




    public Date()
    {
        day = 1;
        month = 1;
        year = 1970;
    }




    public int getDay()
    {
        return day;
    }




    public void setDay( int day )
    {
        if( validateDay( day ) )
        {
            this.day = day;
        }
    }




    public int getMonth()
    {
        return month;
    }




    public void setMonth( int month )
    {
        if( validateMonth( month ) )
        {
            this.month = month;
        }
    }




    public int getYear()
    {
        return year;
    }




    public void setYear( int year )
    {
        this.year = year;
    }




    public String toString()
    {
        return year + "/" + month + "/" + day;
    }




    public boolean equals( Object obj )
    {
        boolean isEqual = false;
        if( obj != null )
        {
            if( obj instanceof Date )
            {
                Date date = (Date) obj;
                if( this.day == date.day && this.month == date.month
                    && this.year == date.year )
                {
                    isEqual = true;
                }
            }
        }
        return isEqual;
    }




    private boolean isLeapYear()
    {
        return ( year % LEAP_YEAR == 0 );
    }




    private boolean validatePositiveInt( int input, int max )
    {
        return ( input >= 0 && input <= max );
    }




    private boolean validateDay( int day )
    {
        int maxDays = FEB_NON_LEAP_DAYS;

        switch( this.month )
        {
            case APRIL:
            case JUNE:
            case SEPT:
            case NOV:
                maxDays = THIRTY;
                break;
            case FEB:
                if( isLeapYear() )
                {
                    maxDays = FEB_LEAP_DAYS;
                }
                else
                {
                    maxDays = FEB_NON_LEAP_DAYS;
                }
                break;
            default:
                maxDays = THIRTY_ONE;
        }

        return validatePositiveInt( day, maxDays );
    }




    private boolean validateMonth( int month )
    {
        return validatePositiveInt( month, MAX_MONTH );
    }

}