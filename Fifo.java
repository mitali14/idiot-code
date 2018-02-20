import java.util.*;

class FIFO{
	public static void main(String args[]){
		int page_frame_no,page_size,i;
		int[] page_number = new int[10];
		int[] page_frame =new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.print("\nENTER PAGE FRAME : ");
		page_frame_no=sc.nextInt();
		
		System.out.print("\nENTER PAGE SIZE : ");
		page_size=sc.nextInt();
		System.out.println("\nENTER PAGE NUMBER : ");
		for(i=0;i<page_size;i++)
		{
			page_number[i]=sc.nextInt();
		
		}
		//initialise each frame with 0
		for(i=0;i<page_frame_no;i++)
		{
			page_frame[i]=-1;
		}
		for(i=0;i<page_frame_no;i++)
		{
			System.out.print("frame"+i);
			if(page_frame[i]==-1)
			{
				System.out.print("  "+page_frame[i]);
			}
		}		
	
	}
}
