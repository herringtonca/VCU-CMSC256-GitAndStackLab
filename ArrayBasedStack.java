import java.util.Arrays;

public class ArrayBasedStack <T> implements StackInterface{
   T[] data;
   int topOfStack;
   int INITIAL_CAPACITY = 5;
   boolean initialized = false;
   
   public ArrayBasedStack(int capacity){
      if(capacity < 0){
         throw new IllegalArgumentException("Capacity must be greater than 0");
      }
      else if(capacity == 0){
         topOfStack = -1;
      }
      else
         topOfStack = capacity;
         
      data = (T[]) new Object[topOfStack];
   }
   
   public ArrayBasedStack(){
      topOfStack = INITIAL_CAPACITY;
      data = (T[])new Object[topOfStack];
   }
   
   private doubleSize(){
      data = copyOf(data, (topOfStack*2));
   }
}