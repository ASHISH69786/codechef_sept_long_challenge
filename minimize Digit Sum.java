/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{

    public static void main(String []args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int t=Integer.parseInt(st.nextToken());
        while(t-->0){
            st=new StringTokenizer(br.readLine());
            int n=Integer.parseInt(st.nextToken());
            int l=Integer.parseInt(st.nextToken());
            int r=Integer.parseInt(st.nextToken());
            int min=Integer.MAX_VALUE;
            int bas=Integer.MAX_VALUE;
            int ans=0;
            int minVal=Integer.MAX_VALUE;
            if(r>n){
                System.out.println(r);
            }
            else if(l<n&&n<r){
                System.out.println(n);
            }
            else{
                for(int i=r;i>=l;i--) {
                if(minVal==1) break;
                int sum=0;
                int temp=n;
                while(temp>0){
                    sum+=temp%i;
                    temp/=i;
                    if(sum>minVal) break;
                }
                if(minVal>sum){
                    ans=i;
                    minVal=sum;
                }
                }
                System.out.println(ans);
            }
        }
    }
}
