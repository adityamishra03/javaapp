import java.io.File;
import java.util.*;


class app {

    public static void create(String filename) {

        File file = new File(filename);
        try {
        boolean value = file.createNewFile();
        if (value) {
            System.out.println("The new file is created.");
        }
        else {
            System.out.println("The file already exists.");
        }
        }
        catch(Exception e) {
        e.getStackTrace();
        }

    }


    public static void delete(String filename){
        try  
        {         
            File f = new File(filename);          
            if(f.delete())                      
            {  
            System.out.println(f.getName() + " deleted");   
            }  
            else  
            {  
            System.out.println("File not found");  
            }  

        }
        catch(Exception e)  
        {  
        e.printStackTrace();  
        }  

    }

    public static void find(String filesearch)
    {
        File directory = new File("").getAbsoluteFile();
  
        String[] flist = directory.list();
        int flag = 0;
        if (flist == null) {
            System.out.println("Empty directory.");
        }
        else {
  
            // Linear search in the array
            for (int i = 0; i < flist.length; i++) {
                String filename = flist[i];
                if (filename.equalsIgnoreCase(filesearch)) {
                    System.out.println(filename + " found");
                    flag = 1;
                }
            }
        }
  
        if (flag == 0) {
            System.out.println("File Not Found");
        }


    }

    public static void list(){

        String path =  System.getProperty("user.dir");
        String[] dirListing = null;
        File dir = new File(path);
        dirListing = dir.list();
        Arrays.sort(dirListing);
        System.out.println(Arrays.deepToString(dirListing));
       
    }


    

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Welcome to LockedMe.com \n");
        System.out.println("\n");
        System.out.println("Created by Aditya");
        System.out.println("\n");



		while(true){
            System.out.println("To add a file, Enter  1");
            System.out.println("\n");
            System.out.println("To search for a file, Enter 2");
            System.out.println("\n");
            System.out.println("To delete a file, Enter 3");
            System.out.println("\n");
            System.out.println("To list all the files, Enter 4");
            System.out.println("\n");                        
			System.out.println("To Exit, Enter value 5");
			
			System.out.println("Enter your choice::");
			int choice = scan.nextInt();//accept user input

			switch(choice){
			case 1:
            Scanner sc= new Scanner(System.in);  
            System.out.print("Enter file name to be created: ");  
            String filename = sc.nextLine();
            create(filename); 
            break;
            

            case 2:
            Scanner sc_search = new Scanner(System.in);  
            System.out.print("Enter file to be searched for: ");  
            String search_filename = sc_search.nextLine();
            find(search_filename);  
            break;


            case 3:
            Scanner sc_delete = new Scanner(System.in);  
            System.out.print("Enter file to be deleted: ");  
            String delete_filename = sc_delete.nextLine();
            delete(delete_filename);  
            break;

            case 4:
            list();
            break;
            

			case 5: System.out.println("Exiting the application, Thank you for visiting Company Lockers Pvt ltd");
			System.exit(0);
			default: System.out.println("Invalid Input; Please try again");
			}
        }
        
  }

}