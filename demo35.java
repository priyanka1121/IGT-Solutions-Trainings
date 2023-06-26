import java.io.*;
import java.util.*;
import java.sql.*;
class A{
    /**
     * @throws InvalidAgeException
     * @throws FileNotFoundException
     * @throws NullPointerException
     * @throws SQLException
     * @throws MaxAgeException
     */
    void abc() throws InvalidAgeException,FileNotFoundException,NullPointerException,SQLException, MaxAgeException{
        for (int age = 1; age <= 25; age++) {
            if(age==9) throw new SQLException();
            if(age==10) throw  new InputMismatchException();
            if(age==15) throw new FileNotFoundException();
            if (age==18) throw new InvalidAgeException("Please check age again");
            if(age==20) throw  new NullPointerException();
            if (age==60) throw new MaxAgeException(null);
                System.out.println("Age: "+age);

        }
    }
}
public class demo35 {
    public static void main(String[] args) {
        try {
            A a=new A();
            a.abc();
        } 
        catch (InvalidAgeException iae) {
            // TODO: handle exception
            System.out.println(iae);
        }
        catch(NullPointerException np){
            System.out.println("Null pointer came");
        }
        catch(FileNotFoundException fn){
            System.out.println("File not fouund  came");   
        }
        catch(InputMismatchException ime)
        {
            System.out.println("INPU mISS MATHC ");   
        }
        catch(SQLException sql)
        {
            System.out.println("SQL CAME ");
        }
         catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("Thank you....!");
        }
    }
}
class InvalidAgeException extends Exception{
    InvalidAgeException(String msg){
        super(msg);
    }
}
// MaxAgeException
// if age 60 > throw
class MaxAgeException extends Exception{
    MaxAgeException(String msg){
        super(msg);
    }
}