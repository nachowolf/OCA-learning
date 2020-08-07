package inheritance;

import inheritance.family.*;

public class main {
    public static void main(String[] args) {
        // Family
        Parent dad = new Parent();
        System.out.println(dad.getHair()); //should print 'red'

        Child daughter = new Child();
        System.out.println(daughter.getHair()); // should also print 'red' since parent has 'red'
        System.out.println(daughter.getEyes()); // should print purple

        //Because daughter extends Parent, daughter has the same hair colour as Parent and because of this daughter has enough 'DNA' to be 'related' to the Parent class
        // Parent Characteristics:    Child Characteristics
        // * red hair √               * red hair √
        System.out.println(daughter instanceof Parent); // true

        //However, since dad doesn't have all the necessary 'DNA' of the Child, it cant be considered the child.
        // Child Characteristics:    Parent Characteristics
        // * red hair √               * red hair √
        // * purple eyes √            * purple eyes X
        System.out.println(dad instanceof Child); // false


        //# IF AN OBJECT IS AN INSTANCE OF A CLASS THE OBJECT CAN HAVE THAT CLASS AS THE REFERENCE.
    }
}
