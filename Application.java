/**
 * Application class for testing Node and LinkedList classes
 * @author Fanni Kertesz
 * @version 08/30/23
 */
public class Application
{
	public static void main(String[] args)
	{
		//new raw LinkedList object
		LinkedList myList=new LinkedList();
		
		//new raw Node object with integer data
		Node aNode=new Node();
		aNode.setData(314);
		myList.addNode(aNode);
		
		//new raw Node with string data
		aNode = new Node();
		aNode.setData("Word");
		myList.addNode(aNode);
		
		//printing out the data in the LinkedList
		Node tempnode=myList.getList();
		do 
		{
			System.out.println(tempnode.data);
			tempnode=tempnode.nextNode;
		} while (tempnode!=null);
			
		
		

	}//end main
}//end class
