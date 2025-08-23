class Mystack{
    private int top = -1;
    private int arr[] = new int[1000];
    public void push(int data){
        if (top>=1000) {
            System.out.println("Stack Overflow");
        } else{
            arr[++top]=data;
        }
    }
    public int pop(){
        int x ;
        if(top<0){
            System.out.println("Stack UnderFlow");
            return -1; 
        }
        else{
            x = arr[top--];
        }
        return x;
    }
    public void printList(){
        for(int i =0;i<=top;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
public class Arraystack {
    public static void main(String args[]){
        Mystack List = new Mystack();
        List.push(45);11
        List.push(5);
        List.push(4);
        List.push(47);
        List.pop();
        List.pop();
        List.push(47);
        List.printList();
    }
}
