package mind.core.java;
 
class Table{  
	 void printTable(int n){  	
	  System.out.println("I am into this printTable method" + Thread.currentThread().getName());
	  System.out.println(Thread.currentThread().getName()+ "   >> " + Thread.currentThread().getState());  
	  synchronized(this){//synchronized block  : this means to current context
	     for(int i=1;i<=5;i++){  
	      System.out.println(n*i);  
	      try{  
	       Thread.sleep(1000);  
	      }catch(Exception e){System.out.println(e);}  
	     }  
	   }  	   
	 }//end of the method  
	}  

 
 
	class MyThread1 extends Thread{  
	Table t;  
	MyThread1(Table t){  
		this.t=t;  
	}  
	public void run(){  
		System.out.println("Into the MyThread1 run() method");
		t.printTable(5);  
	}  	  
	}  

	class MyThread2 extends Thread{  
	Table t;  
	MyThread2(Table t){  
		this.t=t;  
	}  
	public void run(){  
		System.out.println("Into the MyThread2 run() method");
		t.printTable(100);  
	 }  
	}  
public class sync{  
	public static void main(String args[]){  
	Table obj = new Table();//only one object  
	MyThread1 t1=new MyThread1(obj);  
	MyThread2 t2=new MyThread2(obj);  
	t1.setName("Table - A");
	t2.setName("Table - B");
	t1.start();  
	t2.start();  
	}  
	}  