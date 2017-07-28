import java.util.Iterator;
import java.util.NoSuchElementException;

import edu.princeton.cs.algs4.StdRandom;


public class RandomizedQueue<Item> implements Iterable<Item> {
	
	private int N = 0;
	private Item[] s;
	
	public RandomizedQueue()                 // construct an empty randomized queue
	{
		s = (Item[]) new Object[2];
	}
	private void Resize(int capacity)
	{
		Item[] copy = (Item[]) new Object[1];
		for(int i = 0; i<N; i++)
			copy[i] = s[i];
		s = copy;
	}
	public boolean isEmpty()                 // is the queue empty?
	{
		return N == 0; 
	}   
	public int size()                        // return the number of items on the queue
	{
		return N;
	}   
	public void enqueue(Item item)           // add the item
	{
		if(item == null)
			throw new java.lang.NullPointerException();
		if(N == s.length)
			Resize(s.length*2);
		s[N] = item;
		N++;
	}
	public Item dequeue()                    // remove and return a random item
	{
		if(isEmpty())
			throw new NoSuchElementException();
		int j = StdRandom .uniform (N);
        Item item = s[j];
        if(j != N-1)
        	s[j] = s[N-1];
        s[N-1] = null; //avoid loitering
        N--;
		if(N>0&&N == s.length/4)
			Resize(s.length/2);
		return item;
	}   
	public Item sample()                     // return (but do not remove) a random item
	{
		if(isEmpty())
			throw new NullPointerException();
		int random = StdRandom.uniform(N);
		return s[random];
	}   
	public Iterator<Item> iterator()         // return an independent iterator over items in random order
	{
		return new RandomizedQueueIterator();
	} 
	private class RandomizedQueueIterator implements Iterator<Item>
	{
		int n = N;
		Item[] shuffle = (Item[])new Object[n]; 
		public RandomizedQueueIterator(){
			for (int j=0; j<s.length; j++){  
                shuffle[j] = s[j]; 
			}
		}
		
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return n>0;
		}

		@Override
		public Item next() {
			// TODO Auto-generated method stub
			 if (!hasNext()) throw new java.util.NoSuchElementException();  
	            int index = (StdRandom.uniform(n));  
	            Item item = shuffle[index];  
	            if (index != n-1){  
	                shuffle[index] = shuffle[n-1];  
	            }  
	            shuffle[n-1] = null;                            // to avoid loitering  
	            n--;  
	            return item;  
		}
		@Override
		public void remove(){
			throw new java.lang.UnsupportedOperationException ();
		}
	}
	public static void main(String[] args)   // unit testing (optional)
	{
		
	}
}
