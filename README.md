1. An interesting problem encountered while printing Pattern6

  code snippet:
  
  <img width="598" height="270" alt="image" src="https://github.com/user-attachments/assets/6922c757-2931-4467-99c4-b4a5ceddb9c0" />
  
  output: 
  
  <img width="278" height="170" alt="image" src="https://github.com/user-attachments/assets/ea50840d-8339-4490-838c-1e758b90bc23" />
  
  explanation: notice the single qout (' ') in the print statement for printing space. In Java, '  ' is a character with ASCII value 32. 🤣 so for the output, it was just     adding 32 to the value of 'j'. To print the space, i had to use double quot (" "). 

2. An interesting and memory efficient way to calculate x^n which didn't know earlier (I mean I knew the theory behind it obviously but never applied it).

   We can devide x^n as x^n * x^n (n is even) or x^n * x^n *x *x (n is odd). Using this idea, stack height reduces to log(n) instead of n compared to the usual method.

   code snippet:
   ```java
   public int calcPower(int x, int n){//stack height = n
        if(n==0) return 1;
        if(x==0) return 0;
        return x * calcPower(x, n-1);
    }

    public int calcPower2(int x, int n){//stack height = log(n)
        if(n==0) return 1;
        if(x==0) return 0;
        int result = calcPower(x, n/2);
        if((n&1)==1) return x * result * result;
        else return result * result;
    }
   ```
