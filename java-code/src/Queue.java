public class Queue {
    private Stack oneStack , twoStack;

    public Queue() {
        this.oneStack = new Stack();
        this.twoStack = new Stack();
    }

    public void enqueue(int data){
        oneStack.push(data);
    }

    public int dequeue(){

        while (!oneStack.isEmpty()){
            twoStack.push(oneStack.pop());
        }

        return  twoStack.pop();

    }

}
