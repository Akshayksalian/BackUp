package multiTreading.practiceQue;


import java.util.*;
public class Maruthi{
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        int[] arr = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        
        s.close();
        
        Count1 c = new Count1();
        
        Thread t1 = new Thread(){
            @Override
            public void run(){
                c.counting(0,n/2,arr);
            };
        };
        
        Thread t2 = new Thread(){
            @Override
            public void run(){
                c.counting(n/2,n,arr);
            };
        };
        
        t1.start();
        t2.start();
        
        try{
            t1.join();
            t2.join();
        } catch(Exception e){
            e.getMessage();
        }
        
        System.out.println("Winners : "+Count1.total);
    }
}

class Count1 extends Thread{
    
    static int total;
    
    public void counting(int start,int end,int[] arr){
        
        int result = 0;
        for(int i=start;i<end;i++){
            if(arr[i]==100)
                result++;
        }
        total+=result; 
        
    }
    
}