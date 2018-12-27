import java.io.*;
import java.util.*;
public class Dic_z {
	public static void main(String []args) throws IOException{
        BufferedReader in = null;
        Scanner put = new Scanner(System.in);
        String str;
        boolean notfound = false;
        char again = 'a';
        String sub = "error";
        int a =0;

        try{
            do{
                notfound = false;
                System.out.println("Enter search vocabulary: :");
                str = put.next();
                str.trim();
                a = str.length();                             //ขนาดของString
               
               if(a == 1) {
                	System.out.println("error");
                	break;
                }
                File f = new File("a.txt");
                in = new BufferedReader(new FileReader(f));
                String s;

                while((s = in.readLine()) != null){					//เงื่อนไข s อ่านบรรทัดใน txt
                	
                    int x = s.indexOf(str);							//กำหนดตัวแปร เท่ากับ x sค้นหาตำแหน่ง
                    
                    
                    if(x != -1 && x<s.indexOf("-")){				//x ไม่เท่ากับ -1 และ x น้อยกว่า  index
                    	
                        sub = s.substring(0,s.indexOf("-"));      //(2,s.indexOf("-"))
                       
                       // System.out.println("stack:" + str);
                       // System.out.println("Sub:" + sub);
                        
                    
                    }
                   
 
                }
                
                if (s != str) { 
                	System.out.println("stack:" + str);
                
                	System.out.println("Sub:" + sub);
                	
                }
                sub = "error";
 
                        
                
               
                if(!notfound){
                    System.out.println("Try another word?(y/n):");
                    again = put.next().trim().charAt(0);
                    again = Character.toLowerCase(again);
                }
            }
            while(notfound || again == 'y');
            System.out.println("Stop!!!!");
        }
        finally{
            if(in != null){
                in.close();
            }
            
        }
        
    }
}