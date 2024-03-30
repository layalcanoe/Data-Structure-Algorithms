import java.util.Scanner;
import java.util.Stack;


public class StackWord {
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        System.out.println("enter a sentence: ");
        String input = scan.nextLine();
        String words[]= input.split(" ");
        Stack<String> s = new Stack<String>();


        for(int i = 0 ; i < words.length ; i++){
            s.push(words[i]);
        }

        for(int i = 0 ; i<words.length ; i++){
            System.out.println(s.pop()+" ");
        }
    
    
        Scanner scanning = new Scanner(System.in);
        System.out.println("enter a word: ");
        String input2 = scanning.nextLine();
        char[] word = input2.toCharArray();
        Stack<Character> stack = new Stack<Character>();


        for(int i = 0 ; i < word.length  ; i++){
            stack.push(word[i]);
        }


        for(int i = 0 ; i< word.length ; i++){
            System.out.print(stack.pop());
        }
     }

}
