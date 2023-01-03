package TaskBook;

import java.time.LocalDateTime;

public class TaskWP extends Purpose implements Repeatable{

    public TaskWP(String title,
                  String note,
                  TypeOfPurpose typeOfPurpose,
                  LocalDateTime date) {
        super(title, note, typeOfPurpose, date);

    }

    @Override
    public LocalDateTime getDateTime(LocalDateTime dateTime) {
        LocalDateTime date = dateTime;
        while (date.isBefore(dateTime)) {
            date = date.plusWeeks(1);
        }
        return date;
    }

    @Override
    public String getTypeRepeatable() {
        return null;
    }

    public String getTypePurpose(){
        return "Цель";
    }

}