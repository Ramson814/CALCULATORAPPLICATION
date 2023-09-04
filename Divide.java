 
package calculatorapplication;

 
public class Divide implements Operate{
    
      @Override
    public Double getResult(Double... numbers) {
         Double results=numbers[0];
         for(int i=1;i<numbers.length;i++){
             results /=numbers[i];
         }
         return results;
    }
    
}
