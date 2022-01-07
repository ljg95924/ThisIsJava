package ThisIsJavaChapter06;

import ThisIsJavaChapter06.Week;

public class EnumWeek {
    public static void main(String[] args) {
        Week today = Week.TUESDAY;
        String name = today.name();
        System.out.println("name = TUESDAY (STRING)"+name.equals("TUESDAY"));

        Week weekDay = Week.valueOf("SATURDAY");
        System.out.println("weekDay:"+weekDay);

        System.out.println(weekDay.equals("SATURDAY"));
        System.out.println(weekDay.equals(Week.SATURDAY));

        System.out.println(Week.SATURDAY);

        Week[] days= Week.values();
        for(Week day : days){
            System.out.println(day);
        }
    }
}
