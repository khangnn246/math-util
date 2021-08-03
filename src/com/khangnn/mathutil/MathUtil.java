/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.khangnn.mathutil;

/**
 *
 * @author khang
 */
public class MathUtil {

    public static void main(String[] args) {
        long result = MathUtil1.getFactorial(5); //hàm tính đi coi là mấy 
        System.out.println("expected: 5! = 120; actual: " + result);
        
        System.out.println("expected: 6! = 720; actual: " + MathUtil1.getFactorial(6));
        
        System.out.println("expected: 0! = 1; actual: " + MathUtil1.getFactorial(0));
        
        
        //MathUtil1.getFactorial(-5); Ném ngoại lệ thật rồi , ai biểu đưa cà chớn chi 
        //kĩ thuật kiểm thử phần mềm : ước lượng xem giá trị trả về của hàm là gì 
        //mày //hàm //ai đó viết khi chạy thực tế là mấy - actual , giả sử 120
        //if expected == actual, hàm ngon trong tình huống này 
    }
    
}
