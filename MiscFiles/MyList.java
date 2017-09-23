public void MyList () {

    System.out.println("Please enter the text you wish to insert, or type \"end\" if you are done inserting.");
    String theString;
    theString = console.nextLine();

    while (!theString.equals("end")){
        newNode = new Node ();
        newNode.info = theString;
        newNode.next = null;

        if (first == null){
            first = newNode;
            last = newNode;
        } else if (current != null){
            Node p = new Node (current.info, current.next);
            current.info = newNode.info;
            current.next = p;
        }
        else {
            last.next = newNode;
            last = newNode;
        }

        System.out.println("Please enter the text you wish to insert, or type \"end\" if you are done inserting.");
        theString = console.nextLine();
    }   

	