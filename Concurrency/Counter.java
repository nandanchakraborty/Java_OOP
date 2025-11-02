package Concurrency;

public class Counter {
    int i = 0;
    public void increment(){
        i++;
    }
     public int  get(){
        return i;
    }
}
/*
Now, one of the things that you would need to realize is i++ looks like a very, very simple operation, right.
But actually, when we look at it in depth, it's involving three operations.
What are those three operations?
The first thing is to get the value of i, increment, and the third one is to set the value of i.
Now, let's say this counter is shared between five threads.
What would happen if, let's say, two of them are trying to do the increment method and the first one has done the getI()
and the second one also has getI().
So, let's say the current value of i is 15.
The current value of i was 15, the first thread did a getI().
So, what does the value Thread1 get? It gets 15.
The second thread also at the same point did a getI().
So, what does it get? 15.
The first thread increments it.
So, what does the value become? 16, and it sets it to i.
So, the value of i at this point would be 16.
Now, the other thread now has the value of i as 15, so it would increment it as 16 and it would set the value of i as 16.
So, even though two threads have done the increment, from 15, the value should go to 17.
But what would be the value in i? It would be 16.
So, the thing is i++ is not really a thread-safe operation.
In the sense that, if I am executing the same method at multiple threads, there is a chance that some of the updates
might be missed.
This is called not thread-safe.
Thread-safety is when a method can be safely run by multiple threads at the same time.
However, this method is not thread-safe because there is a chance that an update to i might be lost, and that's where
we talked about synchronized.
So, if you put a keyword called synchronized, then only one thread at a point in time would be running this specific
 method.
So, if there are two threads trying to run this method, only one of them would be allowed at a time.
 */