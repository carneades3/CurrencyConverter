/*  console's client application of 
                                currency's converter
 */

public class ConverterConsoleClient {

   public static void main(String[] args) {
      ConverterClient     consoleClient = new ConverterClient(System.out);
      
      try {
         consoleClient.run();
      } catch (Exception exception) {
         exception.printStackTrace();
         abnormalTermination(exception.getMessage());
      }
   }   
   
   public static void abnormalTermination(final String INFO) {
      System.err.println("****** Program is interrupted ");
      System.err.println(INFO);
      System.exit(1);
   }
} 
