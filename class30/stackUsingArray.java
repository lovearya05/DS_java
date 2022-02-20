public class stackUsingArray {
    public class CS401StackLinkedListImpl<E> implements CS401StackInterface<E> 
{
    private LinkEntry<E> head;
    private int num_elements;

    public CS401StackLinkedListImpl()
    {
        head = null;
        num_elements = 0;
    }

    public void setElement(LinkEntry<E> anElement){
        head = anElement;
    }

    /*Append the new element to the end of the list*/
    public void push(E e)
    {
        LinkEntry<E> temp = new LinkEntry<E>();
        temp.element = e;
        temp.next = head;
        head = temp;
    }

    /*Remove the most recently pushed element at the end of the list*/
    public E pop()
    {
        head.next = head;
        num_elements--;
        return (E) head;
    }

    public int size()
    {
        LinkEntry<E> temp = new LinkEntry<E>();
        for (temp = head; head != null; head = head.next)
            num_elements++;
        return num_elements;
    }

    public String toString()
    {
        String string = "";
        LinkEntry<E> temp = new LinkEntry<E>();
        for (temp = head; temp != null; temp = temp.next)
        {
            string += temp.element.toString() + "";
        }
        return string;
    }

/* ------------------------------------------------------------------- */
/* Inner classes                                                      */
    protected class LinkEntry<E>
    {
        protected E element;
        protected LinkEntry<E> next;

        protected LinkEntry() { element = null; next = null; }
    }
}urn num_elements;
}



