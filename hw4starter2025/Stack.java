public class Stack {
  // Implement Stack using Linked List without tail
  GiftNode head;
  
  public void push(GiftNode node){
    //START FIX HERE
        if (this.isEmpty()){  //if stack is empty push to first node
            // Do something
            this.head = node;
            node.next = null;
        }else{  //if stack isn't empty push to first node by push node that is in stack to back
            // Do something else
            GiftNode cur = this.head;
            node.next = cur;
            this.head = node;
        }
    // END FIX HERE
  }
  
  public void pop(){
    //START FIX HERE
        if (!this.isEmpty()){  //if stack isn't empty
            // Do something
            GiftNode cur = this.head;
            if(cur.next == null){ //if stack have one node
              this.head = null; //remove that node
            }
            else{ //if stack have many node 
              this.head = cur.next; 
              cur.next = null;  //remove first node
            }

        }else{
            System.out.println("Error: Stack Underflow");
        }
    // END FIX HERE
  }
  
  public GiftNode top(){
    //START FIX HERE
    GiftNode cur = this.head;
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