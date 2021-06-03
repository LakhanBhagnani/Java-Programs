

//import for Scanner and other utility classes
import java.util.*;



class TestClass {
    public static void main(String args[] ) throws Exception {
        

        //Scanner
        Scanner s = new Scanner(System.in);
        String zooString = s.nextLine();                 // Reading input from STDI
        String ZooValid=isItZoo(zooString);
        System.out.println(ZooValid);    // Writing output to STDOUT

    }
    public static String isItZoo(String a){
        int xNoofZs=0;
        int yNoOfOz=0;
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i) == 'z')
                xNoofZs++;
            else if(a.charAt(i) =='o')
                yNoOfOz++;
        }
        if((2*xNoofZs)==yNoOfOz)
            return "Yes";
        else   
            return "No";
    }
}
