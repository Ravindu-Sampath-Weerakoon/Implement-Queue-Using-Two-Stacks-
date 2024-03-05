public class Main {
    public static void main(String[] args) {
        Stack myStack = new Stack();

//        myStack.push(4);
//        myStack.push(10);
//        myStack.push(11);
//
//        myStack.display();
//
//        System.out.println();
//        System.out.println(myStack.pop());
//        System.out.println();
//        System.out.println(myStack.pop());
//
//        myStack.display();


        Queue myQueue = new Queue();

        myQueue.enqueue(45);
        myQueue.enqueue(78);
        myQueue.enqueue(32);
        myQueue.enqueue(11);
        myQueue.enqueue(5);

        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());


    }
}
