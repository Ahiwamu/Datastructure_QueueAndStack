public class Stack {
  // Implement Stack using Linked List without tail
  GiftNode head;
  
  public void push(GiftNode node){
    //START FIX HERE
        if (this.isEmpty()){  //if stack is empty push to first node
            // Do something
            this.head = node;
        }else{  //if stack isn't empty push to last node
            // Do something else
            GiftNode cur = this.head;
            while(cur.next != null){  //set node cur to last node
              cur = cur.next;
            }
            cur.next = node;  //push new node to last node
        }
    // END FIX HERE
  }
  
  public void pop(){
    //START FIX HERE
        if (!this.isEmpty()){  //if stack isn't empty
            // Do something
            GiftNode cur = this.head;
            if(cur.next == null){ //if stack have one node
              this.head = null;
            }
            else{ //if stack have many node
              GiftNode nextnode = cur.next;
              while(nextnode.next != null){  //set node nextnode to last node
                cur = cur.next;
                nextnode = cur.next;
              }
              cur.next = null;  //pop last node
            }

        }else{
            System.out.println("Error: Stack Underflow");
        }
    // END FIX HERE
  }
  
  public GiftNode top(){
    //START FIX HERE
    GiftNode cur = this.head;
    while(cur.next != null){
      cur = cur.next;
    }
        return cur;
    // END FIX HERE
  }

  public Boolean isEmpty() {
    //START FIX HERE
    if(head == null) return true; //if stack is empty return true
    else return false;  //if stack isn't empty return false
    // END FIX HERE
  }

}