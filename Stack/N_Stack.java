// Given n stacks with elements which needs to fit in a single array with size n
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;


class N_Stack{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //int arr[] = new arr[n];
        @SuppressWarnings("unchecked")
        Stack<Integer>[] stack  = new Stack[n];
        for(int i=0; i<n; i++){
            stack[i] = new Stack<>();
        }
        stack[0].push(10);
        stack[0].push(20);
        stack[0].push(30);

        stack[1].push(40);
        stack[1].push(50);

        stack[2].push(60);
        stack[2].push(70);
        stack[2].push(80);

        stack[3].push(90);
        stack[3].push(100);

        stack[4].push(101);

        stack[5].push(102);
        stack[5].push(103);

        @SuppressWarnings("unchecked")
        LinkedList<Integer>[] arr = new LinkedList[n];
        for(int i=0; i<n; i++){
            arr[i] = new LinkedList<>();
            for(int x : stack[i]){
                arr[i].add(x);
            }
        }
        for(int i=0; i<n; i++){
            System.out.println("arr[" + i + "] = " +arr[i]);
        }
        for(int i = 0; i < n; i++) {
         for(int x : arr[i]) {
         System.out.print(x + " ");
    }
}
    }

}
