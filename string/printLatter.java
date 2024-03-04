public class printLatter {
    public static void  printLatter(String str){
        for(int i = 0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String firstName = "Satyam";
        String lastName = "Suman";

        String fullName = firstName +" "+lastName;

        printLatter(fullName);
    }
}
