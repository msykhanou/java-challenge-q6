public class Classroom {
    public static void main(String[] args){

        Wilder wildOne = new Wilder("Jean-Claude",true);
        Wilder wildTwo = new Wilder ("Henri", false);

        System.out.println(wildTwo.whoAmI());
        System.out.println(wildOne.whoAmI());
    }


}
