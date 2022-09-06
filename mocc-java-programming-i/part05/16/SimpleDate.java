
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void advance(){
        advance(1);
    }

    public void advance(int howManyDays){
        day += howManyDays;
        if (day > 30){
            month += (day/30);
            day %= 30;
            if (month > 12){
                year += (month/12);
                month %= 12;
            }
        }

    }

    public SimpleDate afterNumberOfDays(int days){
        SimpleDate newDate = new SimpleDate(day,month,year);
        newDate.advance(days);
        return newDate;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }

}
