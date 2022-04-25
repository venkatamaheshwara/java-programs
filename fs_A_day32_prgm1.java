// DPS school will run school buses from one location to 
// differnt locations(ie routes) where 
// routes[i]=[locationA, locationB]
// Given n routes return the last stop location of the school bus. 

// input =3
// nagole uppal
// uppal habsiguda
// habsiguda nacharam

// output =nacharam
// Explanation: Starting at "nagole" busses will reach "nacharam" 
// which is the last stop. bus route consist of "nagole" -> "uppal" -> "habsiguda" -> "nacharam".


// input =3
// tarnaka narayanaguda
// uppal tarnaka
// narayanaguda mahenderahills
// output =mahenderahills

// Explanation: All possible routes are:
// uppal-> tarnaka -> narayanaguda->mahenderahills or
// tarnaka -> narayanaguda -> mahenderahills
// narayanaguda -> mahenderahills


import java.util.*;
public class fs_A_day32_prgm1 {
public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[][] routes=new String[n][2];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<2;j++){
                routes[i][j]=sc.next();
            }
        }
        System.out.print(get_last_loc(routes));
        sc.close();
    }    
    static String get_last_loc(String[][]rts){
        String res="";
        Map<String,String>hm=new HashMap<>();
        for(int i=0;i<rts.length;i++){
            for(int j=0;j<2;j++){
                hm.put(rts[i][0],rts[i][1]);
            }
        }
         for(int i=0;i<rts.length;i++){
            for(int j=0;j<2;j++){
               if(!hm.containsKey(rts[i][j])){
                   res= rts[i][j];
               }
            }
        }
        return res; 
        }
}
