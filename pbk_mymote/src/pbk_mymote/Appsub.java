package pbk_mymote;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;





public class Appsub {

   public static String subMenu() {
	   
	   return "1. Create 2. View 3. Save 0. Go to Main\n\n �޴� �Է� >>";
	   }
   
   static void CreateAppointment(int Date, String Persons, String Location) {
	  
	   Appointment appoint = new Appointment(Date, Persons, Location);
       map.put(Date, appoint);
	   }




   public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

      // TODO Auto-generated method stub
      Scanner s = new Scanner(System.in);
      HashMap<String,Appointment> map = new HashMap<>();
      
      while(true) {
         System.out.print(subMenu());
         
         String submenu = s.nextLine();

         if (submenu.equals("1")) {

            System.out.print("��� ��¥ : ");
            int Date = s.nextInt();
            System.out.print("������ ��� : ");
            String Persons = s.nextLine();
            System.out.print("��� ��� : ");
            String Location = s.nextLine();
            
            CreateAppointment(Date, Persons, Location);

          
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