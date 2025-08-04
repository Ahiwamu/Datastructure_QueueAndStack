public class Major {
    private Stack cardStack;
    private Queue ticketQueue;
    public String brandName;

    public Major(String name) {
        //START FIX HERE
        this.brandName = name;
        //END FIX HERE
    }

    public void addGift(String giftId, String cardName) {
        //START FIX HERE
        GiftNode card = new GiftNode(giftId, cardName); //create new node to save data
        cardStack.push(card); //push new node to stack
        //END FIX HERE
    }

    public void addTicket(String tickId, String seatId) {
        //START FIX HERE
        TicketNode ticket = new TicketNode(tickId, seatId); //create new node to save data
        ticketQueue.push(ticket); //push new node to queue
        //END FIX HERE
    }


    public void processAll() {
        System.out.println("Processed all tickets and all gifts.");

        // START FIX HERE
        while () {
            // DO SOMETHING HERE
            
        }
        //END FIX HERE

        if (ticketQueue.top() != null) {
            System.out.println("The gift stack is empty, but there are still tickets in the queue.");
        } else {
            System.out.println("Finished!!! There is no remaining queue.");
        }
    }

    public void processOne() {
        // START FIX HERE
        if ( && ) {
            
        //END FIX HERE

            System.out.println("Processed one ticket and one gift.");
            ticket.printNode();
            gift.printNode();

        }
    }

    // NO NEED THIS FIX
    public void showStack() {
        GiftNode currentNode = cardStack.top();
        System.out.print("head ");

        while (currentNode != null) {
            System.out.print("-> ");
            currentNode.printNode();
            currentNode = currentNode.next;
        }
    }

    // NO NEED TO FIX
    public void showQueue() {

        TicketNode currentNode = ticketQueue.top();
        System.out.print("head ");
        while (currentNode != null) {
            System.out.print("-> ");
            currentNode.printNode();
            currentNode = currentNode.next;
            

        }

        System.out.println(" -> tail");
    }
}