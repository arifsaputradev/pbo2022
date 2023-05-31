/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week09;
/**
 *
 * @author LENOVO
 */
public class OverdraftException extends Exception {
 private final double deficit;
 public OverdraftException(String msg, double deficit) {
 super(msg);
 this.deficit = deficit;
 }
 public double getDeficit(){
 return deficit;
 }
} 

