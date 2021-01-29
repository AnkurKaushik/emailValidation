import java.util.Scanner;

public class Validation {

    private static String[] emailID;
    private static String[] master = {"rohaan.ahmad@hcl.com", "franklin.wyatt@hcl.com", "fabian.morris@hcl.com", "ezra.downs@hcl.cm", "yousef.ibarra@hcl.com",
            "joey.gamble@hcl.com", "marta.deleon@hcl.com", "caleb.ashton@hcl.com", "liya.skinner@hcl.com", "bret.grimes@gmail.com",
            "hetty.thacher@gmail.com", "adela.mclean@gmail.com"};

    //initializes the emailID array with a random length and random elements from the master array
    private static void initEmailID()
    {
        int rand = (int) (Math.random() * master.length);
        emailID = new String[rand];
        for(int i = 0; i < emailID.length; i++)
        {
            emailID[i] = master[(int) (Math.random() * master.length)];
        }
    }

    //function used to verify that email exists in the array
    private static boolean search(String[] emailArry, String emailSearch)
    {
        for (String s : emailArry) {
            if (s.equals(emailSearch.toLowerCase()))
                return true;
        }
        return false;
    }

    public static void main(String[] args)
    {
        initEmailID();
//        The following code block prints out the emails in the mail array
//        for(int i = 0; i < emailID.length; i++)
//        {
//            System.out.println(emailID[i]);
//        }

        //prompts the user, saves search term into a var
        System.out.println("Please enter an email you would like to search for, if you want the master mail list type 'master'");
        Scanner sc = new Scanner(System.in);
        String searchTerm = sc.next();

        //user asks for master list, print all elements in array
        if(searchTerm.toLowerCase().equals("master"))
        {
            for(int i = 0; i < master.length; i++)
            {
                System.out.println(master[i]);
            }
        }
        else //user typed an email id
        {
            if(search(emailID, searchTerm))
                System.out.println(searchTerm + " was found in the array of Employee Email IDs!");
            else
                System.out.println(searchTerm + " is not a valid Employee Email ID, please try again");
        }
    }

}
