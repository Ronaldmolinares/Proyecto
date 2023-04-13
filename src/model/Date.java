package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date {
    private short day;
    private short month;
    private short year;
    public static final int DAYS_OF_YEAR = 365;
    public static final byte DAYS_OF_MONTH = 30;


    public Date(){

    }

    public Date(short day, short month, short year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public short getDay() {
        return day;
    }

    public void setDay(short day) {
        this.day = day;
    }

    public short getMonth() {
        return month;
    }

    public void setMonth(short month) {
        this.month = month;
    }

    public short getYear() {
        return year;
    }

    public void setYear(short year) {
        this.year = year;
    }

    public String getDate() {
		String format = "yyyy-MM-dd HH:mm:ss";
		DateTimeFormatter formateador = DateTimeFormatter.ofPattern(format);
		LocalDateTime date = LocalDateTime.now();
		return formateador.format(date);
	}


    public int parseDateToDays(Date myDate) {
        short dayAux = myDate.getDay();
        short monthAux = myDate.getMonth();
        short yearAux = myDate.getYear();
        int days = dayAux;
        days += DAYS_OF_YEAR * yearAux;
        days += DAYS_OF_MONTH * monthAux;
        return days;
    }

    public int calculateDifferenceDates(Date dateEntry, Date dateExit) {
        int daysEntry = this.parseDateToDays(dateEntry);
        int daysExit = this.parseDateToDays(dateExit);
        if (daysExit > daysEntry) {
            return daysExit - daysEntry;
        } else
            return 0;
    }

    @Override
    public String toString() {
        return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
    }

    
}
