package OOPS3;

public class LinkedList {

  private Node head;

  public LinkedList() {
    this.head = null;
  }

  public void add(int data) {
    Node node = new Node(data);
    if (head==null) {
      head = node;
    }
    else {
      Node curr = head;
      while (curr.getNext() != null) {
          curr = curr.getNext();
      }
      curr.setNext(node);
    }
  }

  public void delete(int data) {
    // Deleting Node with given data from the ll
  }
}
