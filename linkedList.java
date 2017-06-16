/* Class linkedList */
class linkedList
{
    protected Node start;
    protected Node end ;
    public int size ;
 
    /*  Constructor  */
    public linkedList()
    {
        start = null;
        end = null;
        size = 0;
    }
    /*  Function to get size of list  */
    public int getSize()
    {
        return size;
    }
    /*  Function to append an element */
    public void appendElement(int val)
    {
        Node nptr = new Node(val,null);    
        size++ ;    
        if(start == null) 
        {
            start = nptr;
            end = start;
        }
        else 
        {
            end.setLink(nptr);
            end = nptr;
        }
    }
    /*  Function to delete an element at position  */
    public void deleteAtPos(int pos)
    {        
        if (pos == 1) 
        {
            start = start.getLink();
            size--; 
            return ;
        }
        if (pos == size) 
        {
            Node s = start;
            Node t = start;
            while (s != end)
            {
                t = s;
                s = s.getLink();
            }
            end = t;
            end.setLink(null);
            size --;
            return;
        }
        Node el = start;
        pos = pos - 1 ;
        for (int i = 1; i < size - 1; i++) 
        {
            if (i == pos) 
            {
                Node tmp = el.getLink();
                tmp = tmp.getLink();
                el.setLink(tmp);
                break;
            }
            el = el.getLink();
        }
        size-- ;
    }
    /*  Function to get start of list  */
    public Node getStart()
    {
        return start;
    }
    /*  Function to display elements  */
    public void display()
    {
        System.out.print("\nSingly Linked List: ");
        if (size == 0) 
        {
            System.out.print("empty\n");
            return;
        }    
        if (start.getLink() == null) 
        {
            System.out.println(start.getData() );
            return;
        }
        Node el = start;
        System.out.print(start.getData()+ "->");
        el = start.getLink();
        while (el.getLink() != null)
        {
            System.out.print(el.getData()+ "->");
            el = el.getLink();
        }
        System.out.print(el.getData()+ "\n");
    }
}