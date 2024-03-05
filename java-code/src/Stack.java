public class Stack {
    private StackNode top;

    public Stack() {
        this.top = null;
    }

    public boolean isEmpty(){
        return  top == null;
    }

    public void push(int data){
        StackNode node = new StackNode(data);

        if(this.isEmpty()){
            this.top = node;
            return;
        }

        node.setNext(top);
        this.top = node;
    }


    public void display(){
        if (isEmpty()){
            return;
        }

        StackNode temp = top;

        do {
            System.out.print(temp.getData() + ",");
            temp = temp.getNext();

        }while (temp!=null);

    }

    public int peek (){
      return top.getData();
    }


    public int pop (){
        if (isEmpty()){
            return -111;
        }

        StackNode temp = top;
        top = null;
        top = temp.getNext();
        return temp.getData();

    }




}
