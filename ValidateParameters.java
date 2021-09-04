
public class ValidateParameters {
   
   public static void checkNullPointer(Object... objectArray) {
      if (objectArray == null) {
         throw new NullPointerException();
      }
      
      for (Object object : objectArray) {
         if (object == null) {
            throw new NullPointerException();
         }
      }
   }
}
