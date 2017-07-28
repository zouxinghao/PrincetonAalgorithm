import java.util.Iterator;
import java.util.NoSuchElementException;


public class Deque<Item> implements Iterable<Item>  {

	private int N;
	private Node first,last;
	private class Node
	{
		private Item item;
		private Node next;
		private Node prev;
	}
	public Deque()                           // construct an empty deque
	{
		N = 0;
		first = null;
		last = null;
	}   
	public boolean isEmpty()                 // is the deque empty?
	{
		return N == 0;
	}   
	public int size()                        // return the number of items on the deque
	{
		return N;
	}   
	public void addFirst(Item item)          // add the item to the front
	{
		if(item == null)
			throw new java.lang.NullPointerException();
		Node OldFirst = first;
		first = new Node();
		first.item = item;
		first.prev = null;
		N++;
		 if (isEmpty()){  
			 last = first;  
	         first.next = null;  
	        }else{  
	         OldFirst.prev = first;  
	         first.next = OldFirst;  
	        }  
	}   
	public void addLast(Item item)           // add the item to the end
	{
		if(item == null)
			throw new java.lang.NullPointerException();
		Node OldLast = last;
		last = new Node();
		last.item = item;
		last.next = null;
		N++;
		if (isEmpty()){  
            first = last;  
            last.prev = null;  
        }else{  
            OldLast.next = last;  
            last.prev = OldLast;  
        }  
	}   
	public Item removeFirst()                // remove and return the item from the front
	{
		if(isEmpty())
			throw new NoSuchElementException();
		Item item = first.item;
		if(first.next != null)
			first.next.prev = null;
		first = first.next;
		N--;
		if(isEmpty())
			first = last = null;
		else
			first.prev = null;
		return item;
	}   
	public Item removeLast()                 // remove and return the item from the end
	{
		if(isEmpty())
			throw new NoSuchElementException();
		Item item = last.item;
		last = last.prev;
		if(last!=null)
			last.next = null;
		N--;
		if(isEmpty())
			last = first = null;
		else 
			last.next = null;
		return item;
	}   
	public Iterator<Item> iterator()         // return an iterator over items in order from front to end
	{
		return new DequeIterator();
	}
	
	private class DequeIterator implements Iterator<Item>{
		private Node current = first;
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return current != null;
		}

		@Override
		public Item next() {
			// TODO Auto-generated method stub
			if(!hasNext())
				throw new NoSuchElementException();
			Item item =current.item;
			current = current.next;
			return item;
		}
        @Override
        public void remove () {
              // TODO Auto-generated method stub
              throw new java.lang.UnsupportedOperationException ();
       }
		
	}
	public static void main(String[] args)   // unit testing (optional)
	{
		
	}
}
