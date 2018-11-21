package softeng;

import java.io.*;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

import softeng.TodoList;

public class mainMenu {
	
	static HashMap<String,TodoList> TodoListMap;
	
	
   public static String mainMenuPrint() {
      return "1.Contact / 2. TodoList / 3. Appointment / 4. Quit \n \n �޴� �Է� >>";
   }
   
   public static String subMenuPrint() {
	   return "1. Create / 2. View / 3. Save / 0. Go to Main \n \n �޴��Է� >> ";
   }

   
   public static void CreateTodoList(String Due, String Description, String Today) {
	   Scanner s = new Scanner(System.in);
	   
	   System.out.println("������ �Է��Ͻÿ� : ");
	   Due=s.nextLine();
	   
	   System.out.println("������ �Է��Ͻÿ� : ");
	   Description=s.nextLine();
	   
	   SimpleDateFormat simple = new SimpleDateFormat("yyyyMMdd");
       Calendar c1 = Calendar.getInstance();
       Today = simple.format(c1.getTime());

       TodoList newtodo = new TodoList(Due, Description, Today);
       TodoListMap.put(Due, newtodo);
       
   }
   
   
   ContactDetails()
   
   
   
   
   
   
   
   
   
   
   
   
   
   public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
      
	   
      Scanner s = new Scanner(System.in);
      map = new HashMap<String,TodoList>();
      
      while(true) {
         System.out.print(mainMenuPrint());
         String menu = s.nextLine();
         
         
         
         if (menu.equals("1")) {
            
            //contact ���� ����
            }
         else if (menu.equals("2")) {
        	 //todolist ���� ����
         }
         else if (menu.equals("3")) {
        	 //appointment ���� ����
         }
         else  if (menu.equals("4")) {
        	//������
         }
         
         System.out.print(subMenuPrint());
         String submenu = s.nextLine();
         
         while (submenu.equals("0")) {
        	 
        	 if (menu.equals("1")) {
                 
                 //creat �Լ� ����
                 }
              else if (menu.equals("2")) {
             	 //view �Լ� ����
              }
              else if (menu.equals("3")) {
             	 //save �Լ� ����
              }
              else {
            	  System.out.println("�ٽ� �Է� �ϼ���");
              }
         }
      }
   }
            else
            {
            System.out.print("���� : ");
            String temp2 = s.nextLine();
            System.out.print("�帣 : ");
            String temp3 = s.nextLine();
            System.out.print("�⵵ : ");
            String temp4 = s.nextLine();
            int temp5 = Integer.parseInt(temp4);
            Movie temp = new Movie(temp1, temp2, temp3, temp5);
            map.put(temp1, temp);
            }
            
         }
         if(menu.equals("2")) {
            Iterator<String> keys = map.keySet().iterator();
            while ( keys.hasNext()) {
               String key = keys.next();
               System.out.println("["+map.get(key).getName()+map.get(key).getDir()+map.get(key).getGenre()+map.get(key).getYear()+"]");
            }
         }
         if (menu.equals("3")  ) {
            if (map.size() == 0){
               System.out.println("��ȭ�� �����ϴ�. "); 
               continue;
               }
            System.out.print("�˻� ���� �Է� : ");
            String key = s.nextLine();
            if(map.containsKey(key)) {
               System.out.println("["+map.get(key).getName()+map.get(key).getDir()+map.get(key).getGenre()+map.get(key).getYear()+"]");
            }
            else {
               System.out.print(key+"��/�� �����ϴ�.");
            }
         }
         if (menu.equals("4")) { // ���� ����
            ObjectOutputStream ois = new ObjectOutputStream(new FileOutputStream("movie.dat"));
            ois.writeObject(map);
            System.out.println("movie.dat �� ����Ǿ����ϴ�.");
            ois.close();
         }
         if (menu.equals("5")) { // ���Ͽ���
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("movie.dat"));
            map = (HashMap<String, Movie>) ois.readObject();
            System.out.println("movie.dat �κ��� ������ �ҷ��Խ��ϴ�. ");
            ois.close();
         }
         if (menu.equals("6")) {
            s.close();
            break;
            }
         
      }
   }

}



