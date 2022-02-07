/** 
* TITLE: MainProductOfEvens.java 
* AUTHOR: Elena Mudrakova   
* COURSE: CS 112 Intro to CS II - Java  
* MODULE: 4
* PROJECT: Lab 09_ProductOfEvens
* LAST MODIFIED: 09/30/2020
* DESCRIPTION: this program returns the product of n even numbers with recursive method
* 
* ALGORITHM: 
* declare public static int productOfEvens(int n)
* if(n < 1) throw new IllegalArgumentException
* if n == 1 return 2
* else return productOfEvens(n-1) * (n*2);
* 
* 
* PACKAGES INCLUDED: no 
*/ 
package L9_ProdictOfEvens;

public class MainProductOfEvens {
    /**
     * Returns the product of n even numbers
     * @param n integer product of how many n needs to be returned
     * @return integer the product of n even numbers
     */
    public static int productOfEvens(int n) {
        if(n < 1) throw new IllegalArgumentException("Number has to be equal or more then 1.");
        else if(n == 1) return 2;
        else return productOfEvens(n-1) * (n*2);
        
    }
    public static void main(String[] args) {

        //System.out.println(productOfEvens(0));
        System.out.println(productOfEvens(1));
        System.out.println(productOfEvens(2));
        System.out.println(productOfEvens(3));
        System.out.println(productOfEvens(4));
    }
}
