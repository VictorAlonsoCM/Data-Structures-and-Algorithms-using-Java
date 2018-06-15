public class LinkedListAlgorithm {

    public static void main(String[] args) {
         
    }
    
}

class Node <T extends Comparable <T>>{
    private T data;
    private Node <T> next;
    
    public Node(T data){
        this.data = data;
        setNext(null);
    }
    
    public Node<T> getNext(){
        return next;
    }
    
    public void setNext(Node <T> next){
        this.next = next;
    }
    
    public T getData(){
        return data;
    }

    @Override
    public String toString() {
        return String.valueOf(data); //To change body of generated methods, choose Tools | Templates.
    }
       
}

class LinkedList <T extends Comparable <T>> implements Cloneable {
    private Node <T> head = null;
    public LinkedList(){
        
    }
}
