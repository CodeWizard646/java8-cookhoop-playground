package coreJavaQandA.finalFinallyAndFinalize.finallyBlock;

public class Maths {

    public int divide(int a, int b)
    {
        int ans = -1;

        try{
            ans = a/b;
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
            return ans;
        }finally {
            System.out.println("Division method Completed");
        }
      return ans;
    }
}
