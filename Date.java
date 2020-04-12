public class Date {
    static int month;
    static int day;
    static int year;

    public Date(int a,int b,int c){
        month=b;
        day=a;
        year=c;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }
    public static void Date(){
        System.out.println("The date is: "+day+"/"+month+"/"+year);
    }

}

