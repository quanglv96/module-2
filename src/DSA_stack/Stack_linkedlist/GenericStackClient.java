package DSA_stack.Stack_linkedlist;

public class GenericStackClient {
    public static void stackOfIsString() {
        MyGenericStack<String> stack = new MyGenericStack();
        stack.push("five");
        stack.push("four");
        stack.push("three");
        stack.push("two");
        stack.push("one");
        System.out.println("book1.book1 Size of stack after push operation: " + stack.size());
        System.out.printf("book1.2. Pop elements from stack : ");
        while (!stack.isEmpty()){
            System.out.printf(" %s", stack.pop());
        }
        System.out.println("\nbook1.3 Size of stack after pop operation: " + stack.size());
    }
    private static void stackOfIntegers() {
        MyGenericStack<Integer> stack = new MyGenericStack();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("2.book1. Size of stack after push operations: " + stack.size());
        System.out.printf("2.2. Pop elements from stack : ");
        while (!stack.isEmpty()) {
            System.out.printf(" %d", stack.pop());
        }
        System.out.println("\n3.3 Size of stack after pop operations : " + stack.size());
    }

    public static void main(String[] args) {
        System.out.println("book1. MyStack of interger");
        stackOfIntegers();
        System.out.println("\n2. MyStack of string");
        stackOfIsString();
    }
}
