class Animal{
   void eat(){
         System.out.println("\n animal is eating\n");
         }
        } 
class Dog extends Animal{
   void barks(){
         System.out.println("\n dog barks \n");
       }
      }   
   public class Inh{
     public static void main(String[] args){
            Dog d = new Dog();
              d.eat();
              d.barks();
               }
          }  
