package Generics;

public class Pair<T,U> {

    T value1;
    U value2;

   Pair(T value1,U value2){
       this.value1=value1;
       this.value2=value2;
   }

    T getValue1(){

       return value1;
    }

    U getValue2(){

       return value2;
    }

}
