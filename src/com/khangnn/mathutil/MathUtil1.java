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
//TA VIẾT CÁI CLASS ĐỂ CUNG CẤP TIỆN ÍCH CHO NƠI KHÁC XÀI MÀ KHI TA CUNG CẤP TIỆN ÍCH 
//CHO NƠI KHÁC XÀI LÀ LÚC TA KO CẦN NHỚ CÁI GÌ CHO RIÊNG TA , HÀM STATIC GIÚP TA LÀM 
//ĐIỀU NÀY 
public class MathUtil1 {
    //n! = 1.2.3.4.5.6....n
    //0! = 1! = 1
    //không tính được giai thừa cho số âm
    //20! là vừa khớp kiểu long , kiểu long tối đa là 18 số 0
    //21! là lố kiểu long
    //nếu đưa vào âm hay là 21! ta éo tính và ta đập vào mặt ai xài hàm này 1 
    //ngoại lệ 
    
    public static long getFactorial (int n){
        if (n < 0 || n > 20){
        throw new IllegalArgumentException("Invalid argument. N must be between 0 and 20");
        //hàm dừng liền éo cần return 
    }
        //xuống đây là n trong khoảng 0 đến 20 rồi
        if (n == 0 || n == 1){
            return 1; //dừng ngay khi n đặc biệt
        }
        //xuống đến đây , n = 2...20
        //chơi for hoặc chơi đệ quy - recursion
        //kỹ thuật ốc bu dồn thịt 
        //i = 2 , i = 3 i  = 4 i = 5 
        long product = 1; // nhồi 2 3 4 5 6 7 8 ...n
        for (int i = 2; i <= n; i++) {
            //product dang co nhan voi chinh con i 
            product *= i;
        }
        //nhân từ 2 đến i
        return product;
    }
}
