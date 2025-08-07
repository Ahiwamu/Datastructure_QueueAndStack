public class Major {
    private Stack cardStack;
    private Queue ticketQueue;
    public String brandName;

    public Major(String name) {
        //START FIX HERE
        this.brandName = name;
        this.cardStack = new Stack();
        this.ticketQueue = new Queue();
        //END FIX HERE
    }

    public void addGift(String giftId, String cardName) {
        //START FIX HERE
        GiftNode card = new GiftNode(giftId, cardName); //create new node to save data
        this.cardStack.push(card); //push new node to stack
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
        while(cardStack.top() != null && ticketQueue.top() != null) {   //if card and ticket isn't empty
            // DO SOMETHING HERE
            TicketNode ticket = ticketQueue.top();
            GiftNode gift = cardStack.top();
            System.out.println("Ticket ID: " + ticket.tickId + ", Seat ID: " + ticket.seatId);
            System.out.println("Gift ID: " + gift.giftId + ", Card Name: " + gift.cardName);
            ticketQueue.pop();
            cardStack.pop();
            System.out.println("Ticket ID: " + ticket.tickId + ", Seat ID: " + ticket.seatId);
            System.out.println("Gift ID: " + gift.giftId + ", Card Name: " + gift.cardName);

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
        if (cardStack.top() != null && ticketQueue.top() != null) { //if card and ticket isn't empty
            TicketNode ticket = ticketQueue.top();
            GiftNode gift = cardStack.top();
            ticket.printNode();
            gift.printNode();
            ticketQueue.pop();
            cardStack.pop();
            
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
         System.out.println("");
        
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