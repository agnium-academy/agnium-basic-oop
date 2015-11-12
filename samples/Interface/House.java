public class House implements Building {

   public void build() {
      System.out.println("Build a house");
   }

   public void destroy(){
      System.out.println("Destroy a house");
   } 

   public int getVolume() {
      return 0;
   }

   public static void main(String args[]) {
      House home = new House();
      home.build();
      home.destroy();
   }

} 
