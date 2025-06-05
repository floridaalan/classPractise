import java.util.Scanner;
import java.util.Stack;

public class balancedParenthesis {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            String s=sc.nextLine();
            Stack <Character> stack=new Stack<>();
            for(char ch:s.toCharArray()){
                if(ch=='('||ch=='['||ch=='{'){
                    stack.push(ch);

                }else if(ch==')'||ch==']'||ch=='}'){
                    if(stack.isEmpty()){
                       
                        System.out.println("1");// no match found in stack!
                      
                    }
                        stack.pop();// if match is found
                    

                }
            
            }
             System.out.println("0");
        }



    }
    
}
