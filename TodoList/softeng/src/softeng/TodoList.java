package softeng;
import java.io.Serializable;

public class TodoList implements Serializable {
   private String due, description;
   private String today;
   public TodoList(String due, String description, String today) {
      this.due = due; this.description = description; this.today=today;
   }
   public String getDue() {
      return "���� : "+due+" , ";
   }
   public void setDue(String due) {
      this.due = due;
   }
   public String getDescription() {
      return "���� : "+description+" , ";
   }
   public void setDescription(String description) {
      this.description = description;
   }
   public String getToday() {
      return "�帣 : "+today+" , ";
   }
   public void setToday(String today) {
      this.today = today;
   }
   
}