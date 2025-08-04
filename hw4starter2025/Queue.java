public class Queue {
  // Implement Queue using Linked List with tail
  TicketNode head;
  TicketNode tail;
  
  public void push(TicketNode node){
    //START FIX HERE
        if (head == null){ //if queue is empty push to first node
            // Do something (Empty list)
            this.head = node;
        }else{ //if queue isn't empty push to last node
            // Do something (Non-empty list)
            this.tail.next = node;
            this.tail = node;
        }
    //END FIX HERE
  }
  
  public void pop(){
    //START FIX HERE
        if (head != null){ //if queue isn't empty
            if (head != tail){  //if queue have many node pop first node
                // Do something (List of many nodes)
                TicketNode cur = this.head;
                this.head = cur.next;
                cur.next = null;
            }else{  //if queue have one node pop it
                // Do something (List of a single node)
                this.head = null;
                this.tail = null;
            }
        }else {
            System.out.println("Error: Queue Underflow");
        }
    //END FIX HERE
  }
  
  public TicketNode top(){
    //START FIX HERE
      return this.head; //return first node
    //END FIX HERE
  }
  
}
