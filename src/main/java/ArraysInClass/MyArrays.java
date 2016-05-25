package ArraysInClass;

/**
 * Created by mikailaakeredolu on 4/29/16.
 */

public class MyArrays
{

  private int[] elements; //declare array outside
  private int counter;


  public MyArrays(){

      elements = new int[5]; //declare array to hold 5 elements
      counter = 0;
  }


   public void add(int x){
       if(counter == elements.length){
           resizeArray();
       }
       elements[counter] = x;  //assign intake parameter x to index 0
       counter++; //moves to next index

   }

    private void resizeArray(){

        int[] largerArray = new int[elements.length * 2]; //Increase size of array by two

        for(int i = 0; i < elements.length; i++){
            largerArray[i] = elements[i];
        }

        elements = largerArray;

    }

   public void listElements(){

       for(int i = 0; i < counter; i++){

           System.out.println(elements[i]);

       }

   }


    public static void main (String args[]){



        MyArrays myArray = new MyArrays();

        for(int x = 0; x < 4; x++){

            myArray.add(1);
            myArray.add(4);
            myArray.add(19);
            myArray.add(75);
            myArray.add(42);

            myArray.add(2);

            myArray.listElements();

        }


    }


}
