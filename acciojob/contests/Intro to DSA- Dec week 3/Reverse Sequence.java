
// Question Link - https://course.acciojob.com/idle?question=90271386-c126-4222-93a3-d0618311f997

import java.io.*;
import java.util.*;
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
class Main
{
    Node head;  
    Node tail;
	public void addToTheLast(Node node) 
	{
	  if (head == null) 
	  {
	   head = node;
	   tail = node;
	  } 
	  else 
	  {
	   tail.next = node;
	   tail = node;
	  }
	}
      void printList(Node head)
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
	public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N= Integer.parseInt(br.readLine());
        String S1[] = br.readLine().split(" ");
        Main llist = new Main(); 
        int a1=Integer.parseInt(S1[0]);
        Node head= new Node(a1);
        llist.addToTheLast(head);
        for (int i = 1; i < N; i++) 
        {
            int a = Integer.parseInt(S1[i]);
            llist.addToTheLast(new Node(a));
        }
        String S[] = br.readLine().split(" ");
        int l = Integer.parseInt(S[0]);
        int r = Integer.parseInt(S[1]);
        Solution ob = new Solution();
		Node newhead=ob.reverseSequence(llist.head, l, r);
		llist.printList(newhead);
    }}

class Solution
{
    public static Node reverseSequence(Node head, int left, int right)
    {
		  if(head == null || head.next ==null) return head ;

            Node dummy = new Node(0); 
            dummy.next = head;
            Node prev = dummy;
            for(int i =0 ; i<left - 1 ; i++ ){
                prev = prev.next;

            }

            Node curr = prev.next;

            for(int i =0 ; i<right-left;i++){
                Node temp = curr.next;
                curr.next = temp.next;
                temp.next = prev.next;
                prev.next = temp;

            }
            
            return dummy.next;
   
    }
}
