import java.time.format.*;
import java.time.*;
public class Homework {
    DateTimeFormatter format1 = DateTimeFormatter.ofPattern("yyyy, MMMM-dd !! hh:mm");
    DateTimeFormatter format2 = DateTimeFormatter.ofPattern("hh:mm, dd/MMM/yy");
    public void SMENA(LocalDateTime ldt1,LocalDateTime ldt2,Period p,Duration d){
        while (ldt1.isBefore(ldt2)){
            System.out.println("Работаем с: "+ldt1.format(format1));
            ldt1 = ldt1.plus(p);
            System.out.println("До: "+ldt1.format(format1));
            System.out.println("Отдыхаем с: "+ldt2.format(format2));
            ldt2=ldt2.plus(d);
            System.out.println("До: "+ldt2.format(format2));
        }
    }

    public static void main(String[] args) {
        LocalDateTime ldt1 = LocalDateTime.of(2016,1,1,9,0);
        LocalDateTime ldt2 = LocalDateTime.of(2016,2,3,9,0);
        Period p = Period.ofMonths(3);
        Duration d = Duration.ofHours(200);
        Homework hm1 = new Homework();
        hm1.SMENA(ldt1,ldt2,p,d);


    }
}

