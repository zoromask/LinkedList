import java.util.Scanner;

/*  Class SinglyLinkedList  */
public class SinglyLinkedList
{    
    public static void main(String[] args)
    {             
        Scanner scan = new Scanner(System.in);
        /* Create object of class linkedList */
        linkedList list = new linkedList(); 
        char ch;
        do
        {
            System.out.println("\nSingly Linked List Actions:\n");
            System.out.println("1. Insert at end");
            System.out.println("2. Remove tail element");
            System.out.println("3. Remove all elements that are greater than a target value");
            System.out.println("4. Exit program");
            int choice = scan.nextInt();            
            switch (choice)
            {
            case 1:
                System.out.println("Enter integer element to insert");
                list.appendElement( scan.nextInt() );
                ch = 'Y';
                break;                         
            case 2: 
                if (list.getSize() > 0) {
                    list.deleteAtPos(list.getSize());
                }
                ch = 'Y';
                break;
            case 3: 
                System.out.println("Enter target value");
                if (list.getSize() > 0) {
                    int targetNumber = scan.nextInt();
                    int i = 1;
                    Node el = list.getStart();
                    while (el.getLink() != null)
                    {
                        if (el.getData() > targetNumber) {
                            list.deleteAtPos(i);
                        }
                        else {
                            i++;
                        }
                        el = el.getLink();
                    }
                    if (el.getData() > targetNumber) {
                        list.deleteAtPos(i);
                    }
                }
                ch = 'Y';
                break;
            case 4: 
                ch = 'N';
                break;
            default :
                ch = 'Y';
                break;   
            }
            /*  Display List  */ 
            list.display();
            System.out.print("----------------------------------------");
        } while (ch == 'Y'|| ch == 'y');
    }
}