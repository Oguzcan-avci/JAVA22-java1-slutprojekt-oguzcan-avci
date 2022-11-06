import java.time.LocalDate;

public class Date {


    static LocalDate[] getDayOfWeek(){
         LocalDate now = getNow();
         now.getDayOfWeek().getValue();
         LocalDate monday = now.minusDays(now.getDayOfWeek().getValue()-1);

         LocalDate week[] = new LocalDate[7];

         for (int i = 0; i < 7; i++){
             week[i] = monday.plusDays(1);
             System.out.println(week[i]);
         }
            return week;
     }

     static boolean compare(LocalDate date){
        LocalDate now = getNow();
         return now.isEqual(date);

     }

     static LocalDate getNow(){
        return LocalDate.now();
     }
}
