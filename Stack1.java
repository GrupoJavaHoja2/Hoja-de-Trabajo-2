import java.util.*;

public class Stack1 implements ADTStack<Double>{
	private int i;
	private int j;
	private int res;
	private Vector<Double> myVector = new Vector<Double>(1,1);
	
	public Stack1(){	
		j = 1;
	}
	
	 public void empty(){
		 myVector.removeAllElements();
	 }
	 
	 public boolean isEmpty(){
			if (myVector.size() == 0){
				return true;
			}
			else{
				return false;
			}	
		}
	 
	 
	 public void push(double x) {
		
		}
	 
	 
	 public Double pop() throws Exception{
		
		 double p = myVector.remove(myVector.size());
		 return p;
		}
	 
		
	public int size(){
			return myVector.size();
		}
		
	
	public Double peek() throws Exception{
			return myVector.elementAt(j);
		}

	@Override
	public void push(Double x) {
		// TODO Auto-generated method stub
		 myVector.add(x);
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}

	public int getRes() {
		return res;
	}

	public void setRes(int res) {
		this.res = res;
	}
	
	
}