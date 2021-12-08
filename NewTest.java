public class NewTest {
   private static int counter = 0;
   void NewTest() {
       counter = 20;
   }
   NewTest(int x){
       counter = x;
   }
   public static void main(String[] args) {
       NewTest newTest = new NewTest();
       System.out.println(counter);
   }
}
