// Container With Most Water 

import java.util.*;
class Array_12{
    static int maxArea(int height[]){
        int n = height.length;
        int l = 0;
        int r = n-1;
        int area =0;
        while(l<r){
            int h = Math.min(height[l], height[r]);
            area = Math.max(area, (r-l)*h);
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return area;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int height[] = new int[n];
        for(int i=0; i<n; i++){
            height[i] =sc.nextInt();
        }
        System.out.println("Max Water can be contained is: " +maxArea(height));
    }
}