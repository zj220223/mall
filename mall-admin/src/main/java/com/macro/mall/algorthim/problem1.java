package com.macro.mall.algorthim;

/**
 * @author 江昆
 * @date 2021年07月20日12:38
 */

import java.util.Stack;

/**
 * 设计一个有getmin功能的栈
 */
public class problem1 {
      private Stack<Integer> stackdata;
      private Stack<Integer> stacksmin;
      public problem1() {
          this.stackdata = new Stack<Integer>();
          this.stacksmin = new Stack<Integer>();
      }

      public void push(int newnum){
          if(this.stacksmin.isEmpty()){
              this.stacksmin.push(newnum);
          }else if(newnum <= this.getmin()){
              this.stacksmin.push(newnum);
          }
          this.stackdata.push(newnum);
      }

      public int pop(){
          if(this.stackdata.isEmpty()){
              try {
                  throw new RuntimeException("your stack is empty");
              } catch (Exception e) {
                  e.printStackTrace();
              }
          }
          int value = this.stackdata.pop();
          return value;
      }

      public int getmin(){
          if(this.stacksmin.isEmpty()){
              try {
                  throw new RuntimeException("your stack is empty");
              } catch (Exception e) {
                  e.printStackTrace();
              }
          }
          return this.stacksmin.peek();
      }


      public static void main(String[] args){
          //MyssS

      }
}
