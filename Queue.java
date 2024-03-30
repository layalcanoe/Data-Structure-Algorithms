public class Queue
{
    int n; 
    int j;
    Object a[]; 
    
    public Queue(){ 
        n=0;
        j=0; //pointer to mark beginning of the queue
        a= new Object[10];
    }

    public void enqueue(Object x ){  
       
        if(n==a.length){  
            resize();    
        }
        a[(j+n) % a.length] = x; //circular implementation O(1)
        n++; 
    } 
    
    public Object dequeue(){
        Object x= a[j];
        j=(j+1) % a.length;
        n=n-1;
        if(n<=a.length/3){  
            resize();    
        }
        return x;   
    } 

    public void resize(){
        Object b[]=new Object[2*n];
        for (int i=0; i<n; i++){ //loop n times copy elemnts in right position O(n)
            b[i]=a[(j+i)%a.length];
        }
        j=0;
        a=b;
    }
}
